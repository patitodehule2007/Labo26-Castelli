package A31_ClubesFulbo;

import java.time.LocalDate;
import java.util.HashSet;

public class Entrenador extends  IntegranteCuerpoTecnico{
    private  int cantidadCampeonatos;
    private boolean licencia;


    public Entrenador(String nombre, String apellido, String direccion, LocalDate fechaNacimiento, String tituloProfesional, int aniosExperiencia, HashSet<Club> historialClubes, int cantidadCampeonatos, boolean licencia) {
        super(nombre, apellido, direccion, fechaNacimiento, tituloProfesional, aniosExperiencia, historialClubes);
        this.cantidadCampeonatos = cantidadCampeonatos;
        this.licencia = licencia;
    }

    public void  checkearIncorporacion(Club club){
        if(!super.pariticipoEquipo(club)){
            throw new  RejectionContractExeption("No se puede reincorporar al club");
        }
        if(!licencia){
            throw new  RejectionContractExeption("No se tiene licencia");
        }
        if (super.getAniosExperiencia() < 3){
            throw  new RejectionContractExeption("Se tienen q tener al menos 3 años de experiencia");

        }

    }

    public  void checkearRenovacion() throws  RejectionContractExeption{
        if(!licencia){
            throw  new RejectionContractExeption("No hay licencia valida");
        }
    };
}
