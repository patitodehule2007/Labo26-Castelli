package A27_Residuos;

import A21_Drones.Cordenada;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws Exception {
        Sistema sistema = new Sistema();
        Field fr = Sistema.class.getDeclaredField("residuosPermitido");
        fr.setAccessible(true);
        fr.set(sistema, new HashSet<>());
        Field fp = Sistema.class.getDeclaredField("puntosDeRecoleccion");
        fp.setAccessible(true);
        fp.set(sistema, new HashSet<>());
        Field fh = Sistema.class.getDeclaredField("historialRecolecciones");
        fh.setAccessible(true);
        fh.set(sistema, new HashSet<>());
        Field fc = Sistema.class.getDeclaredField("camions");
        fc.setAccessible(true);
        fc.set(sistema, new HashSet<>());

        Residuo plastico = new Residuo("Botella PET", "Plastico", true, "Botella PET", 2);
        Residuo vidrio = new Residuo("Botella vidrio", "Vidrio", true, "Botella vidrio", 5);
        Residuo organico = new Residuo("Restos comida", "Organico", false, "Restos comida", 1);
        Residuo papel = new Residuo("Carton", "Papel", true, "Carton", 3);
        Residuo pilas = new Residuo("Pilas AA", "Peligroso", false, "Pilas", 1);

        sistema.agregarResiduos(plastico);
        sistema.agregarResiduos(vidrio);
        sistema.agregarResiduos(organico);
        sistema.agregarResiduos(papel);
        System.out.println(fr.get(sistema));

        sistema.sacarResiduos(papel);
        System.out.println("sacar papel");
        System.out.println(fr.get(sistema));

        sistema.agregarResiduos(pilas);
        sistema.modificarResiduo(pilas, papel);
        System.out.println("modificar pilas por papel");
        System.out.println(fr.get(sistema));

        Cordenada c1 = new Cordenada(-34.61, -58.38);
        Cordenada c2 = new Cordenada(-34.58, -58.43);
        Cordenada c3 = new Cordenada(-34.92, -57.95);
        Cordenada c4 = new Cordenada(-34.60, -58.39);

        PuntoRecoleccion p1 = new PuntoRecoleccion("Av. Corrientes 1000", c1, "Centro", "Punto Centro");
        PuntoRecoleccion p2 = new PuntoRecoleccion("Av. Santa Fe 2000", c2, "Palermo", "Punto Palermo");
        PuntoRecoleccion p3 = new PuntoRecoleccion("Calle 7 1000", c3, "La Plata", "Punto La Plata");
        PuntoRecoleccion p4 = new PuntoRecoleccion("Av. Corrientes 1005", c4, "Centro", "Punto Centro 2");

        p1.setResiduos(new HashMap<>());
        p2.setResiduos(new HashMap<>());
        p3.setResiduos(new HashMap<>());
        p4.setResiduos(new HashMap<>());

        p1.agregarResiduoAceptado(plastico);
        p1.agregarResiduoAceptado(vidrio);
        p1.agregarResiduoAceptado(organico);
        p2.agregarResiduoAceptado(plastico);
        p2.agregarResiduoAceptado(papel);
        p3.agregarResiduoAceptado(vidrio);
        p3.agregarResiduoAceptado(organico);
        p4.agregarResiduoAceptado(plastico);

        p1.getResiduos().put(plastico, 10);
        p1.getResiduos().put(vidrio, 5);
        p1.getResiduos().put(organico, 20);
        p2.getResiduos().put(plastico, 8);
        p2.getResiduos().put(papel, 4);
        p4.getResiduos().put(plastico, 5);
        p3.getResiduos().put(vidrio, 20);
        p3.getResiduos().put(organico, 30);

        System.out.println(p1.aceptaResiduo(plastico));
        System.out.println(p1.aceptaResiduo(papel));
        p1.quitarResiduoAceptado(organico);
        System.out.println(p1.aceptaResiduo(organico));
        p1.agregarResiduoAceptado(organico);
        p1.getResiduos().put(organico, 20);

        HashSet<PuntoRecoleccion> puntos = (HashSet<PuntoRecoleccion>) fp.get(sistema);
        puntos.add(p1);
        puntos.add(p2);
        puntos.add(p3);
        puntos.add(p4);

        System.out.println(sistema.getPuntoRecoleccionBarrio("Centro").size());
        for (PuntoRecoleccion p : sistema.getPuntoRecoleccionBarrio("Centro")) {
            System.out.println(p.getNombre());
            System.out.println(p.getDireccion());
        }
        System.out.println(sistema.getPuntoByDireccion("Av. Santa Fe 2000").getNombre());
        System.out.println(sistema.getPuntoByDireccion("No existe"));
        System.out.println(sistema.getPuntosConTipoResiduo(plastico).size());
        System.out.println(sistema.getPuntosConTipoResiduo(vidrio).size());
        System.out.println(sistema.getCantidadDelugaresReciduo("Centro").size());

        HashSet<Residuo> transPlastico = new HashSet<>();
        transPlastico.add(plastico);
        transPlastico.add(papel);
        HashSet<Residuo> transTodo = new HashSet<>();
        transTodo.add(plastico);
        transTodo.add(vidrio);
        transTodo.add(organico);
        transTodo.add(papel);

        Camion camion1 = new Camion("AA123BB", "Mercedes", "Accelo", 100, transTodo);
        Camion camionChico = new Camion("CC456DD", "Iveco", "Daily", 30, transPlastico);
        Camion camionPlastico = new Camion("EE789FF", "Ford", "Cargo", 50, transPlastico);

        HashSet<Camion> camiones = (HashSet<Camion>) fc.get(sistema);
        camiones.add(camion1);
        camiones.add(camionChico);
        camiones.add(camionPlastico);

        System.out.println(c1.calcularDistancia(c4));
        System.out.println(c1.calcularDistancia(c3));
        System.out.println(c1.calcularDistancia(c2));

        ArrayList<PuntoRecoleccion> rutaCorta = new ArrayList<>();
        rutaCorta.add(p1);
        rutaCorta.add(p4);
        System.out.println(p1.getResiduos().get(plastico));
        System.out.println(sistema.recolectarBasura(camion1, rutaCorta));
        System.out.println(p1.getResiduos().get(plastico));
        System.out.println(p4.getResiduos().get(plastico));

        p1.getResiduos().put(plastico, 10);
        p1.getResiduos().put(vidrio, 5);
        p4.getResiduos().put(plastico, 5);

        System.out.println(sistema.recolectarBasura(camion1, rutaCorta));

        ArrayList<PuntoRecoleccion> rutaLarga = new ArrayList<>();
        rutaLarga.add(p1);
        rutaLarga.add(p3);
        System.out.println(sistema.recolectarBasura(camionPlastico, rutaLarga));

        ArrayList<PuntoRecoleccion> rutaPesada = new ArrayList<>();
        rutaPesada.add(p1);
        rutaPesada.add(p2);
        System.out.println(sistema.recolectarBasura(camionChico, rutaPesada));
        System.out.println(p1.getResiduos().get(plastico));

        p2.getResiduos().put(plastico, 8);
        p2.getResiduos().put(papel, 4);
        p2.agregarResiduoAceptado(vidrio);
        p2.getResiduos().put(vidrio, 3);
        System.out.println(p2.getResiduos().get(plastico));
        System.out.println(p2.getResiduos().get(papel));
        System.out.println(p2.getResiduos().get(vidrio));

        ArrayList<PuntoRecoleccion> rutaSoloP2 = new ArrayList<>();
        rutaSoloP2.add(p2);
        Camion camionNuevo = new Camion("GG000HH", "Scania", "P320", 100, transPlastico);
        camiones.add(camionNuevo);
        System.out.println(sistema.recolectarBasura(camionNuevo, rutaSoloP2));
        System.out.println(p2.getResiduos().get(plastico));
        System.out.println(p2.getResiduos().get(papel));
        System.out.println(p2.getResiduos().get(vidrio));

        HashSet<Recolecciones> historial = (HashSet<Recolecciones>) fh.get(sistema);
        System.out.println(historial);
        System.out.println(historial.size());
        long exitos = 0;
        for (Recolecciones r : historial) {
            if (r.isFunciono()) exitos++;
        }
        System.out.println(exitos);
        System.out.println(historial.size() - exitos);
        System.out.println(sistema.getPorcentajeViajesFallidos());
    }
}
