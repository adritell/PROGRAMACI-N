public class Ej04 {
    public static void main(String[] args) {
        int[][] tabla=new int[4][4];
        int[][] columnas=eliminarColumnasPares(tabla);
        System.out.println(columnas);

        int[][] filas=eliminarFilasPares(tabla);
        System.out.println(filas);

    }
    public static int[][] eliminarColumnasPares(int[][] eliminadasColumnas){
        int filas=4;
        int columnas=4;
        boolean espar;
        int[][] eliminar=new int[filas][columnas];
        for (int i = 0; i < eliminar.length; i++) {
            System.out.println();
            for (int j = 0; j < eliminar[i].length; j++) {
                eliminar[i][j]=(int) (Math.random()*100);
                System.out.print(eliminar);
                //if (eliminar[i][j]==eliminar[1][0] || eliminar[i][j]==eliminar[3][0])
            }

        }
        for (int i = 0; i < eliminar.length; i++) {
            for (int j = 0; j < eliminar[i].length; j++) {
                //if (eliminar[1].length)
            }

        }
        return eliminar;
    }
    public static int[][] eliminarFilasPares(int[][] eliminadasFilas){
        int filas=4;
        int columnas=4;
        int[][] eliminarF=new int[filas][columnas];

        return eliminarF;
    }
}
