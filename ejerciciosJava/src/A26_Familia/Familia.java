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

    public  boolean  consumirPlato(Familiar familiar,Platos plato){
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

    public ArrayList<Familiar> getFamiliarQueComieronPlato(Platos platos){
        ArrayList<Familiar> familiaresComieronPlato = new ArrayList<>();
        for(Familiar familiar : this.familiares){
            if(familiar.hasPlato(platos)){
                familiaresComieronPlato.add(familiar);
            }
        }
        return  familiaresComieronPlato;
    }


    public HashSet<Platos> getallPlatos(Platos platos){
        HashSet<Platos> familiaresComieronPlato = new HashSet<>();
        for(Familiar familiar : this.familiares){
            familiaresComieronPlato.addAll(familiar.getPlatos().keySet());

        }
        return  familiaresComieronPlato;
    }



}
