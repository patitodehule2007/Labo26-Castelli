package A33_pacientes;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Paciente pacienteComun = new Paciente(
                "Ana", "San Martín 123", "Pérez",
                LocalDate.of(1980, 5, 12), 46, TipoSangre.O, false
        );

        NinoPaciente nino = new NinoPaciente(
                "Lucas", "Belgrano 456", "Gómez",
                LocalDate.of(2018, 3, 20), 8, TipoSangre.B, true, 4
        );

        JovenTratable joven = new JovenTratable(
                "Sofía", "Mitre 789", "López",
                LocalDate.of(2000, 7, 15), 25, TipoSangre.O, false,
                new HashSet<>(List.of("natación", "lectura", "música"))
        );

        HashSet<Paciente> pacientesNoTratables = new HashSet<>();
        HashSet<Tratamiento> tratamientos = new HashSet<>();
        List<Paciente> pacientes = List.of(pacienteComun, nino, joven);

        for (Paciente paciente : pacientes) {
            System.out.println("Inscribiendo a " + paciente.getNombre() + ":");
            try {
                paciente.insertarse(tratamientos, pacientesNoTratables);
                System.out.println("  Inscripción realizada.");
            } catch (TratamientoImposibleException e) {
                System.out.println("  No se pudo inscribir: " + e.getMessage());
            }
        }

        System.out.println("\nPacientes que no pueden recibir el tratamiento: "
                + pacientesNoTratables.size());
        System.out.println("Tratamientos iniciados: " + tratamientos.size());

        for (Tratamiento tratamiento : tratamientos) {
            try {
                System.out.println("\nPaciente tratado: "
                        + ((Paciente) tratamiento.getPaciente()).getNombre());
                System.out.println(tratamiento.getPaciente().tratarse());
                System.out.printf("Costo del tratamiento: $%.2f%n",
                        tratamiento.getPaciente().calcularCostoTratamiento());

                for (int dia = 0; dia < 3; dia++) {
                    tratamiento.sumarDia();
                }
                System.out.println("Días de tratamiento transcurridos: "
                        + tratamiento.getDiasTratamiento());
            } catch (TratamientoImposibleException e) {
                System.out.println("No se pudo realizar el tratamiento: " + e.getMessage());
            }
        }
    }
}
