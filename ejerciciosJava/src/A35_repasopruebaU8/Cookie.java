package A35_repasopruebaU8;

import java.util.HashMap;
import java.util.HashSet;

public class Cookie extends Preparacion implements  Vendibles{
    private int cantidadBicarbonato;
    private  Topping topping;

    public Cookie(int cantidadHarina, int cantidadAzucar, int cantidadManteca, int cantidadHuevos, int precioUnitario, int cantidad, int cantidadBicarbonato, Topping topping) {
        super(cantidadHarina, cantidadAzucar, cantidadManteca, cantidadHuevos, precioUnitario, cantidad);
        this.cantidadBicarbonato = cantidadBicarbonato;
        this.topping = topping;
    }

    @Override
    public String conocerReceta() {
        return "Derretí la manteca";
    }

    @Override
    public void agregarPreparacion(HashSet<Preparacion> noVendibles, HashSet<Vendibles> Vendibles) {
        Vendibles.add(this);
    }

    @Override
    public boolean hasMedicionesPositivas() {
        return super.hasBaseMedicionesPositivas() && cantidadBicarbonato >= 0;
    }


    @Override
    public void actualizarStock(int cantidad) throws NotEnoughtInventoryException {
        sacarStock(cantidad);
        System.out.println("Stock suficiente");
    }

    @Override
    public String mensajePromocion() {
        return "Animate a probar las \n" +
                "mejores cookies del mercado";
    }

    @Override
    public double calcularPrecio(int cantidad) {
        return super.getCantidad() * super.getPrecioUnitario();
    }

    @Override
    public double vender(int cantidad) throws NotEnoughtInventoryException {
        actualizarStock(cantidad);
        return calcularPrecio(cantidad);
    }

}
