package PRACTICAS_ENTREGABLES_TEMA3;
import java.util.Arrays;

public class EJ01 {
    public static void main(String[] args) {
        int[] v1 ={1,2,3,6,9,11,31,39};
        int[] v2 ={1,11,31,5};


        System.out.println("Los valores que se repiten en ambos vectores son: " + Arrays.toString(interseccionVectores(v1, v2)));

    }

    public static int[] interseccionVectores (int[] vector1, int[] vector2){

        int[] solucion = new int[0];

        for (int i = 0; i < vector1.length; i++) {
            for (int j = 0; j < vector2.length; j++) {
                if (vector1[i] == vector2[j]){
                    solucion = Arrays.copyOf(solucion, solucion.length + 1);
                    solucion[solucion.length - 1] = vector1[i];
                }
            }
        }

        Arrays.sort(solucion);

        return solucion;
    }

}