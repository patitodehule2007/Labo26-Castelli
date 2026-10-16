package A30_Elecciones;

public class PalomaMensajera extends Ave implements Mensajero {
    private boolean aprendioMapa;

    public PalomaMensajera(String color, String nombre, String especie, boolean aprendioMapa) {
        super(color, nombre, especie);
        this.aprendioMapa = aprendioMapa;
    }

    public boolean getAprendioMapa() {
        return aprendioMapa;
    }

    public void setAprendioMapa(boolean aprendioMapa) {
        this.aprendioMapa = aprendioMapa;
    }

    @Override
    public void enviarMensaje(String mensaje) {
        if (this.aprendioMapa) {
            System.out.println("Lanzando un papelito que dice: " + mensaje);
        }
    }
}
