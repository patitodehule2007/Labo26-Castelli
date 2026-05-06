package A03_Vehiculos;

public class Coche extends Vehiculo {
    private double velocidad;
    private String patente;
    private  boolean descapotable;

    public  Coche(String marca,String modelo, String color,int numeroRuedas,int anioFabricacion,double velocidad,String patente){
        super(marca,modelo,color,numeroRuedas,anioFabricacion);
        this.velocidad = velocidad;
        this.patente = patente;
        this.descapotable = false;

    }

    public boolean isDescapotable() {
        return descapotable;
    }

    public void setDescapotable(boolean descapotable) {
        this.descapotable = descapotable;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    private void setVelocidad(double velocidad){
        this.velocidad = velocidad;
    }


    public double getVelocidad() {
        return velocidad;
    }
    // se acelera lo que se manda como parametro
    public  void  acelerar (double incremento){
        this.velocidad += incremento;
    }
    public void  frenar(){
        this.velocidad = 0;
    }
}
