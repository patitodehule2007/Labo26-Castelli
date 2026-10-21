package A32_ArcoFlecha;

import java.util.Map;

public class DianaCircular extends Diana {
    private static double RADIO_CM = 13.0;

    public DianaCircular(String nombre, String nivelDificultad, Map<Integer, ColorDiana> puntajesPorColor) {
        super(nombre, nivelDificultad, puntajesPorColor);
    }

    public double getRadioCm() {
        return RADIO_CM;
    }

    @Override
    public double calcularArea() {
        return Math.PI * RADIO_CM * RADIO_CM;
    }
}
