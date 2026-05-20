package A13_llamadas;

import A04_SeresVivos.Persona;

import java.time.LocalDate;

public class LlamadaInternacional extends Llamada {
    private  String codigoPais;
    private String franjaHoraria;

    public LlamadaInternacional(Persona empleadoOrigen, Persona empleadoDestino, LocalDate fechaLlamada, int duracion, String codigoPais, String franjaHoraria) {
        super(empleadoOrigen, empleadoDestino, fechaLlamada, duracion);
        this.codigoPais = codigoPais;
        this.franjaHoraria = franjaHoraria;
    }
    public double calcularCosto() {
        return super.getDuracion() * 1.3;
    }
}
