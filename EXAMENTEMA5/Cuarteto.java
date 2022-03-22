package EXAMENTEMA5;

public class Cuarteto extends Agrupacion implements Callejera,Caminito_del_falla{
    private int numMiembros;
    private int puntosObtenidos;


    public Cuarteto(String nombre, String autor, String autorMusica, String autorLetra, String tipo, int numMiembros, int puntosObtenidos) {
        super(nombre, autor, autorMusica, autorLetra, tipo);
        this.numMiembros = numMiembros;
        this.puntosObtenidos = puntosObtenidos;
    }

    @Override
    public void cantar_la_presentacion() {
        System.out.println("El cuarteto: "+ this.getNombre() +" va de: "+ this.getTipo());

    }

    @Override
    public void hacer_tipo() {

    }

    @Override
    public void amo_a_escuchar() {
        System.out.println("Amo a escucha el cuarteto: "+this.getNombre());
    }

    @Override
    public void caminito_del_falla() {
        System.out.println("El cuarteto: "+ this.getNombre() + " va caminito del falla");

    }

    @Override
    public String toString() {
        return "Cuarteto{" +
                "numMiembros=" + numMiembros +
                ", puntosObtenidos=" + puntosObtenidos +
                '}';
    }
}
