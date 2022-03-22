package EXAMENTEMA5;

public class Romancero  extends Agrupacion implements Callejera{

    private String tematicaCartelon;

    public Romancero(String nombre, String autor, String autorMusica, String autorLetra, String tipo, String tematicaCartelon) {
        super(nombre, autor, autorMusica, autorLetra, tipo);
        this.tematicaCartelon = tematicaCartelon;
    }

    @Override
    public void cantar_la_presentacion() {
        System.out.println("Cantando la presentación del Romancero con nombre: "+ this.getNombre());

    }

    @Override
    public void hacer_tipo() {
        System.out.println("El Romancero: "+ this.getNombre() +" va de: "+ this.getTipo());

    }

    @Override
    public void amo_a_escuchar() {
        System.out.println("Amo a escucha el romancero: "+this.getNombre());

    }

    @Override
    public String toString() {
        return "Romancero{" +
                "tematicaCartelon='" + tematicaCartelon + '\'' +
                '}';
    }
}
