package A18_Productos;

public class Producto {
    private String nombre;
    private double precio;
    private int stock;
    private Categoria categoria;

    public Producto(String nombre, double precio, int stock, Categoria categoria) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public boolean hasMasStock(Producto prod){
        return this.stock > prod.getStock();
    }
    public boolean hasMenosStock(Producto prod){
        return this.stock > prod.getStock();
    }
    public boolean isInCategoria(Categoria categoria){
        return (this.categoria.equals(categoria));
    }
}
