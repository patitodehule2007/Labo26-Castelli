package A32_ArcoFlecha;

import java.util.HashMap;
import java.util.Map;

public abstract class Diana implements CalculableArea {
    private String nombre;
    private String nivelDificultad;
    private Map<Integer, ColorDiana> puntajesPorColor;

    public Diana(String nombre, String nivelDificultad, Map<Integer, ColorDiana> puntajesPorColor) {
        this.nombre = nombre;
        this.nivelDificultad = nivelDificultad;
        this.puntajesPorColor = new HashMap<>();
        if (puntajesPorColor != null) {
            puntajesPorColor.forEach(this::agregarPuntaje);
        }
    }

    public void agregarPuntaje(int puntaje, ColorDiana color) {
        if (puntajesPorColor.containsKey(puntaje)) {
            throw new IllegalArgumentException("El puntaje " + puntaje + " ya existe en esta diana.");
        }
        puntajesPorColor.put(puntaje, color);
    }

    public String getNombre() {
        return nombre;
    }

    public String getNivelDificultad() {
        return nivelDificultad;
    }

    public Map<Integer, ColorDiana> getPuntajesPorColor() {
        return new HashMap<>(puntajesPorColor);
    }

    public int getCantidadPuntajes() {
        return puntajesPorColor.size();
    }

    public abstract double calcularArea();
}
