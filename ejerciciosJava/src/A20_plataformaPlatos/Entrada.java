package A20_plataformaPlatos;

import java.util.ArrayList;

public class Entrada extends Plato {
    private boolean isCaliente;

    public Entrada(String nombre, Dificultad dificultad, ArrayList<String> pasos, boolean isCaliente) {
        super(nombre, dificultad, pasos);
        this.isCaliente = isCaliente;
    }

    public void mostrarPlatos() {
        if(this.isCaliente){
            System.out.println("Recuerda prender el horno");
        }
        for(String paso: super.getPasos()){
        System.out.println(paso);
        }
        if(!this.isCaliente){
            System.out.println("Guarda le preparacion en la heladera");
        }
}

    @Override
    public  boolean isFromType(String type){
        return  type.equalsIgnoreCase("Entrada");
    }

}
