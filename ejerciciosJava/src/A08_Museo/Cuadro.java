package A08_Museo;

import A04_SeresVivos.Persona;
import A05_Fechas.Fecha;


public class Cuadro {
    String titulo;
    Persona pintor;
    EstadoCuadro estado;
    Fecha fechaCreacion;
    Persona restaurador;

    public Cuadro(String titulo, Persona pintor, EstadoCuadro estado, Fecha fechaCreacion, Persona restaurador) {
        this.titulo = titulo;
        this.pintor = pintor;
        this.estado = estado;
        this.fechaCreacion = fechaCreacion;
        this.restaurador = restaurador;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Persona getPintor() {
        return pintor;
    }

    public void setPintor(Persona pintor) {
        this.pintor = pintor;
    }

    public EstadoCuadro getEstado() {
        return estado;
    }

    public void setEstado(EstadoCuadro estado) {
        this.estado = estado;
    }

    public Fecha getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Fecha fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Persona getRestaurador() {
        return restaurador;
    }

    public void setRestaurador(Persona restaurador) {
        this.restaurador = restaurador;
    }
}
