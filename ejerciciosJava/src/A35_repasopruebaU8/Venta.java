package A35_repasopruebaU8;

public class Venta {
    Vendibles producto;
    int cantidad;

    public Venta(Vendibles producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public Vendibles getProducto() {
        return producto;
    }

    public void setProducto(Vendibles producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
