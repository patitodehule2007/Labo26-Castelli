package A35_repasopruebaU8;

import java.util.HashMap;
import java.util.HashSet;

public class Bizcochuelo extends Preparacion{
    private int cantidadLimones;
    private int cantidadPolvoHornear;

    public Bizcochuelo(int cantidadHarina, int cantidadAzucar, int cantidadManteca, int cantidadHuevos, int precioUnitario, int cantidad, int cantidadLimones, int cantidadPolvoHornear) {
        super(cantidadHarina, cantidadAzucar, cantidadManteca, cantidadHuevos, precioUnitario, cantidad);
        this.cantidadLimones = cantidadLimones;
        this.cantidadPolvoHornear = cantidadPolvoHornear;
    }

    @Override
    public String conocerReceta() {
        return "El bizcochuelo arranca con...";
    }

    @Override
    public void agregarPreparacion(HashSet<Preparacion> noVendibles, HashSet<Vendibles> Vendibles) {
        noVendibles.add(this)    ;
    }

    @Override
    public boolean hasMedicionesPositivas() {
        return super.hasBaseMedicionesPositivas() && cantidadLimones >= 0
                && cantidadPolvoHornear >= 0;
    }


}
