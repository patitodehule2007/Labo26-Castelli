package A21_Drones;

import java.time.LocalDate;
import java.util.Locale;

public class DronCarga  extends  Dron{
    private double pesoCarga;

    public DronCarga(Estado estado, LocalDate fechaAdquisicion, String modelo, double pesoCarga) {
        super(estado, fechaAdquisicion, modelo);
        this.pesoCarga = pesoCarga;
    }

    public boolean  HacerMision(Cordenada cordenada){
        if(super.tieneCargaSuficiente(cordenada.calcularDistancia(Dron.getCordenadaBase()))){
            return  false;
        }
        super.setEstado(Estado.VUELO);
        descargar(48);
        setEstado(Estado.OPERATIVO);
        return  true;
    }

}
