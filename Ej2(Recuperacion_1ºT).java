package examen;

import java.util.Arrays;
import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int pos;
        int num;
        int valorNuevo;
        System.out.println("Introduzca la dimensión del número: ");
        num= teclado.nextInt();
        System.out.println("Introduzca la posición en la que quiere introducir el nuevo número");
        pos= teclado.nextInt();
        int[] aux= new int[num];

        for (int i = 0; i < num; i++) {
            System.out.println("Introduzca los números de uno en uno: ");
            aux[i]= teclado.nextInt();
            System.out.println(Arrays.toString(aux));
        }
        for (int i = 0; i < aux.length; i++) {
            for (int j = pos; j < aux.length; j++) {
                if (i==j){
                    System.out.println("Introduzca un nuevo valor:");
                    valorNuevo= teclado.nextInt();
                    aux[pos-1]= valorNuevo;
                }
            }
        }
        System.out.println(Arrays.toString(aux));

    }
}
