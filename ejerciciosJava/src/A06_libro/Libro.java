package A06_libro;

import A04_SeresVivos.Persona;
import A05_Fechas.Fecha;

import java.time.LocalDate;

public class Libro {
    private String nombre;
    private Persona autor;
    private String isbn;
    private  int cantidadHojas;
    private Fecha fechaPublicacion;

    public  Libro(String nombre,Persona autor,String isbn,int cantidadHojas,Fecha fechaPublicacion){
        this.nombre = nombre;
        this.autor = autor;
        this.isbn = isbn;
        this.cantidadHojas = cantidadHojas;
        this.fechaPublicacion = fechaPublicacion;
    }
    public  Libro(Persona autor,String isbn,int cantidadHojas,Fecha fechaPublicacion){
        this.nombre = "las aventuras de pepe";
        this.autor = autor;
        this.isbn = isbn;
        this.cantidadHojas = cantidadHojas;
        this.fechaPublicacion = fechaPublicacion;
    }
    public  Libro(String isbn,int cantidadHojas,Fecha fechaPublicacion){
        this.nombre = "las aventuras de pepe";
        this.autor = new Persona("pepe", "perez","bolivia", LocalDate.now());
        this.isbn = isbn;
        this.cantidadHojas = cantidadHojas;
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Persona getAutor() {
        return autor;
    }

    public void setAutor(Persona autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getCantidadHojas() {
        return cantidadHojas;
    }

    public void setCantidadHojas(int cantidadHojas) {
        this.cantidadHojas = cantidadHojas;
    }

    public Fecha getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(Fecha fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }
    public boolean esMasNuevo(Libro libro){
        return  this.fechaPublicacion.menorQue(libro.fechaPublicacion);
    }
}
