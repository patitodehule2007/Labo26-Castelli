package A13_llamadas;

import A04_SeresVivos.Empleado;
import A04_SeresVivos.Persona;

import java.time.LocalDate;

public class LlamadaNacional  extends Llamada{
    private Provincia provinciaOrigen;
    private Provincia provinciaDestino;

    public LlamadaNacional(Empleado empleadoOrigen, Empleado empleadoDestino, LocalDate fechaLlamada, int duracion, Provincia provinciaOrigen, Provincia provinciaDestino) {
        super(empleadoOrigen, empleadoDestino, fechaLlamada, duracion);
        this.provinciaOrigen = provinciaOrigen;
        this.provinciaDestino = provinciaDestino;
    }
    public double calcularCosto() {
        return super.getDuracion() * 1.3;
    }

    @Override
    public double obtenerMinutoExterior(Empleado empleado) {
        return 0;
    }
}
