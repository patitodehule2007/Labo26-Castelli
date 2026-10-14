package A29_Prestamos;

public abstract class Prenda extends ObjetoPrestable {
    private String color;
    private String material;
    private String marca;
    private boolean tieneManchas;
    private boolean tieneRoturas;

    public Prenda(String color, String material, String marca, boolean tieneManchas, boolean tieneRoturas) {
        this.color = color;
        this.material = material;
        this.marca = marca;
        this.tieneManchas = tieneManchas;
        this.tieneRoturas = tieneRoturas;
    }

    @Override
    public boolean cumpleRequisitoPrestamo() {
        return !tieneManchas && !tieneRoturas;
    }

    public String datosPrenda() {
        return "color='" + color + '\'' +
                ", material='" + material + '\'' +
                ", marca='" + marca + '\'' +
                ", tieneManchas=" + tieneManchas +
                ", tieneRoturas=" + tieneRoturas +
                ", prestado=" + isPrestado();
    }
}
