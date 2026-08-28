package A24_Peso;

import A04_SeresVivos.PersonaPeso;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Medicion m1 = new Medicion(170, 75);
        PersonaPeso persona = new PersonaPeso("Juan", "Perez", "Pedro Moran 2818", LocalDate.of(2000, 5, 15), m1);

        persona.mostrarDatos();
        System.out.println("Medicion inicial: Peso=" + persona.getMedicion().getPeso() + "kg, Altura=" + persona.getMedicion().getAltura() + "cm");

        persona.agregarMedicion(LocalDate.of(2024, 3, 10), new Medicion(172, 78));
        persona.agregarMedicion(LocalDate.of(2024, 9, 20), new Medicion(172, 72));
        persona.agregarMedicion(LocalDate.of(2025, 1, 5), new Medicion(173, 80));

        System.out.println("Fecha mayor peso: " + persona.getFechaMayorPeso());
        System.out.println("Fecha menor peso: " + persona.getFechaMenorPeso());

        System.out.println("Promedio peso 2024: " + persona.promedioPeso(2024));
        System.out.println("Promedio altura 2024: " + persona.promedioAltura(2024));

        System.out.println("Variacion peso (2024-03 a 2024-09): " + persona.getPorcentajeVariacionPeso(LocalDate.of(2024, 3, 10), LocalDate.of(2024, 9, 20)));

        Medicion m2 = new Medicion(180, 90);
        System.out.println("Peso m2 > peso m1? " + m2.hasMorePeso(75));
        System.out.println("Altura m2 > altura m1? " + m2.hasMoreAltura(170));
    }
}
