package A14_ALARMAS;

import java.time.LocalDate;

public class SensorTemperatura  extends SensorUnit{
    public SensorTemperatura(double valorUmbral, LocalDate fechaAdquirido, boolean estado) {
        super(valorUmbral, fechaAdquirido, estado);
    }

    public double getMedida() {
        return 31;
    }
    public void alarmar(){
        if(this.getMedida() >= super.getValorUmbral() && super.getEstado()) {
            System.out.println("¡Cuidado! La temperatura sube");
        }
    }
}
