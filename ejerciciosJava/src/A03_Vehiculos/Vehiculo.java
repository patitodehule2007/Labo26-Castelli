package A03_Vehiculos;

public class Vehiculo {
    private String marca;
    private String modelo;
    private String color;
    private int numRuedas;
    private int aniofabricacion;


    public Vehiculo(String marca, String modelo, String color, int numRuedas, int aniofabricacion) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.numRuedas = numRuedas;
        this.aniofabricacion = aniofabricacion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumRuedas() {
        return numRuedas;
    }

    public void setNumRuedas(int numRuedas) {
        this.numRuedas = numRuedas;
    }

    public int getAniofabricacion() {
        return aniofabricacion;
    }

    public void setAniofabricacion(int aniofabricacion) {
        this.aniofabricacion = aniofabricacion;
    }
}
