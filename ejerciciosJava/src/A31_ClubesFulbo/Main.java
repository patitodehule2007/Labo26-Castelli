package A31_ClubesFulbo;

import java.time.LocalDate;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Club club = new Club();
        HashSet<Club> historialVacio = new HashSet<>();

        Arquero arquero = new Arquero(
                "Emiliano", "Martinez", "Mar del Plata",
                LocalDate.of(1992, 9, 2), "Arquero", "Buenos Aires",
                historialVacio, 23, 75, 8
        );

        JugadorCampo jugadorCampo = new JugadorCampo(
                "Lionel", "Messi", "Rosario",
                LocalDate.of(1987, 6, 24), "Delantero", "Santa Fe",
                historialVacio, 10, 40, 12
        );

        Entrenador entrenador = new Entrenador(
                "Lionel", "Scaloni", "Pujato",
                LocalDate.of(1978, 5, 16), "Director técnico", 10,
                historialVacio, 1, true
        );

        System.out.println("=== Personas del ejemplo ===");
        System.out.println(arquero.mostrarInformacion());
        System.out.println(jugadorCampo.mostrarInformacion());
        System.out.println("Entrenador: " + entrenador.getNombre() + " " + entrenador.getApellido());

        System.out.println("\n=== Validación de incorporación disponible ===");
        probarIncorporacion("Arquero", arquero, club);
        probarIncorporacion("Jugador de campo", jugadorCampo, club);
        try {
            entrenador.checkearIncorporacion(club);
            System.out.println("Entrenador: cumple las validaciones de incorporación.");
        } catch (RejectionContractExeption e) {
            System.out.println("Entrenador: incorporación rechazada: " + e.getMessage());
        }
    }

    private static void probarIncorporacion(String tipo, TrabajadoresClub persona, Club club) {
        try {
            persona.checkearIncorporacion(club);
            System.out.println(tipo + ": cumple las validaciones de incorporación.");
        } catch (RejectionContractExeption e) {
            System.out.println(tipo + ": incorporación rechazada: " + e.getMessage());
        }
    }
}
