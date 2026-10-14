package A29_Prestamos;

import java.time.LocalDate;
import java.time.Month;

public class Revista extends Publicacion {
    private LocalDate fechaPublicacion;

    public Revista(String codigo, String titulo, int anioPublicacion, LocalDate fechaPublicacion) {
        super(codigo, titulo, anioPublicacion);
        this.fechaPublicacion = fechaPublicacion;
    }

    @Override
    public boolean cumpleRequisitoPrestamo() {
        int mesActual = LocalDate.now().getMonthValue();
        int primerMesTrimestre = ((mesActual - 1) / 3) * 3 + 1;
        LocalDate inicioTrimestre = LocalDate.of(LocalDate.now().getYear(), Month.of(primerMesTrimestre), 1);
        return fechaPublicacion.isBefore(inicioTrimestre);
    }

    @Override
    public String toString() {
        return "Revista{" + datosPublicacion() +
                ", fechaPublicacion=" + fechaPublicacion +
                '}';
    }
}
