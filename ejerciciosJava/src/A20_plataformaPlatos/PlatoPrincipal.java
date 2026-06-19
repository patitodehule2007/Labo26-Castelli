package A20_plataformaPlatos;

import java.util.ArrayList;

public class PlatoPrincipal extends Plato {
    private int tiempoCoccion;
    private int numComencales;

    public PlatoPrincipal(String nombre, Dificultad dificultad, ArrayList<String> pasos, int tiempoCoccion, int numComencales) {
        super(nombre, dificultad, pasos);
        this.tiempoCoccion = tiempoCoccion;
        this.numComencales = numComencales;
    }

    @Override
    public void mostrarPlatos() {
        System.out.println("Esta receta tarda en cocinarse: " + this.tiempoCoccion);
        System.out.println("Y los pasos son:");
        for(String paso: super.getPasos()){
            System.out.println(paso);
        }
    }
    @Override
    public  boolean isFromType(String type){
        return  type.equalsIgnoreCase("PlatoPrincipal");
    }
}
