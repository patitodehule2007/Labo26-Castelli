package A32_ArcoFlecha;

import java.util.Map;

public class DianaCuadrada extends Diana {
    private double ladoCm;

    public DianaCuadrada(String nombre, String nivelDificultad, Map<Integer, ColorDiana> puntajesPorColor,
                         double ladoCm) {
        super(nombre, nivelDificultad, puntajesPorColor);
        this.ladoCm = ladoCm;
    }

    public double getLadoCm() {
        return ladoCm;
    }

    @Override
    public double calcularArea() {
        return ladoCm * ladoCm;
    }
}
