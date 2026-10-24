package A34_ejerciciosPrePrueba;

import java.util.HashSet;

public class Sistema {
    private HashSet<BarArco> bares;

    public Sistema(HashSet<BarArco> bares) {
        this.bares = bares;
    }


    public Diana getDianaMayorPuntaje(){
        Diana DianaMayorPunatajes = null;
        for(BarArco b: this.bares){
             if(DianaMayorPunatajes == null){
                 DianaMayorPunatajes = b.getDianaMasPuntajes();
             } else {
                 DianaMayorPunatajes = b.getDianaMasPuntajes().getGraterPunataje(DianaMayorPunatajes);
             }
        }
        return  DianaMayorPunatajes;
    }
}
