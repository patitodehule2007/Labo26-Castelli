package A14_ALARMAS;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Sistema {
    private ArrayList<Sensor> sensores;

    public Sistema() {
        this.sensores = new ArrayList<>();
    }

    public void agregarSensor(Sensor s) {
        this.sensores.add(s);
    }

    public void alertar() {
        for (Sensor s : this.sensores) {
            s.alarmar();
        }
    }

    public void alertarGrupo() {
        for (Sensor s : this.sensores) {
            if (s instanceof SensorGroup g) {
                g.alertar();
            }
        }
    }

    public ArrayList<Sensor> getSensores() {
        return sensores;
    }

    public int getCantidadSensores() {
        return sensores.size();
    }

    public Sensor getSensor(int indice) {
        if (indice < 0 || indice >= sensores.size()) {
            throw new IndexOutOfBoundsException("Índice fuera de rango: " + indice + ". Rango válido: 0 a " + (sensores.size() - 1));
        }
        return sensores.get(indice);
    }

    public void mostrarListadoSensores() {
        if (sensores.isEmpty()) {
            System.out.println("No hay dispositivos registrados en el edificio.");
            return;
        }
        System.out.println("=== Dispositivos registrados (" + sensores.size() + ") ===");
        for (int i = 0; i < sensores.size(); i++) {
            Sensor s = sensores.get(i);
            System.out.println(i + " - " + s.getClass().getSimpleName() +
                    " (Umbral: " + s.getValorUmbral() + ", Medida: " + s.getMedida() + ")");
        }
    }

    public void mostrarInformacionSensor(int indice) {
        Sensor s = getSensor(indice); // valida rango
        System.out.println(" Información del dispositivo " + indice);
        System.out.println("Tipo: " + s.getClass().getSimpleName());
        System.out.println("Valor umbral: " + s.getValorUmbral());
        System.out.println("Medida actual: " + s.getMedida());

        if (s instanceof SensorUnit u) {
            System.out.println("Estado: " + (u.getEstado() ? "Activo" : "Inactivo"));
            System.out.println("Fecha adquisición: " + u.getFechaAdquirido());
            boolean enAlarma = u.getEstado() && s.getMedida() >= s.getValorUmbral();
            System.out.println("En alarma: " + (enAlarma ? "Sí" : "No"));
        } else if (s instanceof SensorGroup g) {
            System.out.println("Cantidad de sensores en grupo: " + g.getSensoresGrupo().size());
            System.out.println("Promedio medida grupo: " + g.getMedida());
            System.out.println("En alarma: " + (g.getMedida() >= g.getValorUmbral() ? "Sí" : "No"));
            System.out.println("Detalle de sensores del grupo:");
            for (int j = 0; j < g.getSensoresGrupo().size(); j++) {
                Sensor interno = g.getSensoresGrupo().get(j);
                System.out.println("  [" + j + "] " + interno.getClass().getSimpleName() +
                        " - Umbral: " + interno.getValorUmbral() + ", Medida: " + interno.getMedida());
            }
        }
        System.out.print("Acción alarmar: ");
        s.alarmar();
    }

    public int contarEnAlarma() {
        int count = 0;
        for (Sensor s : this.sensores) {
            if (s instanceof SensorUnit u) {
                if (u.getEstado() && u.getMedida() >= u.getValorUmbral()) {
                    count++;
                }
            }
        }
        return count;
    }


    public void solicitarYMostrarSensor() {
        if (sensores.isEmpty()) {
            System.out.println("No hay dispositivos para mostrar.");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        int indice = -1;
        boolean entradaValida = false;

        mostrarListadoSensores();

        while (!entradaValida) {
            System.out.print("Ingrese un número desde 0 hasta " + (sensores.size() - 1) + " para ver el dispositivo: ");
            try {
                indice = scanner.nextInt();
                if (indice < 0 || indice >= sensores.size()) {
                    System.out.println("Error: número fuera de rango. Debe estar entre 0 y " + (sensores.size() - 1) + ". Intente nuevamente.");
                } else {
                    entradaValida = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: debe ingresar un número entero. Intente nuevamente.");
                scanner.nextLine(); 
        }

        mostrarInformacionSensor(indice);
       
    }


    public void solicitarYMostrarSensor(Scanner scanner) {
        if (sensores.isEmpty()) {
            System.out.println("No hay dispositivos para mostrar.");
            return;
        }

        int indice = -1;
        boolean entradaValida = false;

        mostrarListadoSensores();

        while (!entradaValida) {
            System.out.print("Ingrese un número desde 0 hasta " + (sensores.size() - 1) + " para ver el dispositivo: ");
            try {
                indice = scanner.nextInt();
                if (indice < 0 || indice >= sensores.size()) {
                    System.out.println("Error: número fuera de rango. Debe estar entre 0 y " + (sensores.size() - 1) + ". Intente nuevamente.");
                } else {
                    entradaValida = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: debe ingresar un número entero. Intente nuevamente.");
                scanner.nextLine();
            }
        }

        mostrarInformacionSensor(indice);
    }
}
