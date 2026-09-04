package A27_Residuos;

public class Residuo {
    private String nombre;
    private String tipoResiduo;
    private boolean isRecicable;
    private String descripcion;
    private int peso;

    public Residuo(String nombre, String tipoResiduo, boolean isRecicable, String descripcion, int peso) {
        this.nombre = nombre;
        this.tipoResiduo = tipoResiduo;
        this.isRecicable = isRecicable;
        this.descripcion = descripcion;
        this.peso = peso;
    }

    public boolean isRecicable() {
        return isRecicable;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
}
