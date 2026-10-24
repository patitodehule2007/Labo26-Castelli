package A34_ejerciciosPrePrueba;

import java.util.HashSet;

public abstract class Beneficio {
    private  String nombre;
    private String nombreCreador;

    public Beneficio(String nombre, String nombreCreador) {
        this.nombre = nombre;
        this.nombreCreador = nombreCreador;
    }

    public void agregarse(HashSet<Beneficio> beneficios,HashSet<BeneficiosAcumulables> beneficiosAcumulables){
        beneficios.add(this);
    }
}
