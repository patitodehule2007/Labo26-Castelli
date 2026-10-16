package A30_Elecciones;

public class TelefonoMovil extends Dispositivo implements Mensajero {
    private CompaniaTelefonica compania;
    private String numeroCelular;
    private boolean prendido;
    private double credito;

    public TelefonoMovil(String numeroSerie, String fabricante, String modelo,
                         CompaniaTelefonica compania, String numeroCelular,
                         boolean prendido, double credito) {
        super(numeroSerie, fabricante, modelo);
        this.compania = compania;
        this.numeroCelular = numeroCelular;
        this.prendido = prendido;
        this.credito = credito;
    }

    public CompaniaTelefonica getCompania() {
        return compania;
    }

    public String getNumeroCelular() {
        return numeroCelular;
    }

    public boolean isPrendido() {
        return prendido;
    }

    public double getCredito() {
        return credito;
    }

    public void setPrendido(boolean prendido) {
        this.prendido = prendido;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

    @Override
    public void enviarMensaje(String mensaje) {
        if (this.prendido && this.credito > 0) {
            System.out.println("Conectando con la antena más cercana " + mensaje);
        }
    }
}
