package Entregable21_22_POO;

public class Opositor {
    private String Nombre;
    private String Apellidos;
    private int AnioNac;
    private boolean Adaptacion;
    private String DescAdaptacion;
    private int contador = 0;
    private int contadorA = 0;

    public Opositor(String nombre, String apellidos, int anioNac, boolean adaptacion) {
        Nombre = nombre;
        Apellidos = apellidos;
        AnioNac = anioNac;
        Adaptacion = adaptacion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        this.Apellidos = apellidos;
    }

    public int getAnioNac() {
        return AnioNac;
    }

    public void setAnioNac(int anioNac) {
        this.AnioNac = anioNac;
    }

    public boolean isAdaptacion() {
        return Adaptacion;
    }

    public void setAdaptacion(boolean adaptacion) {
        this.Adaptacion = adaptacion;
    }

    public String getDescAdaptacion() {
        return DescAdaptacion;
    }

    public void setDescAdaptacion(String descAdaptacion) {
        this.DescAdaptacion = descAdaptacion;
    }

    public int numOpositores(Opositor a) { // metodo que cuenta cuantos opositores hay
        contador++;
        return contador;
    }

    public String numAdaptaciones(Opositor a, Opositor b) {
        if (a.isAdaptacion() && b.isAdaptacion()) {
            contadorA = 2;
            return "Hay " + contadorA + " adaptaciones";
        }
        if (a.isAdaptacion() == false && b.isAdaptacion() == true) {
            contadorA = 1;
            return "Hay " + contadorA + " adaptaciones";
        }
        if (a.isAdaptacion() == true && b.isAdaptacion() == false) {
            contadorA = 1;
            return "Hay " + contadorA + " adaptaciones";

        } else {
            return "No hay adaptaciones";
        }


    /*public int numOpositores(String nombre){
        int contador;
        this.Nombre=nombre;

    }*/

    }

    @Override
    public String toString() {
        return "Opositor{" +
                "Nombre='" + Nombre + '\'' +
                ", Apellidos='" + Apellidos + '\'' +
                ", AnioNac=" + AnioNac +
                ", Adaptacion=" + Adaptacion +
                ", DescAdaptacion='" + DescAdaptacion + '\'' +
                '}';
    }
}
