package PRACTICAS_ENTREGABLES_TEMA3;

import java.util.Arrays;
import java.util.Scanner;

public class ej03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int longitud;
        int max = 18;
        int min = 65;
        int suma = 0;
        int contador = 0;

        System.out.println("Introduce el tamaño de la tabla (n*n):");
        longitud = teclado.nextInt();

        int[][] vector = new int[longitud][longitud];
        int[] diagonal = new int[longitud];

        for (int i = 0; i < vector.length; i++) {
            for (int j = 0; j < vector[i].length; j++) {
                vector[i][j] = (int)(Math.random() * (65-18) + 18);

                if (i == j){

                    diagonal[i] = vector[i][j];

                    if (vector[i][j] <= min){
                        min = vector[i][j];
                    }

                    if (vector[i][j] >= max){
                        max = vector[i][j];
                    }

                    suma += vector[i][j];
                    contador++;
                }
            }
            System.out.println(Arrays.toString(vector[i]));
        }

        double media = suma / contador;

        System.out.println("Los números de la diagonal son: ");
        System.out.println(Arrays.toString(diagonal));
        System.out.println();
        System.out.println("El valor máximo en la diagonal es: " + max);
        System.out.println("El valor mínimo en la diagonal es: " + min);
        System.out.println("El valor medio de la diagonal: " + media);
    }
}