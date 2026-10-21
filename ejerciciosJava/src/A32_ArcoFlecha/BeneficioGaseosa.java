package A32_ArcoFlecha;

import java.util.ArrayList;
import java.util.List;

public class BeneficioGaseosa extends Beneficio implements BeneficioAcumulable {
    private List<String> gaseosas;

    public BeneficioGaseosa(String nombre, String nombreCreador, List<String> gaseosas) {
        super(nombre, nombreCreador);
        this.gaseosas = new ArrayList<>(gaseosas);
    }

    public List<String> getGaseosas() {
        return new ArrayList<>(gaseosas);
    }

    @Override
    public int calcularDescuentoExtra() {
        return 1000;
    }
}
