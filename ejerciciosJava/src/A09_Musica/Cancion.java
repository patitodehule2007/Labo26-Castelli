package A09_Musica;

import A04_SeresVivos.Persona;

import java.time.LocalDate;

public class Cancion {
    private Persona autor;
    private String titulo;

    public  Cancion(){
        this.titulo = "";
        this.autor = new Persona("","juan","", LocalDate.now());
    }
    public  Cancion(String titulo,Persona autor){
        this.titulo = titulo;
        this.autor = autor;
    }

    public Persona getAutor() {
        return autor;
    }

    public void setAutor(Persona autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
