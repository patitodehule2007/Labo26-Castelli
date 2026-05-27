package A15_Computacion;

public class Componente {
    private String nombreFabricante;
    private String modelo;
    private double precioVenta;
    private int stock;

    public Componente(int stock, double precioVenta, String modelo, String nombreFabricante) {
        this.stock = stock;
        this.precioVenta = precioVenta;
        this.modelo = modelo;
        this.nombreFabricante = nombreFabricante;
    }

    public void aumentarPrecioVenta(double porcentaje){
        this.precioVenta = this.precioVenta * (1 + porcentaje/100);
    }
}
