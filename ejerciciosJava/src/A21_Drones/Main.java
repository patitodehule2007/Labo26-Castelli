package A21_Drones;

import java.time.LocalDate;

public  class Main {
    public static void main(String[] args) {
        DronCarga d1 = new DronCarga(Estado.OPERATIVO, LocalDate.now(),"v1",998);
        DronCarga d2 = new DronCarga(Estado.OPERATIVO, LocalDate.now(),"v1",998);

        DronVigilancia d3 = new DronVigilancia(Estado.OPERATIVO, LocalDate.now(),"v2",998);
        DronVigilancia d4 = new DronVigilancia(Estado.OPERATIVO, LocalDate.now(),"v2",998);

        System.out.println("dron1 id:" + d1.getId() );
        System.out.println("dron2 id:" + d2.getId() );
        System.out.println("dron3 id:" + d3.getId() );
        System.out.println("dron4 id:" + d4.getId() );

        System.out.println(new  Cordenada(34.573195,  -58.50411).calcularDistancia(new Cordenada(34.573195,  -58.50410)));

        System.out.println("Funciono  mision: " + d1.HacerMision(new Cordenada(34.573195,  -58.50411)));
        System.out.println("Bateria dron 1: " + d1.getPorcentajeCarga());
    }

}