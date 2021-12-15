import java.util.Arrays;

public class Ej02 {
    public static void main(String[] args) {

    }
    public static int[] insertarValor(int[] vector,int valor, int pos){
        int[] resultado = new int[0];
        for (int i = 0; i < vector.length; i++) {
            vector[i]=(int) (Math.random()*100);
        }
        for (int i = 0; i < vector.length; i++) {
            if (valor==vector[i]){

                //Arrays.copyOf(resultado.length,vector.length+1);
            }
        }
        return resultado;
    }
}
