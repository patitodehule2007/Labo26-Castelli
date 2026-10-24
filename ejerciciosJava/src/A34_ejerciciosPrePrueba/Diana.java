package A34_ejerciciosPrePrueba;

import java.util.HashMap;

public abstract class Diana {
    private String nombre;
    private int nivelDificultad;
    private HashMap<ColorDiana,Integer> listaPuntos;


    public Diana(String nombre, int nivelDificultad, HashMap<ColorDiana, Integer> listaPuntos) {
        this.nombre = nombre;
        this.nivelDificultad = nivelDificultad;
        this.listaPuntos = listaPuntos;
    }

    public int getCantidadPuntajes(){
        return listaPuntos.size();
    }
    public Diana getGraterPunataje(Diana Dianapuntaje){
        if( getCantidadPuntajes() > Dianapuntaje.getCantidadPuntajes()) {
            return this ;
        }
        return  Dianapuntaje;
    }

    @Override
    public String toString() {
        return "Diana{" +
                "nombre='" + nombre + '\'' +
                ", nivelDificultad=" + nivelDificultad +
                ", listaPuntos=" + listaPuntos +
                '}';
    }

    public abstract double calcularArea();
}
