package A18_Productos;

public class Televisor extends Producto{
    private TelevisorCategoria televisorCategoria;

    public Televisor(String nombre, double precio, int stock, TelevisorCategoria televisorCategoria) {
        super(nombre, precio, stock, Categoria.MULTIMEDIA);
        this.televisorCategoria = televisorCategoria;
    }
}
