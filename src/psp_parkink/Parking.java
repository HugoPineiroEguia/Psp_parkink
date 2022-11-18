package psp_parkink;

public class Parking {

    int[] plazas;

    public Parking(int numPlazas) {
        plazas = new int[numPlazas];
        for (int i = 0; i<plazas.length; i++){
            plazas[i] = 0;
        }
    }

    public int[] getPlazas() {
        return plazas;
    }
 

}
