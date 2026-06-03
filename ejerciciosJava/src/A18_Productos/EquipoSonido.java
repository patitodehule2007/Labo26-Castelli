package A18_Productos;

public class EquipoSonido extends Producto{
    private boolean moduloIntegrado;

    public EquipoSonido(String nombre, double precio, int stock, boolean moduloIntegrado) {
        super(nombre, precio, stock, Categoria.MULTIMEDIA);
        this.moduloIntegrado = moduloIntegrado;
    }
}
