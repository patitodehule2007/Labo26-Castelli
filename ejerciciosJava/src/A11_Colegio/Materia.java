package A11_Colegio;

import java.time.LocalDate;
import java.util.ArrayList;

public class Materia {
    private String nombre;
    private ArrayList<String> listaContenidos;
    private ArrayList<Estudiante> listaEstudiantes;


    public Materia(String nombre, ArrayList<String> listaContenidos, ArrayList<Estudiante> listaEstudiantes) {
        this.nombre = nombre;
        this.listaContenidos = listaContenidos;
        this.listaEstudiantes = listaEstudiantes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getListaContenidos() {
        return listaContenidos;
    }

    public void setListaContenidos(ArrayList<String> listaContenidos) {
        this.listaContenidos = listaContenidos;
    }

    public ArrayList<Estudiante> getListaEstudiantes() {
        return listaEstudiantes;
    }

    public void setListaEstudiantes(ArrayList<Estudiante> listaEstudiantes) {
        this.listaEstudiantes = listaEstudiantes;
    }
    public  int promedioEdad(){
        int  sumEdades = 0;
        for(Estudiante estudiante: listaEstudiantes){
            sumEdades+= LocalDate.now().getYear() - estudiante.getFechaNacimiento().getYear();
        }
        return sumEdades/listaEstudiantes.size();

    }
}
