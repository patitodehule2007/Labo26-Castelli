package A20_plataformaPlatos;

import java.util.ArrayList;

public abstract class Plato {
    private String nombre;
    private Dificultad dificultad;
    private ArrayList<String> pasos;

    public Plato(String nombre, Dificultad dificultad, ArrayList<String> pasos) {
        this.nombre = nombre;
        this.dificultad = dificultad;
        this.pasos = pasos;
    }

    public abstract boolean isFromType(TipoPlato type);

    public boolean hasDificultad(Dificultad dificultad){
        return this.dificultad == dificultad;
    }

    public int numPasos(){
        return  this.pasos.size();
    }
    public  Plato platoMasPasos(Plato plato){
        if(this.numPasos() > plato.numPasos()){
            return this;
        }
        return plato;
    }

    public abstract void  mostrarPlatos();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Dificultad getDificultad() {
        return dificultad;
    }

    public void setDificultad(Dificultad dificultad) {
        this.dificultad = dificultad;
    }

    public ArrayList<String> getPasos() {
        return pasos;
    }

    public void setPasos(ArrayList<String> pasos) {
        this.pasos = pasos;
    }

}
