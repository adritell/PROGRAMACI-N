package PRACTICAS_ENTREGABLES_TEMA3;

public class ej02 {
    public static void main(String[] args) {

        int[] numeros = new int[20];
        int[] cuadrado = new int[20];
        int[] cubo = new int[20];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int)(Math.random() * 101);
        }

        for (int i = 0; i < cuadrado.length; i++) {
            cuadrado[i] = numeros[i] * numeros[i];
            cubo[i] = numeros[i] * numeros[i] * numeros[i];
        }

        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
            System.out.print(cuadrado[i] + " ");
            System.out.println(cubo[i]);
        }
    }
}
