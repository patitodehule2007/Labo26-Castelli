package A31_ClubesFulbo;

import java.time.LocalDate;
import java.util.HashSet;

public abstract class PreparadorFisico extends  IntegranteCuerpoTecnico implements TrabajadoresClub{
    private String Especialidad;
    private boolean matriculaHabilitante;

    public PreparadorFisico(String nombre, String apellido, String direccion, LocalDate fechaNacimiento, String tituloProfesional, int aniosExperiencia, HashSet<Club> historialClubes, String especialidad, boolean matriculaHabilitante) {
        super(nombre, apellido, direccion, fechaNacimiento, tituloProfesional, aniosExperiencia, historialClubes);
        Especialidad = especialidad;
        this.matriculaHabilitante = matriculaHabilitante;
    }


    public void  checkearIncorporacion(Club club){
        if(!super.pariticipoEquipo(club)){
            throw new  RejectionContractExeption("No se puede reincorporar al club");
        }

        if(!matriculaHabilitante){
            throw new  RejectionContractExeption("No se tiene licencia");
        }
        if (super.getAniosExperiencia() < 2){
            throw  new RejectionContractExeption("Se tienen q tener al menos 2 años de experiencia");

        }

    }


    public String mostrarInformacion() {
        return "PreparadorFisico{" +
                "fechaNacimiento=" + fechaNacimiento +
                ", apellido='" + apellido + '\'' +
                ", direccion='" + direccion + '\'' +
                ", nombre='" + nombre + '\'' +
                ", matriculaHabilitante=" + matriculaHabilitante +
                ", Especialidad='" + Especialidad + '\'' +
                '}';
    }

    public  String getNombre(){
        return super.getNombre();
    };

    public  void checkearRenovacion() throws  RejectionContractExeption{
        if(!matriculaHabilitante){
            throw  new RejectionContractExeption("No hay licencia valida");
        }
    };

}
