package A04_SeresVivos;

import java.time.LocalDate;

public class Participante extends Persona {
    private String apellido;
    private  int numeroCamiseta;

    public Participante(int numeroCamiseta, LocalDate fechaNacimiento, String apellido, String nombre,String direccion) {
        super(nombre,apellido,direccion,fechaNacimiento);
        this.numeroCamiseta = numeroCamiseta;
    }

    public String getNombre() {
        return super.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFechaNacimiento() {
        return super.fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getNumeroCamiseta() {
        return numeroCamiseta;
    }

    public void setNumeroCamiseta(int numeroCamiseta) {
        this.numeroCamiseta = numeroCamiseta;
    }
}
