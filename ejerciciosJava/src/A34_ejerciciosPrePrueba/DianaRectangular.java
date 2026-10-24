package A34_ejerciciosPrePrueba;

import java.util.HashMap;

public class DianaRectangular extends  Diana{
    private double altura;
    private double base;

    public DianaRectangular(String nombre, int nivelDificultad, HashMap<ColorDiana, Integer> listaPuntos, double altura, double base) {
        super(nombre, nivelDificultad, listaPuntos);
        this.altura = altura;
        this.base = base;
    }
    public  double calcularArea(){
        return  base * altura;
    }
}
