package EXAMENTEMA5;

import java.util.Arrays;

public class AgrupacionOficial extends Integrante{
    private Integrante[] integrante;

    public AgrupacionOficial(int numParticipante, String nombre, int edad, String localidad) {
        super(numParticipante, nombre, edad, localidad);
        Integrante[] integrante=new Integrante[0];
    }

    public void insertar_integrante(Integrante integrante1){
        if (integrante1.getNumParticipante()!=this.getNumParticipante()){
            for (int i = 0; i < integrante.length; i++) {
                integrante= Arrays.copyOf(integrante,integrante.length+1);
                integrante[integrante.length-1] = integrante1 ;
                System.out.println("Se añadio con exito");
            }
        } else{
            System.out.println("No se puede añadir al participante "+ this.getNumParticipante()+ " , porque ya está registrado");
        }

    }

    @Override
    public String toString() {
        return "AgrupacionOficial{" +
                "integrante=" + Arrays.toString(integrante) +
                '}';
    }

    public boolean eliminar_integrante(Integrante integrante1){
        boolean eliminar;
        if (integrante1.getNumParticipante()==this.getNumParticipante()){
            eliminar=true;
            for (int i = 0; i < integrante.length; i++) {
                integrante= Arrays.copyOf(integrante,integrante.length-1);
                integrante[integrante.length-1] = integrante1;
                System.out.println("Se ha eliminado correctamente al participante "+this.getNumParticipante());
                return true;
            }
        } else {
            eliminar=false;
        }
        return false;


    }



}
