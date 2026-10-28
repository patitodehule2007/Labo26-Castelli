package A35_repasopruebaU8;

public interface Vendibles {
     void actualizarStock(int cantidad) throws NotEnoughtInventoryException;
     String mensajePromocion();
     double calcularPrecio(int cantidad );
     double vender(int cantidad) throws NotEnoughtInventoryException;
}
