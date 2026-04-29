package A04_SeresVivos;

import A05_Fechas.Fecha;
import A08_Museo.Cuadro;

import java.time.LocalDate;

public class Restaurador extends Persona {
    private  int dni;
    private  int aniosExperiencia;

    public Restaurador(String nombre, String apellido,String direccion, int dni, LocalDate fechaNacimiento, int aniosExperiencia) {
        super(nombre,apellido,direccion,fechaNacimiento);
        this.dni = dni;
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getNombre() {
        return nombre;
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

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public LocalDate getFechaNacimiento() {
        return super.fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    public  void  restaurarObra(Cuadro cuadro){
        System.out.println("Antes de la restuaracion el cuadro estaba asi: " + cuadro.getEstado() + "/ 10");
        if (cuadro.getFechaCreacion().getAnio() -25 > LocalDate.now().getYear()){
            cuadro.setEstado(cuadro.getEstado() + 2 > 10 ? 10 : cuadro.getEstado() + 2);
        }else {
            cuadro.setEstado(cuadro.getEstado() + 3 > 10 ? 10 : cuadro.getEstado() + 3);

        }
        System.out.println("Ahora el cuadro esta asi: " + cuadro.getEstado() + "/ 10");


    }
}
