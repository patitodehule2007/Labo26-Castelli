package A14_ALARMAS;

import java.time.LocalDate;

public class Sensor {
    private double valorUmbral;

    public Sensor(double valorUmbral) {
        this.valorUmbral = valorUmbral;
    }
    public void alarmar(){

    }

    public double getMedida(){
        return  0;
    }

    public double getValorUmbral() {
        return valorUmbral;
    }

    public void setValorUmbral(double valorUmbral) {
        this.valorUmbral = valorUmbral;
    }

}
