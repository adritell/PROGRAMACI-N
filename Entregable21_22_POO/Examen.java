package Entregable21_22_POO;

import java.util.*;

public class Examen {
    private Date FechaEx;
    private String Consejeria;
    private String URL;


    public Date getFechaEx() {
        return FechaEx;
    }

    public void setFechaEx(Date fechaEx) {
        FechaEx = fechaEx;
        fechaEx=GregorianCalendar.getInstance().getTime();
        System.out.println("Fecha examen : "+fechaEx.getTime());
    }

    public String getConsejeria() {
        return Consejeria;
    }

    public void setConsejeria(String consejeria) {
        Consejeria = consejeria;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }
}
