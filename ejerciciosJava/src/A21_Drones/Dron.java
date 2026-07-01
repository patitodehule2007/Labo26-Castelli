package A21_Drones;

import java.time.LocalDate;

public abstract class Dron {

    private static int lastId;
    private static Cordenada cordenadaBase = new Cordenada(34.573195,  -58.504111);

    private int id;
    private Estado estado;
    private LocalDate fechaAdquisicion;
    private String modelo;
    private double porcentajeCarga;

    public Dron(Estado estado, LocalDate fechaAdquisicion, String modelo) {

        this.estado = estado;
        this.fechaAdquisicion = fechaAdquisicion;
        this.modelo = modelo;
        this.porcentajeCarga = 100;

        this.id = lastId + 1;
        Dron.incrementLasId();

    }

    public static void incrementLasId() {
         lastId+=1;
    }

    public static int getLastId() {
        return lastId;
    }

    public static Cordenada getCordenadaBase() {
        return cordenadaBase;
    }
    public void descargar(double carga){
        if(carga < this.porcentajeCarga){
            porcentajeCarga-= carga;
        }
    }

    public int getId() {
        return id;
    }

    public Estado getEstado() {
        return estado;
    }

    public LocalDate getFechaAdquisicion() {
        return fechaAdquisicion;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPorcentajeCarga() {
        return porcentajeCarga;
    }

    public abstract boolean   HacerMision(Cordenada cordenada);

    public  boolean tieneCargaSuficiente(double distancia){
        if(distancia > 30.0){
            return  false;
        }
        return  this.porcentajeCarga < 30.0;
    }

    public  void cargar(){
        int sumaBase = 10;
        int maxBateria = 100;

        this.setEstado(Estado.MANTENIMIENTO);
        if(this.porcentajeCarga < 20){
            this.porcentajeCarga = maxBateria;
        }
        else if(this.porcentajeCarga + sumaBase > maxBateria){
            this.porcentajeCarga = maxBateria;
        } else{
            this.porcentajeCarga+= sumaBase;

        }
        this.setEstado(Estado.OPERATIVO);
    };

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
