package A04_SeresVivos;

import A00_UTILS.Dias;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Objects;

public class PersonaLabura  extends Persona{
    private HashSet<LocalDateTime> asistencias;
    private HashSet<Dias> diasaAsistir;
    private  Integer numeroLegajo;

    public PersonaLabura(String nombre, String apellido, String direccion, LocalDate fechaNacimiento, HashSet<LocalDateTime> asistencias, HashSet<Dias> diasaAsistir, int numeroLegajo) {
        super(nombre, apellido, direccion, fechaNacimiento);
        this.asistencias = asistencias;
        this.diasaAsistir = diasaAsistir;
        this.numeroLegajo = numeroLegajo;
    }

    public HashSet<LocalDateTime> getAsistencias() {
        return asistencias;
    }

    public HashSet<Dias> getDiasaAsistir() {
        return diasaAsistir;
    }

    public Integer getNumeroLegajo() {
        return numeroLegajo;
    }

    public  double porcentajeAsistencia(int mes, int anio){
        int attended = 0;
        int total = 0;
        for(LocalDateTime asistencia: asistencias) {
            if (asistencia.getYear() == anio && asistencia.getMonth().ordinal() == mes) {
                total++;
                if (diasaAsistir.contains(asistencia.getDayOfWeek())) {
                    attended++;
                }
            }
        }

        if(total == 0){
            return  0;
        }
        return  attended / total * 100;

    }
}
