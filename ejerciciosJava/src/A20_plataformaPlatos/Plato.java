package A20_plataformaPlatos;

import java.util.ArrayList;

public abstract class Plato {
    private String nombre;
    private Dificultad dificultad;
    private ArrayList<String> pasos;

    public Plato(String nombre, Dificultad dificultad, ArrayList<String> pasos) {
        this.nombre = nombre;
        this.dificultad = dificultad;
        this.pasos = pasos;
    }
}
