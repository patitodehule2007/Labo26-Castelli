package A34_ejerciciosPrePrueba;

import java.util.HashSet;

public class BeneficioTrago extends Beneficio{
    private HashSet<String> tragos;

    public BeneficioTrago(String nombre, String nombreCreador, HashSet<String> tragos) {
        super(nombre, nombreCreador);
        this.tragos = tragos;
    }
}
