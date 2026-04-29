package A12_deporte;

import A04_SeresVivos.Participante;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        ArrayList<Participante> listaA = new ArrayList<>();
        for (int i = 1; i <= 11; i++) {
            listaA.add(new Participante(i, LocalDate.of(1990, 1, i), ("ApellidoA" + i), "NombreA" + i,"bolivia"));
        }

        ArrayList<Participante> listaB = new ArrayList<>();
        for (int i = 1; i <= 11; i++) {
            listaB.add(new Participante(i, LocalDate.of(1995, 5, i), "ApellidoB" + i, "NombreB" + i,"bolivia"));
        }


        ArrayList<String> horarioA = new ArrayList<>(Arrays.asList("mañana", "noche"));
        ArrayList<String> horarioB = new ArrayList<>(Arrays.asList("tarde", "noche"));


        Equipo equipoA = new Equipo(listaA.get(0), horarioA, listaA);
        Equipo equipoB = new Equipo(listaB.get(0), horarioB, listaB);


        Torneo torneo = new Torneo();



        System.out.println("--- Intentando programar partido ---");

        String resultado = torneo.agregarPartido(equipoA, equipoB, 1);
        System.out.println("Resultado: " + resultado);
    }
}