package A23_Bebidas;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Sistema sistema = new Sistema();

        BebidaAzucarada coca = new BebidaAzucarada("Coca Cola", 35);
        BebidaAlcoholica birra = new BebidaAlcoholica("Quilmes", 0.8, 4.5);
        BebidaNeutras agua = new BebidaNeutras("Agua", 5, 0);

        System.out.println("Coeficientes de hidratacion");
        System.out.println("Coca Cola: " + coca.getCoeficienteHidratacion());
        System.out.println("Quilmes: " + birra.getCoeficienteHidratacion());
        System.out.println("Agua: " + agua.getCoeficienteHidratacion());

        PersonaBebe persona1 = new PersonaBebe("Lucas", "Castelli", "Buenos Aires", LocalDate.of(2008, 5, 15), 44555666);
        PersonaBebe persona2 = new PersonaBebe("Juan", "Perez", "Cordoba", LocalDate.of(2000, 10, 20), 33444555);

        System.out.println(" Agregar usuarios");
        System.out.println("Agregar persona1: " + sistema.addUser(persona1));
        System.out.println("Agregar persona2: " + sistema.addUser(persona2));
        System.out.println("Agregar duplicado: " + sistema.addUser(new PersonaBebe("Otro", "Test", "X", LocalDate.of(2000, 1, 1), 44555666)));

        System.out.println("Consumir bebidas");
        sistema.consumir(persona1, 2, coca);
        sistema.consumir(persona1, 1, agua);
        sistema.consumir(persona2, 3, birra);

        System.out.println("Coeficientes por persona");
        System.out.println(persona1);
        System.out.println("Coeficiente: " + persona1.getCoeficiente());
        System.out.println(persona2);
        System.out.println("Coeficiente: " + persona2.getCoeficiente());

        System.out.println("Persona con mas hidratacion");
        sistema.mostrarPersonaMasHidratacion();

        System.out.println("Persona con menos hidratacion ");
        sistema.mostrarPersonaMenosHidratacion();
    }
}
