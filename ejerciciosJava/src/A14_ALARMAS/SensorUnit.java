package A14_ALARMAS;

import java.time.LocalDate;

public abstract class SensorUnit  extends  Sensor{
    private LocalDate fechaAdquirido;
    private boolean estado;

    public SensorUnit(double valorUmbral, LocalDate fechaAdquirido, boolean estado) {
        super(valorUmbral);
        this.fechaAdquirido = fechaAdquirido;
        this.estado = estado;
    }

    public LocalDate getFechaAdquirido() {
        return fechaAdquirido;
    }

    public void setFechaAdquirido(LocalDate fechaAdquirido) {
        this.fechaAdquirido = fechaAdquirido;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
