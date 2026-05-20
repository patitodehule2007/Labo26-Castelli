package A04_SeresVivos;

import A13_llamadas.Llamada;
import A13_llamadas.Sistema;

import java.time.LocalDate;
import java.util.ArrayList;

public class Empleado extends Persona {
    private int dni;
    private String pais;
    private int numTelefono;
    private  String provincia;


    public Empleado(String nombre, String apellido, String direccion, LocalDate fechaNacimiento, int dni, String pais, int numTelefono, String provincia) {
        super(nombre, apellido, direccion, fechaNacimiento);
        this.dni = dni;
        this.pais = pais;
        this.numTelefono = numTelefono;
        this.provincia = provincia;
    }

    public  boolean llamar(Empleado personaLlamando, Sistema sistema, int duracion){
        return sistema.llamar(this,personaLlamando,duracion);
    }
    public ArrayList<Llamada> getLlamadas(Sistema sistema){
        return  sistema.getLlamadasEmpleado(this);
    }
    public int calcNumLLamasExterior(Sistema sistema){
      return  sistema.llamasEmpleadoExterior(this);
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getNumTelefono() {
        return numTelefono;
    }

    public void setNumTelefono(int numTelefono) {
        this.numTelefono = numTelefono;
    }
}
