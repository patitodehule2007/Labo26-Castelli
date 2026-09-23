package A26_Familia;

import A04_SeresVivos.Familiar;
import A04_SeresVivos.Persona;

import java.util.ArrayList;
import java.util.HashSet;

public class Familia {
    private HashSet<Familiar> familiares;


    public Familia() {
        this.familiares = new HashSet<>();
    }

    public  void  agregarIntegrante(Familiar familiar){
        familiares.add(familiar);
    }
    public  void sacarIntegrante(Familiar familiar){
        familiares.remove(familiar);
    }

    public  boolean  consumirPlato(Familiar familiar, Plato plato){
        if(familiares.contains(familiar)){ familiar.consumirPlato(plato);}
        return  false;
    }

    public Persona personaMenosCalorias(){
        Familiar personaMenosCalorias = null;
        for(Familiar familiar: this.familiares){
            familiar.getCalorias();
            if(personaMenosCalorias == null ||  personaMenosCalorias.getCalorias() > familiar.getCalorias()){
                personaMenosCalorias = familiar;
            }
        }
        return  personaMenosCalorias;
    }

    public  double getPromedioCalorias(){
        double numCalorias = 0;
        for(Familiar familiar: this.familiares){
            numCalorias+= familiar.getCalorias();
        }
        if(familiares.isEmpty()){
            return 0;
        }
        return  numCalorias/familiares.size();

    }

    public ArrayList<Familiar> getFamiliarQueComieronPlato(Plato plato){
        ArrayList<Familiar> familiaresComieronPlato = new ArrayList<>();
        for(Familiar familiar : this.familiares){
            if(familiar.hasPlato(plato)){
                familiaresComieronPlato.add(familiar);
            }
        }
        return  familiaresComieronPlato;
    }


    public HashSet<Plato> getallPlatos(Plato plato){
        HashSet<Plato> familiaresComieronPlato = new HashSet<>();
        for(Familiar familiar : this.familiares){
            familiaresComieronPlato.addAll(familiar.getPlatos().keySet());

        }
        return  familiaresComieronPlato;
    }



}
