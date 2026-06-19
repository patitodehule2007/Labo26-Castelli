package A20_plataformaPlatos;

import java.util.ArrayList;

public  class Postre extends  Plato{
    private int temperaturaHorno;
    private boolean aptodiabeticos;


    public Postre(String nombre, Dificultad dificultad, ArrayList<String> pasos, int temperaturaHorno, boolean aptodiabeticos) {
        super(nombre, dificultad, pasos);
        this.temperaturaHorno = temperaturaHorno;
        this.aptodiabeticos = aptodiabeticos;
    }

    @Override
    public void mostrarPlatos() {
        System.out.println("Los pasos son:");
        for(String paso: super.getPasos()){
            System.out.println(paso);
            System.out.println("recordar mantener la cocina limpia y el horno al mínimo.");
        }
    }

    @Override
    public  boolean isFromType(String type){
        return  type.equalsIgnoreCase("postre");
    }
}
