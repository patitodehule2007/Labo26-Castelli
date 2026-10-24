package A34_ejerciciosPrePrueba;

import java.util.HashSet;

public class BeneficioGaseosa extends  Beneficio implements  BeneficiosAcumulables{
    private HashSet<String> gaseosas;

    public BeneficioGaseosa(String nombre, String nombreCreador, HashSet<String> gaseosas) {
        super(nombre, nombreCreador);
        this.gaseosas = gaseosas;
    }

    public void agregarse(HashSet<Beneficio> beneficios,HashSet<BeneficiosAcumulables> beneficiosAcumulables){
        beneficiosAcumulables.add(this);
    }

    @Override
    public double calcularDescuentoExtra() {
        return 1000;
    }
}
