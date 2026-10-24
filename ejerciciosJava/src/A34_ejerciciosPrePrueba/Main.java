package A34_ejerciciosPrePrueba;

import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args){


        // diana 1
        HashMap<ColorDiana,Integer> d1Puntaje = new HashMap<>();
        d1Puntaje.put(ColorDiana.AMARILLO,3);
        d1Puntaje.put(ColorDiana.NEGRO,3);
        DianaCircular d1 = new DianaCircular("diana 1", 2 , d1Puntaje);
        // diana 2
        HashMap<ColorDiana,Integer> d2Puntaje = new HashMap<>();
        d2Puntaje.put(ColorDiana.ROJO,3);
        d2Puntaje.put(ColorDiana.NEGRO,8);
        d2Puntaje.put(ColorDiana.VERDE,3);
        d2Puntaje.put(ColorDiana.AMARILLO,2);

        DianaCuadrada d2 = new DianaCuadrada("diana2",9,d2Puntaje,39);

        // diana 3
        HashMap<ColorDiana,Integer> d3Puntaje = new HashMap<>();
        d3Puntaje.put(ColorDiana.ROJO,67);
        DianaRectangular d3 = new DianaRectangular("diana3",9,d3Puntaje,39,49);

        // beneficios
        BeneficioComida b1 = new BeneficioComida("beneficio 1","pepe",new HashSet<>());
        BeneficioGaseosa b2 = new BeneficioGaseosa("beneficio 2","juan",new HashSet<>());
        BeneficioTrago b3 = new BeneficioTrago("beneficio 1","pepe",new HashSet<>());

        // bar
        HashSet<Diana> listaDianas1= new HashSet<>();
        listaDianas1.add(d1);
        listaDianas1.add(d2);

        BarArco bar1 = new BarArco(listaDianas1,new HashSet<>(),new HashSet<>());
        bar1.agregarBeneficio(b1);
        bar1.agregarBeneficio(b2);
        bar1.agregarBeneficio(b3);

        HashSet<Diana> listaDianas2= new HashSet<>();
        listaDianas2.add(d3);

        BarArco bar2 = new BarArco(listaDianas2,new HashSet<>(),new HashSet<>());

        // sistema
        HashSet<BarArco> bares = new HashSet<>();
        bares.add(bar1);
        bares.add(bar2);
        Sistema sistema = new Sistema(bares);

        // pruebas
        // dianas

        System.out.println("Diana circular");
        System.out.println("Area: " + d1.calcularArea());

        System.out.println("Diana cuadrada");
        System.out.println("Area: " + d2.calcularArea());

        System.out.println("Diana rectangular");
        System.out.println("Area: " + d3.calcularArea());


        // bar
        System.out.println("Bares: ");
        System.out.println("diana mas puntaje: " +  bar1.getDianaMasPuntajes());
        System.out.println("beneficios de tragos: " +  bar1.cantidadBeneficioTragos());

        // bares

        System.out.println("Sistema: ");
        System.out.println("diana mas puntaje sistema" + sistema.getDianaMayorPuntaje());
    }
}
