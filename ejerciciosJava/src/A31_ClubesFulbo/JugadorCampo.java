package A31_ClubesFulbo;

import java.time.LocalDate;
import java.util.HashSet;

public class JugadorCampo extends  Jugador{
    private double porcentajeGolesConvertidos;
    private int cantidadAsistencias;

    public JugadorCampo(String nombre, String apellido, String direccion, LocalDate fechaNacimiento, String posicion, String provinciaOrigen, HashSet<Club> historialClubes, int numeroCamiseta, double porcentajeGolesConvertidos, int cantidadAsistencias) {
        super(nombre, apellido, direccion, fechaNacimiento, posicion, provinciaOrigen, historialClubes, numeroCamiseta);
        this.porcentajeGolesConvertidos = porcentajeGolesConvertidos;
        this.cantidadAsistencias = cantidadAsistencias;
    }

    public void  checkearIncorporacion(Club club){
        if(!super.pariticipoEquipo(club)){
            throw new  RejectionContractExeption("No se puede reincorporar al club");
        }

        if(porcentajeGolesConvertidos <= 60){
            throw new  RejectionContractExeption("el porcentaje de goles convertidos es menor a un 30 porciento");
        }
        if (cantidadAsistencias <= 10){
            throw  new RejectionContractExeption("Se tienen que hacer por lo menos 11 asistencias");
        }

    }
    public    String mostrarInformacion(){
        return "JugadorCampo{" +
                "porcentajeGolesConvertidos=" + porcentajeGolesConvertidos +
                ", cantidadAsistencias=" + cantidadAsistencias +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", apellido='" + apellido + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                '}';
    }
}
