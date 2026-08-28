package A23_Bebidas;

public abstract class Bebida {
    private String nombre;
    private  double coeficientePositivo;
    private  double coeficienteNegativo;

    public Bebida(String nombre, double coeficientePositivo, double coeficienteNegativo) {
        this.nombre = nombre;
        this.coeficientePositivo = coeficientePositivo;
        this.coeficienteNegativo = coeficienteNegativo;
    }

    public double getCoeficienteHidratacion(){
        return this.coeficientePositivo - this.coeficienteNegativo;
    }

    public String getNombre(){
        return this.nombre;
    }

    @Override
    public String toString(){
        return nombre + " (hidratacion: " + getCoeficienteHidratacion() + ")";
    }
}
