package A31_ClubesFulbo;

import A04_SeresVivos.Empleado;
import A04_SeresVivos.Persona;

import java.time.LocalDate;
import java.util.HashSet;

public abstract class Jugador extends Persona implements TrabajadoresClub {
    private String posicion;
    private String provinciaOrigen;
    private HashSet<Club> historialClubes;
    private int numeroCamiseta;

    public Jugador(String nombre, String apellido, String direccion, LocalDate fechaNacimiento, String posicion, String provinciaOrigen, HashSet<Club> historialClubes, int numeroCamiseta) {
        super(nombre, apellido, direccion, fechaNacimiento);
        this.posicion = posicion;
        this.provinciaOrigen = provinciaOrigen;
        this.historialClubes = historialClubes;
        this.numeroCamiseta = numeroCamiseta;
    }

    public boolean pariticipoEquipo(Club club){
        return historialClubes.contains(club);
    }

    public abstract void checkearIncorporacion(Club club) throws RejectionContractExeption ;




    public  void checkearRenovacion() throws  RejectionContractExeption{
        if(super.getEdad() > 35){
            throw new  RejectionContractExeption("El jugador no puede tener mas de 35 años");
        }
    };
    public abstract String mostrarInformacion();
    public  String getNombre(){
        return super.getNombre();
    };


}
