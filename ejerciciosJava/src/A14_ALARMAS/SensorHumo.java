package A14_ALARMAS;

import java.time.LocalDate;

public class SensorHumo extends SensorUnit {

    public SensorHumo(double valorUmbral, LocalDate fechaAdquirido, boolean estado) {
        super(valorUmbral, fechaAdquirido, estado);
    }

    public double getMedida() {
        return 49;
    }
    public void alarmar(){
        if(this.getMedida() >= super.getValorUmbral() && super.getEstado()) {
            System.out.println("wiu wiu wiu llamen a los bomberos");
        }
    }
}
