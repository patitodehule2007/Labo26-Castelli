package A29_Prestamos;

public class Remera extends Prenda {
    private double espalda;
    private double contorno;
    private double largoTorso;

    public Remera(String color, String material, String marca, boolean tieneManchas, boolean tieneRoturas,
                  double espalda, double contorno, double largoTorso) {
        super(color, material, marca, tieneManchas, tieneRoturas);
        this.espalda = espalda;
        this.contorno = contorno;
        this.largoTorso = largoTorso;
    }

    @Override
    public String getNombreObjeto() {
        return "remera";
    }

    @Override
    public String toString() {
        return "Remera{" + datosPrenda() +
                ", espalda=" + espalda +
                ", contorno=" + contorno +
                ", largoTorso=" + largoTorso +
                '}';
    }
}
