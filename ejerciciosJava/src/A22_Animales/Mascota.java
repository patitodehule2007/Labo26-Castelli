package A22_Animales;

import java.util.Locale;

public abstract class Mascota {
    private  String saludo;
    private  TipoMascota tipoMascota;
    private String nombre;
    private String nombreDueno;
    private int felicidad;

    public Mascota(String saludo,String nombre,String nombreDueno,int felicidad,TipoMascota tipoMascota) {
        this.saludo = saludo;
        this.nombre = nombre;
        this.nombreDueno = nombreDueno;
        this.felicidad = felicidad;
        this.tipoMascota = tipoMascota;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSaludo() {
        return saludo;
    }

    public String getNombreDueno() {
        return nombreDueno;
    }

    public int getFelicidad() {
        return felicidad;
    }

    public  String construirSaludo(String nombrePersona){
        String saludoCompuesto=saludo;
        if(nombrePersona.equals(nombreDueno)){
            return  saludoCompuesto.toUpperCase(Locale.ROOT).concat("!");
        }
        return  saludoCompuesto;
    }
    public  boolean hasSameName(String nombre){
        return  this.nombre.equals(nombre);
    }

    public  void  aumentarFelicidad(){
        this.felicidad+=1;
    }

    public  boolean isOwner(String nombreDueno){
        return  this.nombreDueno.equals(nombreDueno);
    }
    public void  sumarAlegria(){
        felicidad+=1;
    }

    public TipoMascota getTipoMascota() {
        return tipoMascota;
    }

    public abstract void saludar(String nombreDueno);
    public abstract void alimentar();
}
