package A11_Colegio;

import A04_SeresVivos.Estudiante;

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
            sumEdades+= estudiante.getEdad();
        }
        return sumEdades/listaEstudiantes.size();

    }

    public  void  agregarContenido(String tema){
        this.listaContenidos.add(tema);
    }
    public  void  agregarAlumno(Estudiante alumno){
        listaEstudiantes.add(alumno);
    }
    public void  mostrarAlumno(){
        for (Estudiante estudiante:this.listaEstudiantes){
            System.out.println(estudiante.getNombre() + " " + estudiante.getApellido());
        }
    }
}
