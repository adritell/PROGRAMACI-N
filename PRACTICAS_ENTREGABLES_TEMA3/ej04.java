package PRACTICAS_ENTREGABLES_TEMA3;

import java.util.Arrays;
import java.util.Scanner;


public class ej04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int desplazamiento, filas, columnas;

        System.out.println("Introduce las dimensiones de la tabla: ");
        filas = teclado.nextInt();
        columnas=filas;


        int[][] tabla = new int[filas][columnas];

        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                tabla[i][j] = (int) (Math.random() * 21);
            }
        }

        for (int[] row : tabla) {
            System.out.println(Arrays.toString(row));
        }

        System.out.println();
        System.out.println("Introduce el número de columnas a desplazar el vector:");
        desplazamiento = teclado.nextInt();


        System.out.println("El vector desplazado " + desplazamiento + " quedaría en:");
        for (int[] row : desplazarMatriz(tabla, desplazamiento)) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static int[][] desplazarMatriz(int[][] vector, int desplazamientos) {

        int[][] desplazada = new int[vector.length][vector[1].length];

        while (desplazamientos >= vector[1].length) {
            desplazamientos -= vector[1].length;
        }

        for (int i = 0; i < vector.length; i++) {
            for (int j = 0; j < vector[i].length; j++) {
                if (j + desplazamientos < vector[i].length) {
                    desplazada[i][j + desplazamientos] = vector[i][j];
                } else {
                    desplazada[i][j + desplazamientos - vector[i].length] = vector[i][j];
                }
            }
        }

        return desplazada;
    }
}