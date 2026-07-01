package A21_Drones;

import java.time.LocalDate;

public class DronVigilancia  extends  Dron{
    private double mbEspacio ;

    public DronVigilancia(Estado estado, LocalDate fechaAdquisicion, String modelo, double mbEspacio) {
        super(estado, fechaAdquisicion, modelo);
        this.mbEspacio = mbEspacio;
    }
    public boolean hasSuficienteEspacio(double distancia){
        return  mbEspacio > (distancia * 12);
    }

    public boolean  HacerMision(Cordenada cordenada){
        double distancia = cordenada.calcularDistancia(Dron.getCordenadaBase());

        if(super.tieneCargaSuficiente(distancia)){
            return  false;
        }
        if (!hasSuficienteEspacio(distancia)) {
            return  false;
        }
        super.setEstado(Estado.VUELO);
        this.mbEspacio-= distancia*mbEspacio;
        descargar(48);
        super.setEstado(Estado.OPERATIVO);
        return  true;
    }

}
