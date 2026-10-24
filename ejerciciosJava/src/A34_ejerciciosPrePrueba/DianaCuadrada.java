package A34_ejerciciosPrePrueba;

import java.util.HashMap;

public class DianaCuadrada extends  Diana{
    private double lado;

    public DianaCuadrada(String nombre, int nivelDificultad, HashMap<ColorDiana, Integer> listaPuntos, double lado) {
        super(nombre, nivelDificultad, listaPuntos);
        this.lado = lado;
    }

    public  double calcularArea(){
        return  Math.pow(lado,2);
    }
}
