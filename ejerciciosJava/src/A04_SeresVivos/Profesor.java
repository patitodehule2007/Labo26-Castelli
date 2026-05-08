package A04_SeresVivos;

import java.time.LocalDate;

public class Profesor  extends PersonaColegio{
    private int porcentajeDescuento;
    public Profesor(String nombre,String apellido, String direccion, LocalDate fechaNacimiento,int porcentajeDescuento){
        super(nombre,apellido,direccion,fechaNacimiento);
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public int getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(int porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }
}
