package A09_Musica;

import A04_SeresVivos.Persona;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // 1. Creamos algunos autores (Personas)
        Persona autor1 = new Persona("Charly García","juan", "Rock", LocalDate.now());
        Persona autor2 = new Persona("Gustavo Cerati","juan", "Rock/Pop", LocalDate.now());

        // 2. Creamos instancias de Cancion
        Cancion c1 = new Cancion("Hablando a tu corazón", autor1);
        Cancion c2 = new Cancion("Crimen", autor2);
        Cancion c3 = new Cancion("Puente", autor2);

        // 3. Creamos el objeto CD
        CD miAlbum = new CD();

        // 4. Probamos el método agregar()
        miAlbum.agregar(c1);
        miAlbum.agregar(c2);

        // 5. Probamos grabarCancion() en una posición específica (al inicio por ejemplo)
        miAlbum.grabarCancion(c3, 0);

        System.out.println("--- Lista de canciones inicial ---");
        miAlbum.listarCanciones();

        // 6. Probamos verCancion()
        System.out.println("\nLa canción en la posición 1 es: " + miAlbum.verCancion(1).getTitulo());

        // 7. Probamos eliminar()
        System.out.println("\nEliminando la canción en la posición 2...");
        miAlbum.eliminar(2);

        // 8. Listar de nuevo para ver cambios
        System.out.println("\n--- Lista de canciones final ---");
        miAlbum.listarCanciones();
    }
}