package EXAMENTEMA5;

import java.util.Arrays;

public abstract class COAC extends Agrupacion{
    private AgrupacionOficial[] agrupacion;

    public COAC(String nombre, String autor, String autorMusica, String autorLetra, String tipo) {
        super(nombre, autor, autorMusica, autorLetra, tipo);
        this.agrupacion = agrupacion;
        AgrupacionOficial[] agrupacion=new AgrupacionOficial[0];

    }

    public void inscribir_agrupacion(AgrupacionOficial agrupacion1){
        for (int i = 0; i < agrupacion.length; i++) {
            agrupacion= Arrays.copyOf(agrupacion,agrupacion.length+1);
            agrupacion[agrupacion.length-1] = agrupacion1 ;
        }
    }

    public boolean eliminar_agrupacion(AgrupacionOficial agrupacion1) {
        boolean esta = false;
        if (agrupacion1.getNombre().equals(this.getNombre())) {
            esta = true;
            agrupacion= Arrays.copyOf(agrupacion,agrupacion.length-1);
            agrupacion[agrupacion.length] = agrupacion1 ;
            return true;
        } else if (!agrupacion1.getNombre().equals(this.getNombre())) {
            esta = false;
        }


        return esta;
    }

    @Override
    public String toString() {
        return "COAC{" + "agrupacion=" + Arrays.toString(agrupacion) +
                '}';
    }
}
