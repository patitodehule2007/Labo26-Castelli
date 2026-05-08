package A11_Colegio;

import A04_SeresVivos.Persona;

import java.time.LocalDate;

public class Pedido {
    private Plato pato;
    private Persona persona;
    private LocalDate fechaCreacion;
    private LocalDate fechaEntrega;
    private boolean entregado;
    // si bien el precio se puede calcular tomamos que una vez creado el pedido el precio no cambia
    // x mas de q se cambie el descuento
    private double precio;

    public Pedido(Plato pato, Persona persona, LocalDate fechaEntrega,double precio) {
        this.pato = pato;
        this.persona = persona;
        this.fechaCreacion = LocalDate.now();
        this.fechaEntrega = fechaEntrega;
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

    public LocalDate getFechaEntrega() {
        return fechaEntrega;
    }

    public void setEntregado(boolean entregado) {
        this.entregado = entregado;
    }

    public boolean isEntregado() {
        return entregado;
    }
}
