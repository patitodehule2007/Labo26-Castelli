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

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void aumentarPrecioVenta(double porcentaje){
        this.precioVenta = this.precioVenta * (1 + porcentaje/100);
    }
    public boolean agarrarStock(int cantidad) throws StockInsuficienteException {
        if (cantidad > stock) {
            throw new StockInsuficienteException(
                "Stock insuficiente para " + nombreFabricante + " " + modelo +
                ": solicitado " + cantidad + ", disponible " + stock,
                this, stock, cantidad);
        }
        this.stock = this.stock - cantidad;
        return true;
    }

    public boolean agarrarStockSinExcepcion(int cantidad) {
        if (cantidad > stock) {
            return false;
        }
        this.stock = this.stock - cantidad;
        return true;
    }

    public boolean tieneStock(int cantidad){
        return cantidad <= this.stock;
    }

    public void validarStock(int cantidad) throws StockInsuficienteException {
        if (!tieneStock(cantidad)) {
            throw new StockInsuficienteException(
                "Stock insuficiente para " + nombreFabricante + " " + modelo +
                ": solicitado " + cantidad + ", disponible " + stock,
                this, stock, cantidad);
        }
    }

    public String getNombreFabricante() {
        return nombreFabricante;
    }

    public void setNombreFabricante(String nombreFabricante) {
        this.nombreFabricante = nombreFabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    public int  cantidadEntrada(){
        return 0;
    }
    public int  cantidadSalida(){
        return 0;
    }

}
