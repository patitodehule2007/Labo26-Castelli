package A19_PracticaPrueba;

import java.time.LocalDate;

public class ProductoCongelado extends Producto {
    private int temperaturaMantenimiento;

    public ProductoCongelado(LocalDate fechaVencimiento, int numeroLote, String nombre, int codigoIdentificacion, PaisesOrigen paisesOrigen, LocalDate fechaEmbasado, int temperaturaMantenimiento) {
        super(fechaVencimiento, numeroLote, nombre, codigoIdentificacion, paisesOrigen, fechaEmbasado);
        this.temperaturaMantenimiento = temperaturaMantenimiento;
    }

    @Override
    public String getInfoNutricional(){
        return "33";
    }

    @Override
    public boolean envazoDespuesFresco(Producto comparacion) {
        return false;
    }
}