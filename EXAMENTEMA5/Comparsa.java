package EXAMENTEMA5;

public class Comparsa extends Agrupacion implements Caminito_del_falla{
    private String empreAtrezzo;
    private int puntosObtenidos;

    public Comparsa(String nombre, String autor, String autorMusica, String autorLetra, String tipo, String empreAtrezzo, int puntosObtenidos) {
        super(nombre, autor, autorMusica, autorLetra, tipo);
        this.empreAtrezzo = empreAtrezzo;
        this.puntosObtenidos = puntosObtenidos;
    }

    @Override
    public void cantar_la_presentacion() {
        System.out.println("Cantando la presentación de la Comparsa con nombre: "+ this.getNombre());
    }

    @Override
    public void hacer_tipo() {
        System.out.println("La comparsa: "+ this.getNombre() +" va de: "+ this.getTipo());

    }

    @Override
    public void caminito_del_falla() {
        System.out.println("La comparsa: "+ this.getNombre() + " va caminito del falla");

    }

    @Override
    public String toString() {
        return "Comparsa{" +
                "empreAtrezzo='" + empreAtrezzo + '\'' +
                ", puntosObtenidos=" + puntosObtenidos +
                '}';
    }
}
