
package psp_parkink;

public class Psp_parkink {
    
    static boolean entrar = false;

    public static void main(String[] args){
        
        Parking parking = new Parking(14);
        
        EntradaSalida cocche1 = new EntradaSalida(parking, 0234441);
        EntradaSalida cocche2 = new EntradaSalida(parking, 6344544);
        EntradaSalida cocche3 = new EntradaSalida(parking, 6578889);
        
        cocche1.start();
        cocche2.start();
        cocche3.start();
        
        
        
    }
    
}
