package A04_SeresVivos;


import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Persona personaPrueba = new Persona("Juan", "perez","pedro moran 2818", LocalDate.now());
        personaPrueba.mostrarDatos();
    }
}
