package A14_ALARMAS;

import java.time.LocalDate;

public abstract class Sensor {
    private double valorUmbral;

    public Sensor(double valorUmbral) {
        this.valorUmbral = valorUmbral;
    }

    public abstract void alarmar();

    public abstract double getMedida();

    public double getValorUmbral() {
        return valorUmbral;
    }

    public void setValorUmbral(double valorUmbral) {
        this.valorUmbral = valorUmbral;
    }

}
