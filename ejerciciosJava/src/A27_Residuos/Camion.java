package A27_Residuos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Camion {
    private String patente;
    private String marca;
    private String modelo;
    private  int capacidadMaxima;
    private static  int autonomia = 45;
    private HashSet<Residuo> residuoTransportar;

    public Camion(String patente, String marca, String modelo, int capacidadMaxima, HashSet<Residuo> residuoTransportar) {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.capacidadMaxima = capacidadMaxima;
        this.residuoTransportar = residuoTransportar;
    }
    private double calcularPesoViaje(ArrayList<PuntoRecoleccion> puntosRecoleccion){
        double pesoTotal = 0;
        for(PuntoRecoleccion p1: puntosRecoleccion){
            for(Map.Entry<Residuo,Integer> entry :p1.getResiduos().entrySet()){
                pesoTotal+=entry.getValue()*entry.getKey().getPeso();
            }
        }
        return  pesoTotal;
    }


    private  void vaciarPuntos(ArrayList<PuntoRecoleccion> puntosRecoleccion){
        for(PuntoRecoleccion puntoRecoleccion: puntosRecoleccion){
            HashMap<Residuo,Integer> residuos = new HashMap<>();
            for(Map.Entry<Residuo,Integer> entry :puntoRecoleccion.getResiduos().entrySet()){
                if(residuoTransportar.contains(entry.getKey())){
                    residuos.put(entry.getKey(),0);
                }
                else {
                    residuos.put(entry.getKey(),entry.getValue());
                }
            }
            puntoRecoleccion.setResiduos(residuos);

        }
    }

    private boolean isViajeViable(ArrayList<PuntoRecoleccion> puntosRecoleccion){
        if(puntosRecoleccion.getFirst().getCordenada().calcularDistancia(puntosRecoleccion.getLast().getCordenada()) < Camion.autonomia){
            return  false;
        }
        if(calcularPesoViaje(puntosRecoleccion) > this.capacidadMaxima){
            return  false;
        }

        return true;
    }

    public boolean empezarRecoleccion(ArrayList<PuntoRecoleccion> puntosRecoleccion){
        if(!isViajeViable(puntosRecoleccion)){
            return false;
        }
        vaciarPuntos(puntosRecoleccion);
        return  true;
    }
}
