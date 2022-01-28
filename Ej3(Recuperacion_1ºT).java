package examen;

import java.util.Arrays;
import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduce la dimensión del primer vector: ");
        int dVector1= teclado.nextInt();
        System.out.println("Introduce la dimensión para el segundo vector");
        int dVector2= teclado.nextInt();
        int[] vector1=new int[dVector1];
        int[] vector2=new int[dVector2];
        teclado = new Scanner(System.in);
        for (int i = 0; i < vector1.length; i++) {
            System.out.println("Rellene los valores para el primer vector: ");
            vector1[i]= teclado.nextInt();
        }
        for (int i = 0; i < vector2.length; i++) {
            System.out.println("Rellene los valores para el segundo vector: ");
            vector2[i]= teclado.nextInt();
        }
        int[] vector3=new int[dVector1];
        System.out.println(minimoVectores(vector1,vector2,vector3));
    }
    public static int[] minimoVectores(int[] v1, int[] v2,int[] v3){
        Scanner teclado=new Scanner(System.in);


        for (int i =0; i <v1.length ; i++) {

            for (int j = 0; j <v2.length; j++) {
                int num=Math.min(v1[i],v2[i]);
                int num2=Math.min(v1[j],v2[j]);
                for (int k = 0; k <v3.length; k++) {

                    v3[k]=Math.min(num,num2);

                }


            }

        }
        System.out.println(Arrays.toString(v3));
        return v3;
    }
    }
