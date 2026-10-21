package A32_ArcoFlecha;

public abstract class Beneficio {
    private String nombre;
    private String nombreCreador;

    public Beneficio(String nombre, String nombreCreador) {
        this.nombre = nombre;
        this.nombreCreador = nombreCreador;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNombreCreador() {
        return nombreCreador;
    }
}
