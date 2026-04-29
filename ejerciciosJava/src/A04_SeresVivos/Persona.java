package A04_SeresVivos;

import java.time.LocalDate;

public class Persona {
    protected String nombre;
    protected String direccion;
    protected String apellido;
    protected LocalDate fechaNacimiento;

    public Persona(String nombre,String apellido, String direccion, LocalDate fechaNacimiento){
        this.nombre = nombre;
        this.direccion = direccion;
        this.fechaNacimiento = fechaNacimiento;
        this.apellido = apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
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
}
