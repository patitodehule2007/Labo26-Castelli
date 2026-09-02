package A26_Familia;

import java.util.HashSet;

public class Platos {
    private String nombre;
    private HashSet<String> ingredientes;
    private float numCalorias;

    public Platos(String nombre, HashSet<String> ingredientes, float numCalorias) {
        this.nombre = nombre;
        this.ingredientes = ingredientes;
        this.numCalorias = numCalorias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumCalorias(float numCalorias) {
        this.numCalorias = numCalorias;
    }

    public HashSet<String> getIngredientes() {
        return ingredientes;
    }

    public float getNumCalorias() {
        return numCalorias;
    }

    public void addIngrediente(String ingrediente){
        this.ingredientes.add(ingrediente);
    }

    public void RemoveIngrediente(String ingrediente){
        this.ingredientes.remove(ingrediente);
    }



}
