package A35_repasopruebaU8;

import java.util.HashMap;
import java.util.HashSet;

public class Brownie extends  Preparacion implements  Vendibles{
    private int cantidadChocolate;


    public Brownie(int cantidadHarina, int cantidadAzucar, int cantidadManteca, int cantidadHuevos, int precioUnitario, int cantidad, int cantidadChocolate) {
        super(cantidadHarina, cantidadAzucar, cantidadManteca, cantidadHuevos, precioUnitario, cantidad);
        this.cantidadChocolate = cantidadChocolate;
    }

    @Override
    public String conocerReceta() {
        return "Empeza partiendo el chocolate";
    }

    @Override
    public void agregarPreparacion(HashSet<Preparacion> noVendibles, HashSet<Vendibles> vendibles) {
        vendibles.add(this)    ;
    }

    @Override
    public boolean hasMedicionesPositivas() {
        return super.hasBaseMedicionesPositivas() && cantidadChocolate >= 0;
    }

    @Override
    public void actualizarStock(int cantidad) throws NotEnoughtInventoryException {
        sacarStock(cantidad);
        System.out.println("Stock suficiente");
    }

    @Override
    public String mensajePromocion() {
        return "Brownies bien húmedos";
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
