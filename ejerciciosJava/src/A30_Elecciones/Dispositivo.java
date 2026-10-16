package A30_Elecciones;

public class Dispositivo {
    private String numeroSerie;
    private String fabricante;
    private String modelo;

    public Dispositivo(String numeroSerie, String fabricante, String modelo) {
        this.numeroSerie = numeroSerie;
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public String getFabricante() {
        return fabricante;
    }

    public String getModelo() {
        return modelo;
    }
}
