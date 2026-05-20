package A13_llamadas;

import A04_SeresVivos.Empleado;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Sistema sistema = new Sistema();

        Empleado emp1 = new Empleado("Lucas", "Castelli", "Calle 123", LocalDate.of(2000, 5, 15), 12345678, "Argentina", 111111, "Buenos Aires");
        Empleado emp2 = new Empleado("Ana", "Gomez", "Av. Siempre Viva 742", LocalDate.of(1995, 3, 22), 87654321, "Argentina", 222222, "Cordoba");
        Empleado emp3 = new Empleado("John", "Doe", "5th Avenue 100", LocalDate.of(1990, 7, 10), 55555555, "EEUU", 333333, "New York");

        sistema.contratarEmpleado(emp1);
        sistema.contratarEmpleado(emp2);
        sistema.contratarEmpleado(emp3);

        System.out.println("=== Contratacion de empleados ===");
        System.out.println("Empleados en sistema: " + sistema.getEmpleados().size());
        System.out.println();

        System.out.println("=== Llamada nacional  ===");
        sistema.llamar(emp1, emp2, 10);
        System.out.println();

        System.out.println("=== Llamada internacional  ===");
        sistema.llamar(emp1, emp3, 5);
        System.out.println();

        System.out.println("=== Historial de llamadas ===");
        for (Llamada llamada : sistema.getHistorialLlamadas()) {
            System.out.println("De: " + llamada.getEmpleadoOrigen().getNombre() +
                    "  Para: " + llamada.getEmpleadoDestino().getNombre() +
                    "  Duracion: " + llamada.getDuracion() + " min" +
                    "  Costo: $" + llamada.calcularCosto() +
                    "  Tipo: " + llamada.getClass().getSimpleName());
        }
        System.out.println();

        System.out.println("=== Llamadas por empleado ===");
        sistema.mostrarLlamadasPorEmpleado();
        System.out.println();

        System.out.println("=== Llamadas al exterior de emp1 ===");
        System.out.println("Cantidad: " + emp1.calcNumLLamasExterior(sistema));

        System.out.println("=== Top empledos mas llamadas ===");
        sistema.topLlamadasExterior();
    }
}
