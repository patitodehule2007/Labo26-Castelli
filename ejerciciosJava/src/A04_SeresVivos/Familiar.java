package A04_SeresVivos;


import A26_Familia.Plato;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Familiar extends  Persona{
    private HashMap<Plato,Integer> platos;

    public Familiar(String nombre, String apellido, String direccion, LocalDate fechaNacimiento) {
        super(nombre, apellido, direccion, fechaNacimiento);
        this.platos = new HashMap<>();
    }

    public  boolean  consumirPlato(Plato plato){
        if(platos.containsValue(plato)){

            platos.put(plato,platos.get(plato ) + 1);

            return  true;
        }
        return  false;
    }
    public double getCalorias(){

        double caloriasTotal = 0;
        for(Map.Entry<Plato,Integer> entry :this.platos.entrySet() ){
            Plato plato = entry.getKey();
            Integer cantidadPlato = entry.getValue();
            caloriasTotal+=plato.getNumCalorias() * cantidadPlato;
        }
        return  caloriasTotal;
    }

    public double getPromedioCaloriasPlato(){
        double caloriasTotal = 0;
        int numPlato = 0;
        for(Map.Entry<Plato,Integer> entry :this.platos.entrySet() ){
            Plato plato = entry.getKey();
            Integer cantidadPlato = entry.getValue();
            caloriasTotal+=plato.getNumCalorias() * cantidadPlato;
            numPlato+=cantidadPlato;
        }
        if(numPlato == 0){
            return  0;
        }
        return  caloriasTotal/numPlato;
    }

    public boolean hasPlato(Plato plato){
        return platos.containsValue(plato);
    }

    public HashMap<Plato, Integer> getPlatos() {
        return platos;
    }
}
