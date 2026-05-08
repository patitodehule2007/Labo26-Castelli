package A04_SeresVivos;

import A11_Colegio.Buffet;
import A11_Colegio.Plato;

import java.time.LocalDate;

public class PersonaColegio extends Persona{
    public PersonaColegio(String nombre, String apellido, String direccion, LocalDate fechaNacimiento) {
        super(nombre, apellido, direccion, fechaNacimiento);
    }
    public void PedirPlato(Plato plato, Buffet buffet){
        buffet.ordenarPlato(this,plato);
    }
}
