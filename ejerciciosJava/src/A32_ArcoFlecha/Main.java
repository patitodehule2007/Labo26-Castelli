package A32_ArcoFlecha;

import java.util.Map;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Diana circular = new DianaCircular("Centro", "Fácil", Map.of(
                10, ColorDiana.ROJO,
                8, ColorDiana.VERDE,
                6, ColorDiana.AMARILLO
        ));
        Diana rectangular = new DianaRectangular("Larga", "Media", Map.of(
                5, ColorDiana.BLANCO,
                15, ColorDiana.NEGRO
        ), 30, 20);
        Diana cuadrada = new DianaCuadrada("Cuadrada", "Difícil", Map.of(
                1, ColorDiana.NEGRO,
                2, ColorDiana.ROJO,
                3, ColorDiana.VERDE,
                4, ColorDiana.AMARILLO
        ), 25);

        Beneficio gaseosa = new BeneficioGaseosa("Gaseosa con descuento", "Ana", List.of("Cola", "Lima limón"));
        Beneficio comida = new BeneficioComida("Combo de comida", "Bruno", List.of("Pizza", "Hamburguesa"));
        Beneficio trago = new BeneficioTrago("Trago de la casa", "Carla", List.of("Fernet", "Gin tonic"));

        Bar bar = new Bar("La Diana");
        bar.agregarDiana(circular);
        bar.agregarDiana(rectangular);
        bar.agregarDiana(cuadrada);
        bar.implementarBeneficio(gaseosa);
        bar.implementarBeneficio(comida);
        bar.implementarBeneficio(trago);
        bar.registrarJuego(2500);
        bar.registrarJuego(2500);

        SistemaArcoFlecha sistema = new SistemaArcoFlecha();
        sistema.agregarBar(bar);
        sistema.agregarDiana(circular);
        sistema.agregarDiana(rectangular);
        sistema.agregarDiana(cuadrada);
        sistema.agregarBeneficio(gaseosa);
        sistema.agregarBeneficio(comida);
        sistema.agregarBeneficio(trago);

        System.out.println("Áreas de las dianas:");
        for (Diana diana : sistema.getDianas()) {
            System.out.printf("%s: %.2f cm²%n", diana.getNombre(), diana.calcularArea());
        }

        System.out.println("\nClientes registrados en " + bar.getNombre() + ": " + bar.getCantidadClientes());
        System.out.printf("Dinero recaudado: $%.2f%n", bar.getDineroRecaudado());
        System.out.println("Beneficios de tragos implementados: " + bar.contarBeneficiosDeTragos());
        System.out.println("Beneficios acumulables: " + bar.getBeneficiosAcumulables().size());
        System.out.println("Descuento extra de gaseosa: $" + ((BeneficioAcumulable) gaseosa).calcularDescuentoExtra());
        System.out.println("Descuento extra de comida: $" + ((BeneficioAcumulable) comida).calcularDescuentoExtra());

        try {
            circular.agregarPuntaje(10, ColorDiana.NEGRO);
        } catch (IllegalArgumentException e) {
            System.out.println("Puntaje repetido rechazado: " + e.getMessage());
        }

        sistema.obtenerDianaConMasPuntajes().ifPresent(diana ->
                System.out.println("\nDiana con más puntajes: " + diana.getNombre()
                        + " (" + diana.getCantidadPuntajes() + " puntajes)"));
    }
}
