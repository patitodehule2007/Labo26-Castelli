package A22_Animales;

import java.util.Locale;

public class Gato extends Mascota {


    public Gato(String saludo, String nombre, String nombreDueno, int felicidad) {
        super(saludo, nombre, nombreDueno, felicidad,TipoMascota.GATO);
    }

    public  String repetirSaludo(String nombrePersona) {
        String saludoCompuesto = "";
        for (int i = 0; i <= super.getFelicidad(); i++) {
            saludoCompuesto.concat(super.getSaludo());
        }
        if (nombrePersona.equals(super.getNombreDueno())) {
            return saludoCompuesto.toUpperCase(Locale.ROOT).concat("!");
        }
        return saludoCompuesto;
    }

    @Override
    public void alimentar() {
        super.aumentarFelicidad();
    }
    @Override

    public void saludar(String nombrePersona){

    }
}
