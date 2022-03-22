package EXAMENTEMA5;

public class Chirigota extends Agrupacion implements Callejera,Caminito_del_falla{
    private int numCuplés;
    private int puntosObtenidos;

    public Chirigota(String nombre, String autor, String autorMusica, String autorLetra, String tipo, int numCuplés, int puntosObtenidos) {
        super(nombre, autor, autorMusica, autorLetra, tipo);
        this.numCuplés = numCuplés;
        this.puntosObtenidos = puntosObtenidos;
    }

    @Override
    public void cantar_la_presentacion() {
        System.out.println("Cantando la presentación de la Chirigota con nombre: "+ this.getNombre());

    }

    @Override
    public void hacer_tipo() {
        System.out.println("La chirigota: "+ this.getNombre() +" va de: "+ this.getTipo());

    }

    @Override
    public void amo_a_escuchar() {
        System.out.println("Amo a escucha la Chirigota: "+this.getNombre());
    }

    @Override
    public void caminito_del_falla() {
        System.out.println("La chirigota: "+ this.getNombre() + " va caminito del falla");

    }

    @Override
    public String toString() {
        return "Chirigota{" +
                "numCuplés=" + numCuplés +
                ", puntosObtenidos=" + puntosObtenidos +
                '}';
    }
}
