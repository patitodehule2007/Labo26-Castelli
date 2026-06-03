package A18_Productos;

public class Cargadores  extends  Producto {
    private int cargaSinRecarga;

    public Cargadores(String nombre, double precio, int stock, int cargaSinRecarga) {
        super(nombre, precio, stock, Categoria.CARGADORES);
        this.cargaSinRecarga = cargaSinRecarga;
    }
}
