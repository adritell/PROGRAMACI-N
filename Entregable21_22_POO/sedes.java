package Entregable21_22_POO;

public class sedes {
    private String CodSede;
    private String Ciudad;
    private int MaxOpos;

    public sedes(String codSede, String ciudad, int maxOpos) {
        CodSede = codSede;
        Ciudad = ciudad;
        MaxOpos = maxOpos;
    }

    public String getCodSede() {
        return CodSede;
    }

    public void setCodSede(String codSede) {
        CodSede = codSede;
    }

    public String getCiudad() {
        return Ciudad;
    }


    public int getMaxOpos() {
        return MaxOpos;
    }

    public void setMaxOpos(int maxOpos) {
        MaxOpos = maxOpos;
    }
    public void capitalA(String ciudadd){
        this.Ciudad=ciudadd;
        String[] ciudades= {"Almería", "Cádiz", "Córdoba", "Granada", "Huelva", "Jaén", "Málaga", "Sevilla"};
        boolean escapital;
        for (int i = 0; i < ciudades.length; i++) {
            if (ciudadd!=ciudades[i]){
                System.out.println("No es una capital Andaluza.");
            }else{
                escapital=true;
            }
        }

    }


}
