package psp_parkink;

import java.util.logging.Level;
import java.util.logging.Logger;
import static psp_parkink.Psp_parkink.entrar;

public class EntradaSalida extends Thread {

    Parking parking;    
    int matricula;
    String plazas = "PLAZAS: ";

    public EntradaSalida(Parking parking, int matricula) {
        this.parking = parking;
        this.matricula = matricula;
    }

    public synchronized void run() {
        
        while (entrar == true) {
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(EntradaSalida.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        entrar = true;
        for (int i = 0; i < parking.getPlazas().length; i++) {
            if (parking.getPlazas()[i]==0){
                System.out.println("ENTRADA: Cocche "+matricula+" || Plaza "+parking.getPlazas()[i]);
                parking.getPlazas()[i] = matricula;
                break;
            }
        }
        
        for (int i = 0; i<parking.getPlazas().length; i++){
            plazas = plazas + "["+parking.getPlazas()[i]+"]";
        }
        System.out.println(plazas);
        String plazas = "PLAZAS: ";
        entrar = false;
        notify();
        
    }

}
