package A11_Colegio;

import A04_SeresVivos.Estudiante;
import A04_SeresVivos.Profesor;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MainBuffet {
    public static void main(String[] args) {
        Buffet buffet = new Buffet();
        
        Plato milanesa = new Plato("Milanesa con puré", 1500);
        Plato pasta = new Plato("Pasta con tuco", 1200);
        Plato ensalada = new Plato("Ensalada completa", 1000);
        Plato hamburguesa = new Plato("Hamburguesa con fritas", 1800);

        buffet.insertarPlato(milanesa);
        buffet.insertarPlato(pasta);
        buffet.insertarPlato(ensalada);
        buffet.insertarPlato(hamburguesa);

        System.out.println("--- Menú Inicial ---");
        for (Plato p : buffet.getMenu()) {
            System.out.println(p.getNombre() + " - $" + p.getPrecio());
        }

        buffet.modificarPlato(new Plato("Pasta con tuco",393), new Plato("Pasta con crema", 1300));

        buffet.eliminarPlato(ensalada);

        System.out.println("--- Menú Modificado ---");
        for (Plato p : buffet.getMenu()) {
            System.out.println(p.getNombre() + " - $" + p.getPrecio());
        }

        Estudiante alumno1 = new Estudiante("Juan", "Perez", "Calle 123", LocalDate.of(2008, 5, 15), new ArrayList<>(), "5to A");
        Profesor prof1 = new Profesor("Marta", "Gomez", "Av. Siempreviva 742", LocalDate.of(1980, 10, 20), 20); // 20% descuento



        buffet.ordenarPlato(alumno1, milanesa);
        buffet.ordenarPlato(prof1, milanesa);
        buffet.ordenarPlato(alumno1, hamburguesa);
        buffet.ordenarPlato(prof1, hamburguesa);
        buffet.ordenarPlato(alumno1, milanesa);

        System.out.println("--- Platos a cocinar ---");

        buffet.mostrarPlatosACocinar();


        System.out.println("--- Top 3 Platos más pedidos ---");
        List<Plato> top = buffet.top(3);
        for (int i = 0; i < top.size(); i++) {
            System.out.println((i + 1) + ". " + top.get(i).getNombre());
        }
    }
}
