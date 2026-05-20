package A13_llamadas;

import A04_SeresVivos.Empleado;
import A04_SeresVivos.Persona;

import java.time.LocalDate;

public class LlamadaInternacional extends Llamada {
    private  String codigoPais;
    private String franjaHoraria;

    public LlamadaInternacional(Empleado empleadoOrigen, Empleado empleadoDestino, LocalDate fechaLlamada, int duracion, String codigoPais, String franjaHoraria) {
        super(empleadoOrigen, empleadoDestino, fechaLlamada, duracion);
        this.codigoPais = codigoPais;
        this.franjaHoraria = franjaHoraria;
    }

    public double obtenerMinutoExterior(Empleado empleado){
        if(empleado.equals(super.getEmpleadoOrigen())) {
            return this.getDuracion();
        }
        return  0;
    }
    public double calcularCosto() {
        return super.getDuracion() * 1.3;
    }
}
