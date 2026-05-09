package A11_Colegio;

import A04_SeresVivos.Estudiante;
import A04_SeresVivos.Profesor;
import java.time.LocalDate;
import java.time.LocalTime;
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

        buffet.modificarPlato(pasta, new Plato("Pasta con crema", 1300));
        buffet.eliminarPlato(ensalada);

        System.out.println("menu");

        for (Plato p : buffet.getMenu()) {
            System.out.println(p.getNombre() + " $" + p.getPrecio());
        }

        Estudiante alumno1 = new Estudiante("Juan", "Perez", "Calle 123", LocalDate.of(2008, 5, 15), new ArrayList<>(), "5to A");
        Profesor prof1 = new Profesor("Marta", "Gomez", "Av. Siempreviva 742", LocalDate.of(1980, 10, 20), 20);

        buffet.ordenarPlato(alumno1, milanesa, LocalTime.of(12, 30));
        buffet.ordenarPlato(prof1, milanesa, LocalTime.of(13, 0));
        buffet.ordenarPlato(alumno1, hamburguesa, LocalTime.of(12, 30));
        buffet.ordenarPlato(prof1, hamburguesa, LocalTime.of(13, 0));
        buffet.ordenarPlato(alumno1, milanesa, LocalTime.of(12, 0));

        System.out.println("--- platos a cocinar ---");
        for (Pedido pedido : buffet.getPedidoList()) {
            System.out.println(
                     pedido.getPersona().getNombre() + " " + pedido.getPersona().getApellido() +
                    " pidio  " + pedido.getPato().getNombre()
                    + " a las  " + pedido.getHoraEntrega()
                    + " y le salio $" + pedido.getPrecio());
        }


        System.out.println("--- pedidos pendientes ---");
        for (Pedido pedido : buffet.listarPendientes()) {
            System.out.println(
                    pedido.getPersona().getNombre() + " " +
                            pedido.getPersona().getApellido() +
                    " pidio  " + pedido.getPato().getNombre() + " a las  "
                            + pedido.getHoraEntrega()
                            + " y le salio $" + pedido.getPrecio());
        }

        Pedido primerPedido = buffet.getPedidoList().get(0);
        buffet.marcarPlatoPedido(primerPedido);
        System.out.println("se entrego: " + primerPedido.getPato().getNombre()
                + " de " + primerPedido.getPersona().getNombre() + " " + primerPedido.getPersona().getApellido());

        System.out.println("--- pendientes despues de la entrega ---");
        for (Pedido pedido : buffet.listarPendientes()) {
            System.out.println(
                    pedido.getPersona().getNombre() + " " + pedido.getPersona().getApellido() +
                            " pidio  " + pedido.getPato().getNombre()
                            + " a las  " + pedido.getHoraEntrega()
                            + " y le salio $" + pedido.getPrecio());
        }


        System.out.println("--- Top 3 Platos más pedidos ---");
        List<Plato> top = buffet.top(3);
        for (int i = 0; i < top.size(); i++) {
            System.out.println((i + 1) + ". " + top.get(i).getNombre());
        }
    }
}
