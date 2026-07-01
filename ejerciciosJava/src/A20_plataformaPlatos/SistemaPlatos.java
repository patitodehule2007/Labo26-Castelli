package A20_plataformaPlatos;

import java.util.ArrayList;

public class SistemaPlatos {
    private ArrayList<Plato> platos;

    public SistemaPlatos() {
        this.platos = new ArrayList<>();
    }
    public  ArrayList<Plato> getPlatosOfDificultar(Dificultad dificultad){
        ArrayList<Plato> platosFiltrados = new ArrayList<>();
        for(Plato plato: this.platos){
            if(plato.hasDificultad(dificultad)){
                platosFiltrados.add(plato);
            }
        }
        return  platosFiltrados;
    }

    public void agregarPlato(Plato plato){
        this.platos.add(plato);
    }
    public boolean eliminarPlato(Plato plato){
        return this.platos.remove(plato);
    }
    public boolean modifyPlato(Plato platoOrigin, Plato newPlato) {

        int index = this.platos.indexOf(platoOrigin);

        if (index == -1) {return false;}

        this.platos.set(index, newPlato);
        return true;
    }

    public int numPlatos(){
        return  platos.size();
    }
    public Plato platoMasPasos(){
        Plato platoMasPaso = this.platos.getFirst();

        for(Plato plato: this.platos){
            platoMasPaso = plato.platoMasPasos(platoMasPaso);
        }
        return  platoMasPaso;
    }

    public ArrayList<Plato> getPlatoTipo(TipoPlato tipo){
        ArrayList<Plato> platosFiltrados = new ArrayList<>();
        for(Plato plato: this.platos){
            if(plato.isFromType(tipo)){
                platosFiltrados.add(plato);
            }
        }
        return  platosFiltrados;
    }

}
