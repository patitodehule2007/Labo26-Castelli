package A29_Prestamos;

public abstract class Publicacion extends ObjetoPrestable {
    private String codigo;
    private String titulo;
    private int anioPublicacion;

    public Publicacion(String codigo, String titulo, int anioPublicacion) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
    }

    @Override
    public String getNombreObjeto() {
        return titulo;
    }

    public String datosPublicacion() {
        return "codigo='" + codigo + '\'' +
                ", titulo='" + titulo + '\'' +
                ", anioPublicacion=" + anioPublicacion +
                ", prestado=" + isPrestado();
    }
}
