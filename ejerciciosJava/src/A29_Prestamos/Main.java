package A29_Prestamos;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        SistemaPrestamos sistema = new SistemaPrestamos();

        ArrayList<Integer> paginasPorCapitulo = new ArrayList<>();
        paginasPorCapitulo.add(12);
        paginasPorCapitulo.add(18);
        paginasPorCapitulo.add(20);

        Libro libro = new Libro("L01", "El principito", 1943, paginasPorCapitulo);
        Revista revista = new Revista("R01", "Ciencia hoy", 2024, LocalDate.of(2024, 5, 10));
        Pantalon pantalon = new Pantalon("azul", "algodón", "Marca", false, false, 40, 50, 100);
        Remera remera = new Remera("blanca", "algodón", "Marca", true, false, 45, 90, 65);

        sistema.agregarObjeto(libro);
        sistema.agregarObjeto(revista);
        sistema.agregarObjeto(pantalon);
        sistema.agregarObjeto(remera);

        System.out.println("Objetos prestables: " + sistema.cantidadObjetosPrestables());
        System.out.println("Objetos no prestables: " + sistema.cantidadObjetosNoPrestables());

        try {
            libro.prestar();
            libro.devolver();
            remera.prestar();
        } catch (ObjetoNoPrestableException e) {
            System.out.println(e.getMessage());
        }

        for (ObjetoPrestable objeto : sistema.getObjetos()) {
            System.out.println(objeto);
        }
    }
}
