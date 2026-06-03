package A17_Negocio;

import A18_Productos.Categoria;
import A18_Productos.Producto;

import java.util.ArrayList;

public class TiendaProductos {
    ArrayList<Producto> productos;

    public TiendaProductos() {
        this.productos = new ArrayList<>();
    }

    public void argregarPord(Producto producto){
        productos.add(producto);
    }
    public void modificarProd(Producto productoMod,Producto newProd){
        int prodIndex = productos.indexOf(productoMod);
        if(prodIndex != -1) {
            productos.set(prodIndex,newProd);
        }
    }
    public void  eliminarProd(Producto producto){
            productos.remove(producto);
    }
    public Producto MenorStock(){
        Producto prodMenosStock = productos.getFirst();

        for(Producto prod: this.productos){
            if(prod.hasMenosStock(prodMenosStock)){
                prodMenosStock = prod;
            }
        }
        return  prodMenosStock;
    }
    public Producto MayorStock(){
        Producto prodMasStock = productos.getFirst();

        for(Producto prod: this.productos){
            if(prod.hasMasStock(prodMasStock)){
                prodMasStock = prod;
            }
        }
        return  prodMasStock;
    }

    public void  mostrarProductoCategoria(Categoria categoria){
        for(Producto producto: this.productos){
            System.out.println("Productos de la categoria de: " + categoria);
            System.out.println("---------------------");
            if(producto.isInCategoria(categoria)){

                System.out.println("Nombre: " + producto.getNombre());
                System.out.println("Stock: " + producto.getStock());
                System.out.println("---------------------");
            }
        }
    }
}
