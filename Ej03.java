import java.util.Scanner;

public class Ej03 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduzca las dimensiones para su tabla:");
        int filas= teclado.nextInt();
        int columnas= filas;
        int[][] tabla=new int[filas][columnas];
        int valor=numPicos(tabla);
        System.out.println(valor);
    }
    public static int numPicos(int[][] vecinos){

        int vecinosA=0;
        for (int i = 0; i < vecinos.length; i++) {
            System.out.println();
            for (int j = 0; j < vecinos[i].length; j++) {
                vecinos[i][j]=(int) (Math.random()*(200-100)+100);
                System.out.print(vecinos);

            }
        }
        return vecinosA;
    }
}
