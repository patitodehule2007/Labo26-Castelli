package A29_Prestamos;

public class Pantalon extends Prenda {
    private double cintura;
    private double cadera;
    private double largo;

    public Pantalon(String color, String material, String marca, boolean tieneManchas, boolean tieneRoturas,
                    double cintura, double cadera, double largo) {
        super(color, material, marca, tieneManchas, tieneRoturas);
        this.cintura = cintura;
        this.cadera = cadera;
        this.largo = largo;
    }

    @Override
    public String getNombreObjeto() {
        return "pantalón";
    }

    @Override
    public String toString() {
        return "Pantalon{" + datosPrenda() +
                ", cintura=" + cintura +
                ", cadera=" + cadera +
                ", largo=" + largo +
                '}';
    }
}
