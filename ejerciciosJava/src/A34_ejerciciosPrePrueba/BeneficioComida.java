package A34_ejerciciosPrePrueba;

import java.util.HashSet;

public class BeneficioComida extends  Beneficio implements  BeneficiosAcumulables{
    private HashSet<String> comida;

    public BeneficioComida(String nombre, String nombreCreador, HashSet<String> comida) {
        super(nombre, nombreCreador);
        this.comida = comida;
    }
    public void agregarse(HashSet<Beneficio> beneficios,HashSet<BeneficiosAcumulables> beneficiosAcumulables){
        beneficiosAcumulables.add(this);
    }

    @Override
    public double calcularDescuentoExtra() {
        return 4500;
    }
}
