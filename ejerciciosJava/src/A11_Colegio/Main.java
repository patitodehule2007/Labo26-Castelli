package A11_Colegio;

import A04_SeresVivos.Estudiante;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 1. Creamos las listas de contenidos para las materias
        ArrayList<String> contenidosJava = new ArrayList<>(Arrays.asList("Sintaxis", "POO", "Excepciones"));
        ArrayList<String> contenidosMath = new ArrayList<>(Arrays.asList("Álgebra", "Cálculo", "Estadística"));

        // 2. Inicializamos las listas de estudiantes (vacías por ahora)
        ArrayList<Estudiante> alumnosJava = new ArrayList<>();
        ArrayList<Estudiante> alumnosMath = new ArrayList<>();

        // 3. Creamos las Materias
        Materia programacion = new Materia("Programación Java", contenidosJava, alumnosJava);
        Materia matematica = new Materia("Matemática Discreta", contenidosMath, alumnosMath);

        // 4. Creamos Estudiantes
        // Nota: El constructor pide una lista de materias
        ArrayList<Materia> materiasJuan = new ArrayList<>(Arrays.asList(programacion, matematica));
        Estudiante juan = new Estudiante("Juan", "Pérez","peru", LocalDate.of(2005, 5, 15), materiasJuan);

        ArrayList<Materia> materiasAna = new ArrayList<>(Arrays.asList(programacion));
        Estudiante ana = new Estudiante("Ana", "García","argentina", LocalDate.of(2003, 10, 20), materiasAna);

        // 5. Agregamos los estudiantes a las listas de las materias (Relación bidireccional)
        alumnosJava.add(juan);
        alumnosJava.add(ana);
        alumnosMath.add(juan);

        // 6. Cargamos notas a los estudiantes
        juan.agregarNota(8);
        juan.agregarNota(10);
        juan.agregarNota(7);

        ana.agregarNota(9);
        ana.agregarNota(9);
        ana.agregarNota(10);

        // 7. Mostramos resultados por consola
        System.out.println("--- Reporte de Estudiantes ---");
        imprimirDatosEstudiante(juan);
        imprimirDatosEstudiante(ana);

        System.out.println("\n--- Reporte de Materias ---");
        System.out.println("Materia: " + programacion.getNombre());
        System.out.println("Promedio de edad de los alumnos: " + programacion.promedioEdad() + " años");
    }

    public static void imprimirDatosEstudiante(Estudiante e) {
        System.out.println("\nEstudiante: " + e.getNombre() + " " + e.getApellido());
        System.out.println("Promedio: " + e.promedio());
        System.out.println("Nota más alta: " + e.mayorNota());
        System.out.println("Nota más baja: " + e.menorNota());
    }
}