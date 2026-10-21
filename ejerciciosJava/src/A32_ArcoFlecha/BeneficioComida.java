package A32_ArcoFlecha;

import java.util.ArrayList;
import java.util.List;

public class BeneficioComida extends Beneficio implements BeneficioAcumulable {
    private List<String> comidas;

    public BeneficioComida(String nombre, String nombreCreador, List<String> comidas) {
        super(nombre, nombreCreador);
        this.comidas = new ArrayList<>(comidas);
    }

    public List<String> getComidas() {
        return new ArrayList<>(comidas);
    }

    @Override
    public int calcularDescuentoExtra() {
        return 4500;
    }
}
