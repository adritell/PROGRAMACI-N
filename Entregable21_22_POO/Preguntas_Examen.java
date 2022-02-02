package Entregable21_22_POO;

public class Preguntas_Examen {
    private String Enunciado;
    private String[] Opciones=new String[2];

    public Preguntas_Examen(String enunciado, String[] opciones) {
        Enunciado = enunciado;
        Opciones = opciones;
    }

    public String getEnunciado() {
        return Enunciado;
    }

    public void setEnunciado(String enunciado) {
        Enunciado = enunciado;
    }

    public String[] getOpciones() {
        return Opciones;
    }

    public void setOpciones(String[] opciones) {
        Opciones = opciones;
    }
}

