package A32_ArcoFlecha;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class SistemaArcoFlecha {
    private List<Bar> bares = new ArrayList<>();
    private List<Diana> dianas = new ArrayList<>();
    private List<Beneficio> beneficios = new ArrayList<>();

    public void agregarBar(Bar bar) {
        bares.add(bar);
    }

    public void agregarDiana(Diana diana) {
        dianas.add(diana);
    }

    public void agregarBeneficio(Beneficio beneficio) {
        beneficios.add(beneficio);
    }

    public Optional<Diana> obtenerDianaConMasPuntajes() {
        Diana dianaConMasPuntajes = null;
        for (Diana diana : dianas) {
            if (dianaConMasPuntajes == null
                    || diana.getCantidadPuntajes() > dianaConMasPuntajes.getCantidadPuntajes()) {
                dianaConMasPuntajes = diana;
            }
        }
        return Optional.ofNullable(dianaConMasPuntajes);
    }

    public List<Bar> getBares() {
        return new ArrayList<>(bares);
    }

    public List<Diana> getDianas() {
        return new ArrayList<>(dianas);
    }

    public List<Beneficio> getBeneficios() {
        return new ArrayList<>(beneficios);
    }
}
