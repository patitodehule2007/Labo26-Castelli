package A04_SeresVivos;

import A11_Colegio.Buffet;
import A11_Colegio.Plato;

import java.time.LocalDate;
import java.time.LocalTime;

public abstract class PersonaColegio extends Persona{
    public PersonaColegio(String nombre, String apellido, String direccion, LocalDate fechaNacimiento) {
        super(nombre, apellido, direccion, fechaNacimiento);
    }
    public void PedirPlato(Plato plato, Buffet buffet, LocalTime horaEntrega){
        buffet.ordenarPlato(this,plato,horaEntrega);
    }
}
