package A33_pacientes;

import A04_SeresVivos.Persona;

import java.time.LocalDate;
import java.util.HashSet;

public class Paciente extends Persona {

    private TipoSangre tipoSangre;
    private boolean isPositivo;

    public Paciente(String nombre, String direccion, String apellido, LocalDate fechaNacimiento, int edad, TipoSangre tipoSangre, boolean isPositivo) {

        super(nombre, direccion, apellido, fechaNacimiento, edad);
        this.tipoSangre = tipoSangre;
        this.isPositivo = isPositivo;
    }
    public Integer getEdad(){
        return  super.getEdad();
    }

    public void cambiarTipoSangre(TipoSangre sangreObjetivo,boolean isPositivo){
        tipoSangre = sangreObjetivo;
        this.isPositivo = isPositivo;
    }

    public  void insertarse(HashSet<Tratamiento> tratables, HashSet<Paciente> noTratables) throws TratamientoImposibleException{
        noTratables.add(this);
    }


}
