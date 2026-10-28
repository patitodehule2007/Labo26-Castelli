package A35_repasopruebaU8;

import A18_Productos.Producto;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.HashSet;

public class Sistema {

    private HashSet<Preparacion> noVendibles;
    private HashSet<Vendibles>  vendibles;
    private HashMap<LocalDateTime,Venta> registroVenta;

    public Sistema(HashSet<Preparacion> noVendibles, HashSet<Vendibles> vendibles, HashMap<LocalDateTime, Venta> registroVenta) {
        this.noVendibles = noVendibles;
        this.vendibles = vendibles;
        this.registroVenta = registroVenta;
    }

    public String registrarVenta(Vendibles producto,int cantidad) throws NotEnoughtInventoryException{

        producto.vender(cantidad);
        registroVenta.put(LocalDateTime.now(),new Venta(producto,cantidad));
        return "Venta cargada con exito";
    }
    public void nuevaPreparacion(Preparacion preparacion) throws IllegalArgumentException {
        if(!preparacion.hasMedicionesPositivas()){
            throw new IllegalArgumentException("Ingrediente con cantidades inválidas");
        }
        preparacion.agregarPreparacion(noVendibles,vendibles);
        System.out.println("Se ha agregado correctamente la preparación");
    }

    public void  actualizarStock(Preparacion preparacion,int cantidad) throws IllegalArgumentException{
        System.out.println("“El stock nuevo es de ..." + preparacion.agregarStock(cantidad) ) ;
    }
    public String productosVendibles(){
        return "La cantidad de productos que están a la venta son:"  +  vendibles.size();
    }


}
