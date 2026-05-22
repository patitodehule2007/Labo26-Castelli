package A14_ALARMAS;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Sistema sistema = new Sistema();

        SensorHumo humo = new SensorHumo(50, LocalDate.of(2024, 1, 15), true);
        SensorPresion presion = new SensorPresion(60, LocalDate.of(2023, 6, 10), true);
        SensorTemperatura temp = new SensorTemperatura(30, LocalDate.of(2025, 3, 1), true);
        SensorTemperatura tempInactivo = new SensorTemperatura(30, LocalDate.of(2025, 3, 1), false);

        sistema.agregarSensor(humo);
        sistema.agregarSensor(presion);
        sistema.agregarSensor(temp);
        sistema.agregarSensor(tempInactivo);


        SensorHumo humo2 = new SensorHumo(40, LocalDate.of(2024, 5, 20), true);
        SensorHumo humoInactivo = new SensorHumo(40, LocalDate.of(2024, 5, 20), false);
        ArrayList<Sensor> grupoSensores = new ArrayList<>();
        grupoSensores.add(humo2);
        grupoSensores.add(humoInactivo);
        SensorGroup grupo = new SensorGroup(45, grupoSensores);

        sistema.agregarSensor(grupo);

        System.out.println(" Grupo de sensores");
        System.out.println("Sensores: humo2(medida 49) + humoInactivo(medida 49)");
        System.out.println("Promedio: " + grupo.getMedida() + " vs umbral: " + grupo.getValorUmbral());
        grupo.alarmar();

        System.out.println(" en alarma");
        System.out.println("Cantidad: " + sistema.contarEnAlarma());

        System.out.println("Sensores");
        for (Sensor s : sistema.getSensores()) {
            s.alarmar();
        }
    }
}
