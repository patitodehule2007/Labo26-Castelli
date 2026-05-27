package A15_Computacion;


public class PagoConTarjeta extends MetodoDePago{
    public double calcularCosto(double costo) {
        return costo*1.05;
    }
}
