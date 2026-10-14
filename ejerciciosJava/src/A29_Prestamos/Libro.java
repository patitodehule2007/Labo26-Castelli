package A29_Prestamos;

import java.util.ArrayList;

public class Libro extends Publicacion {
    private ArrayList<Integer> paginasPorCapitulo;

    public Libro(String codigo, String titulo, int anioPublicacion, ArrayList<Integer> paginasPorCapitulo) {
        super(codigo, titulo, anioPublicacion);
        this.paginasPorCapitulo = paginasPorCapitulo;
    }

    @Override
    boolean cumpleRequisitoPrestamo() {
        return paginasPorCapitulo.size() % 2 != 0;
    }

    @Override
    public String toString() {
        return "Libro{" + datosPublicacion() +
                ", paginasPorCapitulo=" + paginasPorCapitulo +
                '}';
    }
}
