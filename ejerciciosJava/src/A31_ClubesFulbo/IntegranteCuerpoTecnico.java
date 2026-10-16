package A31_ClubesFulbo;

import A04_SeresVivos.Persona;

import java.time.LocalDate;
import java.util.HashSet;

public class IntegranteCuerpoTecnico extends Persona {
    private String tituloProfesional;
    private int aniosExperiencia;
    private HashSet<Club> historialClubes;

    public IntegranteCuerpoTecnico(String nombre, String apellido, String direccion, LocalDate fechaNacimiento, String tituloProfesional, int aniosExperiencia, HashSet<Club> historialClubes) {
        super(nombre, apellido, direccion, fechaNacimiento);
        this.tituloProfesional = tituloProfesional;
        this.aniosExperiencia = aniosExperiencia;
        this.historialClubes = historialClubes;
    }

    public String getTituloProfesional() {
        return tituloProfesional;
    }

    public void setTituloProfesional(String tituloProfesional) {
        this.tituloProfesional = tituloProfesional;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    public HashSet<Club> getHistorialClubes() {
        return historialClubes;
    }

    public void setHistorialClubes(HashSet<Club> historialClubes) {
        this.historialClubes = historialClubes;
    }
    public boolean pariticipoEquipo(Club club){
        return historialClubes.contains(club);
    }
}
