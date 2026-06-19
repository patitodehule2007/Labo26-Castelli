package A20_plataformaPlatos;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SistemaPlatos sist = new SistemaPlatos();

        PlatoPrincipal p1 = new PlatoPrincipal(
                "Comida 1",
                Dificultad.AVANZADO,
                new ArrayList<>(List.of("juan", "pepe")),
                8,
                87
        );

        Entrada p2 = new Entrada(
                "Comida 1",
                Dificultad.MEDIO,
                new ArrayList<>(List.of("juan", "pepe")),
                true
        );

        Postre p3 = new Postre(
                "Comida 1",
                Dificultad.MEDIO,
                new ArrayList<>(List.of("juan", "pepe")),
                89,
                false
        );

        sist.agregarPlato(p1);
        sist.agregarPlato(p2);
        sist.agregarPlato(p3);

        System.out.println(sist.platoMasPasos().getPasos());

        for(Plato plato: sist.getPlatosOfDificultar(Dificultad.FACIL)) {
            System.out.println(plato.getNombre());
        }

        for(Plato plato: sist.getPlatoTipo("entrada")) {
            System.out.println(plato.getNombre());
        }
    }

}
