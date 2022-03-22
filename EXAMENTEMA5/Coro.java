package EXAMENTEMA5;

public class Coro extends Agrupacion implements Caminito_del_falla{
    private int numBandurrias;
    private int numGuitarras;
    private int puntosObtenidos;

    public Coro(String nombre, String autor, String autorMusica, String autorLetra, String tipo, int numBandurrias, int numGuitarras, int puntosObtenidos) {
        super(nombre, autor, autorMusica, autorLetra, tipo);
        this.numBandurrias = numBandurrias;
        this.numGuitarras = numGuitarras;
        this.puntosObtenidos = puntosObtenidos;
    }

    @Override
    public void cantar_la_presentacion() {
        System.out.println("Cantando la presentación del Coro con nombre: "+ this.getNombre());
    }

    @Override
    public void hacer_tipo() {
        System.out.println("El coro: "+ this.getNombre() +" va de: "+ this.getTipo());

    }

    @Override
    public void caminito_del_falla() {
        System.out.println("El coro: "+ this.getNombre() + " va caminito del falla");
    }

    @Override
    public String toString() {
        return "Coro{" +
                "numBandurrias=" + numBandurrias +
                ", numGuitarras=" + numGuitarras +
                ", puntosObtenidos=" + puntosObtenidos +
                '}';
    }
}
