package A13_llamadas;

import A04_SeresVivos.Empleado;
import A04_SeresVivos.Persona;
import A05_Fechas.Fecha;

import java.time.LocalDate;

public class Llamada {
    private Persona empleadoOrigen;
    private Persona empleadoDestino;
    private LocalDate fechaLlamada;
    private  int duracion;
    private double costo;

    public Llamada(Empleado empleadoOrigen, Empleado empleadoDestino, LocalDate fechaLlamada, int duracion) {
        this.empleadoOrigen = empleadoOrigen;
        this.empleadoDestino = empleadoDestino;
        this.fechaLlamada = fechaLlamada;
        this.duracion = duracion;
    }
    public double obtenerMinutoExterior(Empleado empleado){
        return  0;
    }

    public double calcularCosto(){
        return 0;
    }

    public Persona getEmpleadoOrigen() {
        return empleadoOrigen;
    }

    public void setEmpleadoOrigen(Persona empleadoOrigen) {
        this.empleadoOrigen = empleadoOrigen;
    }

    public Persona getEmpleadoDestino() {
        return empleadoDestino;
    }

    public void setEmpleadoDestino(Persona empleadoDestino) {
        this.empleadoDestino = empleadoDestino;
    }

    public LocalDate getFechaLlamada() {
        return fechaLlamada;
    }

    public void setFechaLlamada(LocalDate fechaLlamada) {
        this.fechaLlamada = fechaLlamada;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }


    public void setCosto(double costo) {
        this.costo = costo;
    }
}
