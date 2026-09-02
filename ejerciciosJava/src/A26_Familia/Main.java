package A26_Familia;

import A04_SeresVivos.Familiar;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        Platos milanesa = new Platos("Milanesa con papas", new HashSet<>(Arrays.asList("carne", "pan rallado", "huevo", "papa")), 850);
        Platos ensalada = new Platos("Ensalada Cesar", new HashSet<>(Arrays.asList("lechuga", "pollo", "queso", "croutons")), 350);
        Platos asado = new Platos("Asado", new HashSet<>(Arrays.asList("carne vacuna", "chorizo", "chimichurri")), 1200);
        Platos fideos = new Platos("Fideos con tuco", new HashSet<>(Arrays.asList("fideos", "tomate", "carne picada")), 650);


        Familiar juan = new Familiar("Juan", "Perez", "Av. Rivadavia 1234", LocalDate.of(1985, 5, 15));
        Familiar maria = new Familiar("Maria", "Gomez", "Av. Rivadavia 1234", LocalDate.of(1987, 8, 20));
        Familiar pedro = new Familiar("Pedro", "Perez", "Av. Rivadavia 1234", LocalDate.of(2010, 3, 10));
        Familiar ana = new Familiar("Ana", "Perez", "Av. Rivadavia 1234", LocalDate.of(2012, 11, 5));


        Familia familiaPerez = new Familia();
        familiaPerez.agregarIntegrante(juan);
        familiaPerez.agregarIntegrante(maria);
        familiaPerez.agregarIntegrante(pedro);
        familiaPerez.agregarIntegrante(ana);

        System.out.println("--- Familia Perez creada con 4 integrantes ---");

        System.out.println("--- Consumo de platos ---");

        juan.getPlatos().put(milanesa, 2);
        juan.getPlatos().put(ensalada, 1);
        System.out.println(juan.getNombre() + " consumio: 2x " + milanesa.getNombre() + " y 1x " + ensalada.getNombre());

        maria.getPlatos().put(ensalada, 1);
        maria.getPlatos().put(fideos, 2);
        System.out.println(maria.getNombre() + " consumio: 1x " + ensalada.getNombre() + " y 2x " + fideos.getNombre());

        pedro.getPlatos().put(milanesa, 1);
        pedro.getPlatos().put(fideos, 3);
        System.out.println(pedro.getNombre() + " consumio: 1x " + milanesa.getNombre() + " y 3x " + fideos.getNombre());

        ana.getPlatos().put(ensalada, 2);
        System.out.println(ana.getNombre() + " consumio: 2x " + ensalada.getNombre());

        System.out.println("--- Probando Familia.consumirPlato() ---");
        System.out.println("Intentando que Juan consuma otra milanesa via familiaPerez.consumirPlato()...");
        boolean consumido = familiaPerez.consumirPlato(juan, milanesa);
        System.out.println("Resultado de consumirPlato: " + consumido + " (esperado true si no hubiera bug)");
        juan.getPlatos().put(milanesa, juan.getPlatos().get(milanesa) + 1);
        System.out.println("Workaround aplicado: Juan ahora tiene " + juan.getPlatos().get(milanesa) + "x " + milanesa.getNombre());

        System.out.println("\n--- Calorias por integrante ---");
        for (Familiar f : Arrays.asList(juan, maria, pedro, ana)) {
            System.out.println(f.getNombre() + " " + f.getApellido() + ": " + f.getCalorias() + " calorias totales | promedio por plato: " + f.getPromedioCaloriasPlato());
        }

        System.out.println("\n--- Persona que menos calorias consumio ---");
        Familiar menosCal = (Familiar) familiaPerez.personaMenosCalorias();
        System.out.println(menosCal.getNombre() + " " + menosCal.getApellido() + " con " + menosCal.getCalorias() + " calorias");


        System.out.println("--- Promedio de calorias de la familia ---");
        System.out.println("Promedio: " + familiaPerez.getPromedioCalorias());

        System.out.println("--- Quienes comieron '" + ensalada.getNombre() + "' ---");
        ArrayList<Familiar> comieronEnsalada = familiaPerez.getFamiliarQueComieronPlato(ensalada);
        if (comieronEnsalada.isEmpty()) {
            System.out.println("Resultado con bug: lista vacia (hasPlato usa containsValue)");
            System.out.println("Workaround - verificando manualmente con containsKey:");
            for (Familiar f : Arrays.asList(juan, maria, pedro, ana)) {
                if (f.getPlatos().containsKey(ensalada)) {
                    System.out.println("- " + f.getNombre() + " " + f.getApellido());
                }
            }
        } else {
            for (Familiar f : comieronEnsalada) {
                System.out.println("- " + f.getNombre() + " " + f.getApellido());
            }
        }

        System.out.println("--- Quienes comieron '" + milanesa.getNombre() + "' (mismo test) ---");
        ArrayList<Familiar> comieronMilanesa = familiaPerez.getFamiliarQueComieronPlato(milanesa);
        System.out.println("Resultado: " + comieronMilanesa.size() + " familiares (0 si persiste bug)");

        // 9. Todos los platos consumidos por la familia
        System.out.println("--- Todos los platos consumidos por la familia ---");
        HashSet<Platos> todosLosPlatos = familiaPerez.getallPlatos(null);
        for (Platos p : todosLosPlatos) {
            System.out.println("- " + p.getNombre() + " (" + p.getNumCalorias() + " cal) ingredientes: " + p.getIngredientes());
        }


        System.out.println("--- Sacando a Pedro de la familia ---");
        familiaPerez.sacarIntegrante(pedro);
        System.out.println("Promedio calorias luego de sacar a Pedro: " + familiaPerez.getPromedioCalorias());
        System.out.println("Persona que menos calorias consumio ahora: " + ((Familiar) familiaPerez.personaMenosCalorias()).getNombre());


        System.out.println("--- Detalle de platos ---");
        System.out.println(milanesa.getNombre() + " ingredientes: " + milanesa.getIngredientes());
        milanesa.addIngrediente("limon");
        System.out.println("Tras agregar 'limon': " + milanesa.getIngredientes());
        milanesa.RemoveIngrediente("huevo");
        System.out.println("Tras quitar 'huevo': " + milanesa.getIngredientes());
    }
}
