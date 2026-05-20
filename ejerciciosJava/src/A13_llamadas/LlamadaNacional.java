package A13_llamadas;

import A04_SeresVivos.Persona;

import java.time.LocalDate;

public class LlamadaNacional  extends Llamada{
    private String provinciaOrigen;
    private String provinciaDestino;

    public LlamadaNacional(Persona empleadoOrigen, Persona empleadoDestino, LocalDate fechaLlamada, int duracion, String provinciaOrigen, String provinciaDestino) {
        super(empleadoOrigen, empleadoDestino, fechaLlamada, duracion);
        this.provinciaOrigen = provinciaOrigen;
        this.provinciaDestino = provinciaDestino;
    }
    public double calcularCosto() {
        return super.getDuracion() * 1.3;
    }
}
