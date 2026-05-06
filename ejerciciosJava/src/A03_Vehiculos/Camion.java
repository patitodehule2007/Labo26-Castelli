package A03_Vehiculos;

public class Camion extends Vehiculo {
    private String patente;
    private int capacidadCarga;
    private int carga;

    public  Camion(String marca,String modelo, String color,int numeroRuedas,int anioFabricacion,double velocidad,String patente,int capacidadCarga){
        super(marca,modelo,color,numeroRuedas,anioFabricacion);
        this.patente = patente;
        this.capacidadCarga = capacidadCarga;
        this.carga = 0;

    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }
    public void cargar(int peso){
        if((this.carga + peso) > this.capacidadCarga){
            this.carga = this.capacidadCarga;
        }
        else {
            this.carga = this.carga + peso;
        }
    }

}
