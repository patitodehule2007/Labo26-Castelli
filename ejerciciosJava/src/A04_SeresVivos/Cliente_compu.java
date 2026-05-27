package A04_SeresVivos;

import java.time.LocalDate;

public class Cliente_compu extends Persona{
    private double saldo;

    public Cliente_compu(String nombre, String apellido, String direccion, LocalDate fechaNacimiento, double saldo) {
        super(nombre, apellido, direccion, fechaNacimiento);
        this.saldo = saldo;
    }
}
