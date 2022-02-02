package Entregable21_22_POO;

public class uso {
    public static void main(String[] args) {
        Opositor a=new Opositor("Juan","marquez",2001,true);
        Opositor b=new Opositor("Carlos","sdffsd",2000,false);


        System.out.println(a.numAdaptaciones(a,b));

        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println("Hay "+ a.numOpositores(a)+" opositores");

        Examen A=new Examen();
        System.out.println(A.getFechaEx());
        System.out.println();

        sedes uno=new sedes("1111223","Sevilla",2);
        sedes dos=new sedes("2323442","España",1);


        Preguntas_Examen pre1=new Preguntas_Examen("Selecciona la opcion correcta", new String[]{"Verdadero", "Falso"});
        Preguntas_Examen pre2=new Preguntas_Examen("Selecciona",new String[]{"Verdadero","Falso"});
    }
}
