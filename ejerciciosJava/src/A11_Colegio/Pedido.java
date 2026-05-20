package A11_Colegio;

import A04_SeresVivos.Persona;

import java.time.LocalDate;
import java.time.LocalTime;

public class Pedido {
    private Plato pato;
    private Persona persona;
    private LocalDate fechaCreacion;
    private LocalTime horaEntrega;
    private boolean entregado;
    // si bien el precio se puede calcular tomamos que una vez creado el pedido el precio no cambia
    // x mas de q se cambie el descuento
    private double precio;

    public Pedido(Plato pato, Persona persona, LocalTime horaEntrega, double precio) {
        this.pato = pato;
        this.persona = persona;
        this.fechaCreacion = LocalDate.now();
        this.horaEntrega = horaEntrega;
        this.precio = precio;
        this.entregado = false;
    }

    public double getPrecio() {
        return precio;
    }

    public Plato getPato() {
        return pato;
    }

    public Persona getPersona() {
        return persona;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public LocalTime getHoraEntrega() {
        return horaEntrega;
    }

    public void setEntregado(boolean entregado) {
        this.entregado = entregado;
    }

    public boolean isEntregado() {
        return entregado;
    }
}
