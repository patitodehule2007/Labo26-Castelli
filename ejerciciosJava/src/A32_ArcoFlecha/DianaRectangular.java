package A32_ArcoFlecha;

import java.util.Map;

public class DianaRectangular extends Diana {
    private double baseCm;
    private double alturaCm;

    public DianaRectangular(String nombre, String nivelDificultad, Map<Integer, ColorDiana> puntajesPorColor,
                            double baseCm, double alturaCm) {
        super(nombre, nivelDificultad, puntajesPorColor);
        this.baseCm = baseCm;
        this.alturaCm = alturaCm;
    }

    public double getBaseCm() {
        return baseCm;
    }

    public double getAlturaCm() {
        return alturaCm;
    }

    @Override
    public double calcularArea() {
        return baseCm * alturaCm;
    }
}
