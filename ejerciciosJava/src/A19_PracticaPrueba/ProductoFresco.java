package A19_PracticaPrueba;

import java.time.LocalDate;

public class ProductoFresco extends Producto{

    public ProductoFresco(LocalDate fechaVencimiento, int numeroLote, String nombre, int codigoIdentificacion, PaisesOrigen paisesOrigen, LocalDate fechaEmbasado) {
        super(fechaVencimiento, numeroLote, nombre, codigoIdentificacion, paisesOrigen, fechaEmbasado);
    }

    @Override
    public boolean envazoDespuesFresco(Producto comparacion){
        return  super.doesitEnvazadoDespues(comparacion);
    }
    @Override
    public String getInfoNutricional(){
        return "38";
    }
}
