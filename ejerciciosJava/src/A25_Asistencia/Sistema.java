package A25_Asistencia;

import A04_SeresVivos.PersonaLabura;

import java.util.ArrayList;
import java.util.HashMap;

public class Sistema {
    private HashMap<Integer,PersonaLabura> empleados;

    public Sistema(HashMap<Integer,PersonaLabura> empleados) {
        this.empleados = empleados;
    }

    public  PersonaLabura getPersonaByNumeroLegajo(int numLegajo){
        return  empleados.get(numLegajo);
    }

    public  boolean registrarIngreso(PersonaLabura p1){
        if(this.empleados.get(p1).getNumeroLegajo() != null){
            return  false;
        }
        this.empleados.put(p1.getNumeroLegajo(),p1);
        return  true;
    }

    public ArrayList<PersonaLabura> getPersonasMas80Asistencia(int mes , int anio){
        ArrayList<PersonaLabura> empleadosAsistencia = new ArrayList<>();
        for(PersonaLabura personaLabura: this.empleados.values()){
            if(personaLabura.porcentajeAsistencia(mes,anio) > 80){
                empleadosAsistencia.add(personaLabura);
            }
        }
        return  empleadosAsistencia;
    }

}
