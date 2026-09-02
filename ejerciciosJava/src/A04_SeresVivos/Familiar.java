package A04_SeresVivos;


import A26_Familia.Platos;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Familiar extends  Persona{
    private HashMap<Platos,Integer> platos;

    public Familiar(String nombre, String apellido, String direccion, LocalDate fechaNacimiento) {
        super(nombre, apellido, direccion, fechaNacimiento);
        this.platos = new HashMap<>();
    }

    public  boolean  consumirPlato(Platos plato){
        if(platos.containsValue(plato)){

            platos.put(plato,platos.get(plato ) + 1);

            return  true;
        }
        return  false;
    }
    public double getCalorias(){

        double caloriasTotal = 0;
        for(Map.Entry<Platos,Integer> entry :this.platos.entrySet() ){
            Platos plato = entry.getKey();
            Integer cantidadPlato = entry.getValue();
            caloriasTotal+=plato.getNumCalorias() * cantidadPlato;
        }
        return  caloriasTotal;
    }

    public double getPromedioCaloriasPlato(){
        double caloriasTotal = 0;
        int numPlato = 0;
        for(Map.Entry<Platos,Integer> entry :this.platos.entrySet() ){
            Platos plato = entry.getKey();
            Integer cantidadPlato = entry.getValue();
            caloriasTotal+=plato.getNumCalorias() * cantidadPlato;
            numPlato+=cantidadPlato;
        }
        if(numPlato == 0){
            return  0;
        }
        return  caloriasTotal/numPlato;
    }

    public boolean hasPlato(Platos plato){
        return platos.containsValue(plato);
    }

    public HashMap<Platos, Integer> getPlatos() {
        return platos;
    }
}
