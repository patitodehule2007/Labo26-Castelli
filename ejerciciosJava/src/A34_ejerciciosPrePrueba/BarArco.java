package A34_ejerciciosPrePrueba;

import java.util.HashSet;

public class BarArco {
    private HashSet<Diana> dianas;
    private HashSet<Beneficio> listaBeneficiosNoAcumulable;
    private  HashSet<BeneficiosAcumulables> beneficiosAcumulables;

    public BarArco(HashSet<Diana> dianas, HashSet<Beneficio> listaBeneficios, HashSet<BeneficiosAcumulables> beneficiosAcumulables) {

        this.dianas = dianas;
        this.listaBeneficiosNoAcumulable = listaBeneficios;
        this.beneficiosAcumulables = beneficiosAcumulables;
    }
    public void agregarDiana(Diana d){
        dianas.add(d);
    }
    public  void agregarBeneficio(Beneficio b){
        b.agregarse(this.listaBeneficiosNoAcumulable,this.beneficiosAcumulables);
    }

    public  int cantidadBeneficioTragos(){
        int cantidad = 0;
        for (Beneficio beneficio : listaBeneficiosNoAcumulable) {
            if (beneficio instanceof BeneficioTrago) {
                cantidad++;
            }
        }
        return cantidad;
    };

    public  Diana getDianaMasPuntajes(){
        Diana mayorPuntaje = null;
        for(Diana d: this.dianas){
            if(mayorPuntaje == null){
                mayorPuntaje = d;
            }
            else {
                mayorPuntaje = d.getGraterPunataje(mayorPuntaje);
            }

        }
        return  mayorPuntaje;

    }
}
