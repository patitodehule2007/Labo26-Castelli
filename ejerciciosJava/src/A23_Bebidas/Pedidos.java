package A23_Bebidas;

public class Pedidos {
    private Bebidas bebidas;
    private int cantidad;

    public Pedidos(Bebidas bebidas, int cantidad) {
        this.bebidas = bebidas;
        this.cantidad = cantidad;
    }

    public Bebidas getBebidas() {
        return bebidas;
    }

    public void setBebidas(Bebidas bebidas) {
        this.bebidas = bebidas;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
