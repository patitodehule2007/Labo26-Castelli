package A23_Bebidas;

public class Pedidos {
    private Bebida bebida;
    private int cantidad;

    public Pedidos(Bebida bebida, int cantidad) {
        this.bebida = bebida;
        this.cantidad = cantidad;
    }

    public Bebida getBebidas() {
        return bebida;
    }

    public void setBebidas(Bebida bebida) {
        this.bebida = bebida;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
