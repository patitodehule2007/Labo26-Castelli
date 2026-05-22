package A14_ALARMAS;

import java.util.ArrayList;

public class SensorGroup extends Sensor {
    ArrayList<Sensor> sensoresGrupo;

    public SensorGroup(double valorUmbral, ArrayList<Sensor> sensoresGrupo) {
        super(valorUmbral);
        this.sensoresGrupo = sensoresGrupo;
    }

    public double getMedida() {
        if (sensoresGrupo.isEmpty()) return 0;
        double suma = 0;
        for (Sensor s : sensoresGrupo) {
            suma += s.getMedida();
        }
        return suma / sensoresGrupo.size();
    }

    public void alarmar(){
        if(this.getMedida() >= this.getValorUmbral()) {
            System.out.println("Grupo de sensores: alarma activada");
        }
    }

    public  void  alertar(){
        for(Sensor sensor: this.sensoresGrupo){
            sensor.alarmar();
        }
    }
}
