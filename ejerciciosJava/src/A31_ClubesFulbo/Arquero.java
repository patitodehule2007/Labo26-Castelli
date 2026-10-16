package A31_ClubesFulbo;

import java.time.LocalDate;
import java.util.HashSet;

public class Arquero extends  Jugador {
    private double porcentajeAtajadas;
    private int cantidadGolesRecibidos;

    public Arquero(String nombre, String apellido, String direccion, LocalDate fechaNacimiento, String posicion, String provinciaOrigen, HashSet<Club> historialClubes, int numeroCamiseta, int porcentajeAtajadas, int cantidadGolesRecibidos) {
        super(nombre, apellido, direccion, fechaNacimiento, posicion, provinciaOrigen, historialClubes, numeroCamiseta);
        this.porcentajeAtajadas = porcentajeAtajadas;
        this.cantidadGolesRecibidos = cantidadGolesRecibidos;
    }
    public void  checkearIncorporacion(Club club){
        if(porcentajeAtajadas <= 60){
            throw new  RejectionContractExeption("el porcentaje de atajadas es menor a 60 porciento");
        }
        if (cantidadGolesRecibidos >= 10){
            throw  new RejectionContractExeption("Le metieron  10 o mas goles");
        }

    }

    @Override
    public String mostrarInformacion() {
        return "Arquero{" +
                "fechaNacimiento=" + fechaNacimiento +
                ", apellido='" + apellido + '\'' +
                ", direccion='" + direccion + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
