package A22_Animales;

public class Main {
    public static void main(String[] args) {

        Sistema sistema = new Sistema();

        Gato gato1 = new Gato("Miau", "Michi", "Lucas", 5);
        Pez pez1 = new Pez("Glub", "Nemo", "Lucas", 3);
        Pajaro pajaro1 = new Pajaro("Pio", "Tweety", "Juan", 4, true, "Lalala");

        System.out.println("Agregar mascotas");
        System.out.println("Agregar Michi: " + sistema.agregarMascota(gato1));
        System.out.println("Agregar Nemo: " + sistema.agregarMascota(pez1));
        System.out.println("Agregar Tweety: " + sistema.agregarMascota(pajaro1));
        System.out.println("Agregar duplicado: " + sistema.agregarMascota(new Gato("Miau", "Michi", "Lucas", 2)));

        System.out.println("Saludar");
        System.out.println("Gato (dueño):");
        gato1.saludar("Lucas");
        System.out.println("Gato (no dueño):");
        gato1.saludar("Pedro");

        System.out.println("Pajaro (dueño):");
        pajaro1.saludar("Lucas");
        System.out.println("Pajaro (no dueño):");
        pajaro1.saludar("Pedro");

        System.out.println("Pez (dueño):");
        pez1.saludar("Lucas");

        System.out.println("Alimentar");
        System.out.println("Felicidad gato antes: " + gato1.getFelicidad());
        gato1.alimentar();
        System.out.println("Felicidad gato despues: " + gato1.getFelicidad());

        System.out.println("Eliminar mascota");
        sistema.sacarMascota(gato1);
        System.out.println("Nombre 'Michi' disponible: " + !sistema.agregarMascota(new Gato("Miau", "Michi", "Pedro", 1)));
    }
}
