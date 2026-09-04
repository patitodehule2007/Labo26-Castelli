package A27_Residuos;

import A21_Drones.Cordenada;

import java.util.HashMap;
import java.util.Objects;

public  class PuntoRecoleccion{
    private String direccion;
    private Cordenada cordenada;
    private  String barrio;
    private  String nombre;
    private HashMap<Residuo,Integer> residuos;

    public PuntoRecoleccion(String direccion, Cordenada cordenada, String barrio, String nombre) {
        this.direccion = direccion;
        this.cordenada = cordenada;
        this.barrio = barrio;
        this.nombre = nombre;
    }

    public void agregarResiduoAceptado(Residuo residuo){
        residuos.put(residuo,0);
    }
    public void quitarResiduoAceptado(Residuo residuo){
        residuos.remove(residuo);
    }
    public boolean aceptaResiduo(Residuo residuo){
        return  this.residuos.containsKey(residuo);
    }

    public  boolean isFromBarrio(String barrio){
        return  this.barrio.equals(barrio);
    };

    public  boolean hasSameDireccion(String Direccion){
        return  this.direccion.equals(Direccion);
    };

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Cordenada getCordenada() {
        return cordenada;
    }

    public void setCordenada(Cordenada cordenada) {
        this.cordenada = cordenada;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public HashMap<Residuo, Integer> getResiduos() {
        return residuos;
    }

    public void setResiduos(HashMap<Residuo, Integer> residuos) {
        this.residuos = residuos;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(direccion);
    }
}
