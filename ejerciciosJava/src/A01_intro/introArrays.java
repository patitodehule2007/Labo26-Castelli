package A01_intro;
import A04_SeresVivos.Persona;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
public class introArrays {
        public static void main(String[] args) {

            List<Integer> numeros = new ArrayList<>();
            numeros.add(10);
            numeros.add(25);
            numeros.add(5);
            numeros.add(10);

            int suma = 0;
            for (int num : numeros) {
                suma += num;
            }
            System.out.println("A) La suma de los números es: " + suma);


            List<String> palabras = new ArrayList<>();
            palabras.add("Java");
            palabras.add("Spring");
            palabras.add("JavaScript");
            palabras.add("React");

            char letraFiltro = 'J';
            System.out.println("B) Palabras que empiezan con '" + letraFiltro + "':");
            for (String palabra : palabras) {
                if (palabra.startsWith(String.valueOf(letraFiltro))) {
                    System.out.println("* " + palabra);
                }
            }

            List<Persona> personas = new ArrayList<>();
            personas.add(new Persona("Ana", "perez"," ", LocalDate.now()));
            personas.add(new Persona("Carlos", "perez"," ", LocalDate.now()));
            personas.add(new Persona("Lucía", "perez"," " ,LocalDate.now()));
            personas.add(new Persona("Diego", "perez"," ", LocalDate.now()));

            System.out.println("C) Personas mayores de 30 años:");
            for (Persona p : personas) {
                if (p.getEdad() > 30) {
                    System.out.println("* " + p.getNombre());
                }
            }
        }
}
