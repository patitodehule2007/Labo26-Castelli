package A15_Computacion;


public class PagoConTarjeta extends MetodoDePago{

    public PagoConTarjeta(double costo) {
        super(costo);
    }
    public double calcularCosto() {
        return super.calcularCosto()*1.05;
    }
}
