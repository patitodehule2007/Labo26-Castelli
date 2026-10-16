package A30_Elecciones;

import java.time.LocalDate;
import java.time.LocalTime;

public class Trabajador implements Mensajero {
    private String nombre;
    private String apellido;
    private int dni;
    private LocalDate fechaNacimiento;
    private String cuil;
    private double sueldo;
    private String direccionResidencia;
    private LocalTime horaInicio;
    private LocalTime horaFin;

    public Trabajador(String nombre, String apellido, int dni, LocalDate fechaNacimiento,
                      String cuil, double sueldo, String direccionResidencia,
                      LocalTime horaInicio, LocalTime horaFin) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        this.cuil = cuil;
        this.sueldo = sueldo;
        this.direccionResidencia = direccionResidencia;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getDni() {
        return dni;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getCuil() {
        return cuil;
    }

    public double getSueldo() {
        return sueldo;
    }

    public String getDireccionResidencia() {
        return direccionResidencia;
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public LocalTime getHoraFin() {
        return horaFin;
    }

    public boolean estaEnHorarioLaboral(LocalTime hora) {
        if (horaInicio.isBefore(horaFin)) {
            return !hora.isBefore(horaInicio) && hora.isBefore(horaFin);
        }
        return !hora.isBefore(horaInicio) || hora.isBefore(horaFin);
    }

    @Override
    public void enviarMensaje(String mensaje) {
        if (estaEnHorarioLaboral(LocalTime.now())) {
            System.out.println("Yo, " + this.nombre + " te invito a que... " + mensaje);
        }
    }
}
