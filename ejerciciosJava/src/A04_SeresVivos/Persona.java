package A04_SeresVivos;

import java.time.LocalDate;

public class Persona {
    protected String nombre;
    protected String direccion;
    protected String apellido;
    protected LocalDate fechaNacimiento;
    private int edad;

    public Persona(String nombre,String apellido, String direccion, LocalDate fechaNacimiento){
        this.nombre = nombre;
        this.direccion = direccion;
        this.fechaNacimiento = fechaNacimiento;
        this.apellido = apellido;
    }

    public Persona(String nombre, String direccion, String apellido, LocalDate fechaNacimiento, int edad) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }


    public Integer getEdad() {
        return  this.fechaNacimiento.getYear() - LocalDate.now().getYear();
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }
    public void mostrarDatos(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.getEdad());
        System.out.println("Direccion: " + this.direccion);
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
