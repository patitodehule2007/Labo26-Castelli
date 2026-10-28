package A35_repasopruebaU8;

import java.util.HashMap;
import java.util.HashSet;

public abstract class Preparacion {
    private  int cantidadHarina;
    private int cantidadAzucar;
    private int cantidadManteca;
    private int cantidadHuevos;
    private int precioUnitario;
    private int cantidad;

    public Preparacion(int cantidadHarina, int cantidadAzucar, int cantidadManteca, int cantidadHuevos, int precioUnitario, int cantidad) {
        this.cantidadHarina = cantidadHarina;
        this.cantidadAzucar = cantidadAzucar;
        this.cantidadManteca = cantidadManteca;
        this.cantidadHuevos = cantidadHuevos;
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
    }

    public int getCantidadHarina() {
        return cantidadHarina;
    }

    public void setCantidadHarina(int cantidadHarina) {
        this.cantidadHarina = cantidadHarina;
    }

    public int getCantidadAzucar() {
        return cantidadAzucar;
    }

    public void setCantidadAzucar(int cantidadAzucar) {
        this.cantidadAzucar = cantidadAzucar;
    }

    public int getCantidadManteca() {
        return cantidadManteca;
    }

    public void setCantidadManteca(int cantidadManteca) {
        this.cantidadManteca = cantidadManteca;
    }

    public int getCantidadHuevos() {
        return cantidadHuevos;
    }

    public void setCantidadHuevos(int cantidadHuevos) {
        this.cantidadHuevos = cantidadHuevos;
    }

    public int getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(int precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public  int agregarStock(int cantidadAsumar) throws  IllegalArgumentException{
        if(cantidad <= 0){
            throw  new IllegalArgumentException("el stock que se repone no puede ser negativo");
        }
        cantidad+=cantidadAsumar;
        return cantidad;
    }
    public int sacarStock(int cantidad) throws NotEnoughtInventoryException{
        if(cantidad > this.cantidad){
            throw  new NotEnoughtInventoryException("No hay stock suficiente");
        }
        this.cantidad -= cantidad;
        return this.cantidad;
    }



    public abstract String conocerReceta();
    public abstract   void  agregarPreparacion(HashSet<Preparacion> noVendibles, HashSet<Vendibles>  Vendibles);

    public int getCantidad(){
        return cantidad;
    }
    public boolean hasBaseMedicionesPositivas(){
        return cantidadHarina >= 0
                && cantidadAzucar >= 0
                && cantidadManteca >= 0
                && cantidadHuevos >= 0;
    }

    @Override
    public String toString() {
        return "Preparacion{" +
                "cantidadHarina=" + cantidadHarina +
                ", cantidadAzucar=" + cantidadAzucar +
                ", cantidadManteca=" + cantidadManteca +
                ", cantidadHuevos=" + cantidadHuevos +
                ", precioUnitario=" + precioUnitario +
                ", cantidad=" + cantidad +
                '}';
    }

    public abstract boolean hasMedicionesPositivas();


}
