package A33_pacientes;

import java.util.HashSet;

public class Fundacion {
    private HashSet<Paciente> noTratable;
    private HashSet<Tratamiento> tratables;

    public Fundacion(HashSet<Paciente> noTratable, HashSet<Tratamiento> tratables) {
        this.noTratable = noTratable;
        this.tratables = tratables;
    }

    private  void avanzarTratamiento(){
        for(Tratamiento t : this.tratables){
            t.sumarDia();
        }
    }
    private  void inscribirse(Paciente paciente){
        try {
            paciente.insertarse(tratables, noTratable);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    private int pacientesNoAplican(){
        return this.noTratable.size();
    }
}
