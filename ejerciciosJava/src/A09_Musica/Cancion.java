package A09_Musica;

import A04_SeresVivos.Persona;

public class Cancion {
    private Persona autor;
    private String titulo;

    public  Cancion(){
        this.titulo = "";
        this.autor = new Persona("","",0);
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
