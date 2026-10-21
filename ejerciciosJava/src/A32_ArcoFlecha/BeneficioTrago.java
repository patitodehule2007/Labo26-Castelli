package A32_ArcoFlecha;

import java.util.ArrayList;
import java.util.List;

public class BeneficioTrago extends Beneficio {
    private List<String> tragos;

    public BeneficioTrago(String nombre, String nombreCreador, List<String> tragos) {
        super(nombre, nombreCreador);
        this.tragos = new ArrayList<>(tragos);
    }

    public List<String> getTragos() {
        return new ArrayList<>(tragos);
    }
}
