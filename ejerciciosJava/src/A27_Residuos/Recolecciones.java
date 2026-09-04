package A27_Residuos;

import java.time.LocalDate;
import java.util.Objects;

public class Recolecciones {
    private LocalDate fechaRecodiga;
    private Camion camion;
    private boolean funciono;

    public Recolecciones(LocalDate fechaRecodiga, Camion camion, boolean funciono) {
        this.fechaRecodiga = fechaRecodiga;
        this.camion = camion;
        this.funciono = funciono;
    }

    public boolean isFunciono() {
        return funciono;
    }

    public LocalDate getFechaRecodiga() {
        return fechaRecodiga;
    }

    public Camion getCamion() {
        return camion;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Recolecciones that = (Recolecciones) o;
        return Objects.equals(fechaRecodiga, that.fechaRecodiga) && Objects.equals(camion, that.camion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fechaRecodiga, camion);
    }
}
