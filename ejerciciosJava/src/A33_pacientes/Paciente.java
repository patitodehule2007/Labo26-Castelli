package A33_pacientes;

import A04_SeresVivos.Persona;

import java.time.LocalDate;

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


}
