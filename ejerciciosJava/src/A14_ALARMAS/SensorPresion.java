package A14_ALARMAS;

import java.time.LocalDate;

public class SensorPresion extends SensorUnit {

    public SensorPresion(double valorUmbral, LocalDate fechaAdquirido, boolean estado) {
        super(valorUmbral, fechaAdquirido, estado);
    }

    public double getMedida() {
        return 67;
    }
    public void alarmar(){
        if(this.getMedida() >= super.getValorUmbral() && super.getEstado()) {
            System.out.println("Sensor de presión activado");
        }
    }
}