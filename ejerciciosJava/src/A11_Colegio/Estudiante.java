package A11_Colegio;

import java.time.LocalDate;
import java.util.ArrayList;

public class Estudiante {
    private  String nombre;
    private  String apellido;
    private ArrayList<Materia> materias;
    private LocalDate fechaNacimiento;
    private ArrayList<Integer> listaNotas;


    public Estudiante(String nombre, String apellido, LocalDate fechaNacimiento,ArrayList<Materia> materias) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.materias = materias;
        this.listaNotas = new ArrayList<Integer>();
    }

    public ArrayList<Materia> getMateria(){
        return this.materias ;
    }
    public  void  setMateria( ArrayList<Materia> materias){
        this.materias = materias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public ArrayList<Integer> getListaNotas() {
        return listaNotas;
    }

    public void setListaNotas(ArrayList<Integer> listaNotas) {
        this.listaNotas = listaNotas;
    }
    public void agregarMateria(Materia materia){
        this.materias.add(materia);
    }
    public  void agregarNota(Integer nota){
        listaNotas.add(nota);
    }
    public  Integer  menorNota(){
        Integer menor = this.listaNotas.getFirst();
        for(Integer nota: this.listaNotas){
            if(nota < menor){
                menor = nota;
            }
        }
        return  menor;
    }

    public  Integer  mayorNota(){
        Integer mayor = this.listaNotas.getFirst();
        for(Integer nota: this.listaNotas){
            if(nota > mayor){
                mayor = nota;
            }
        }
        return  mayor;
    }

    public Integer promedio(){
        Integer sumNotas = 0;
        for(Integer nota: this.listaNotas){
            sumNotas+=nota;
        }
        return sumNotas / this.listaNotas.size();
    }
    public  Integer getEdad(){
        return LocalDate.now().getYear() - this.fechaNacimiento.getYear();
    }

    public void inscribir(Materia materia){
        materia.agregarAlumno(this);
        this.agregarMateria(materia);

    }

}
