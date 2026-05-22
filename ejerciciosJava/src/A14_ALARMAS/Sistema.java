package A14_ALARMAS;

import java.util.ArrayList;

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
}
