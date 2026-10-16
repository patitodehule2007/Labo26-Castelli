package A30_Elecciones;

import java.util.ArrayList;

public class PartidoPolitico {
    private String nombre;
    private String direccionOficinaCentral;
    private int cantidadAfiliados;
    private ArrayList<Mensajero> mensajeros;

    public PartidoPolitico(String nombre, String direccionOficinaCentral, int cantidadAfiliados) {
        this.nombre = nombre;
        this.direccionOficinaCentral = direccionOficinaCentral;
        this.cantidadAfiliados = cantidadAfiliados;
        this.mensajeros = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccionOficinaCentral() {
        return direccionOficinaCentral;
    }

    public int getCantidadAfiliados() {
        return cantidadAfiliados;
    }

    public ArrayList<Mensajero> getMensajeros() {
        return mensajeros;
    }

    public void agregarMensajero(Mensajero mensajero) {
        this.mensajeros.add(mensajero);
    }

    public void hacerCampania() {
        for (Mensajero mensajero : this.mensajeros) {
            try {
                mensajero.enviarMensaje("Vote por el partido para un mejor futuro");
            } catch (ErrorEnvioMensajeException e) {
                System.out.println("No se pudo enviar el mensaje: " + e.getMessage());
            }
        }
    }
}
