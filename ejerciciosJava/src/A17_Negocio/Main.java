package A17_Negocio;

import A18_Productos.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        TiendaProductos tiendaProductos = new TiendaProductos();

        Producto producto = new Televisor("juan",99999999,2, TelevisorCategoria.FULLHD);

        tiendaProductos.argregarPord(producto);

        tiendaProductos.mostrarProductoCategoria(Categoria.MULTIMEDIA);

        tiendaProductos.eliminarProd(producto);
        tiendaProductos.mostrarProductoCategoria(Categoria.MULTIMEDIA);
    }

}
