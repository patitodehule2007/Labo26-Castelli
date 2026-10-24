package A34_ejerciciosPrePrueba;

import java.util.HashMap;

public class DianaCircular extends  Diana{
    private static double radio=13;

    public DianaCircular(String nombre, int nivelDificultad, HashMap<ColorDiana, Integer> listaPuntos) {
        super(nombre, nivelDificultad, listaPuntos);
    }

    public static double getRadio() {
        return radio;
    }

    public static void setRadio(double radio) {
        DianaCircular.radio = radio;
    }

    public  double calcularArea(){
        return  3.14 * Math.pow(DianaCircular.getRadio(),2);
    }
}
