package A33_pacientes;

import java.time.LocalDate;
import java.util.ArrayList;

public class JovenTratable extends  Paciente implements Tratable {
    private static  int edadMinima= 20;
    private static  int edadMaxima = 30;
    private ArrayList<String> actividades;


    public JovenTratable(String nombre, String direccion, String apellido, LocalDate fechaNacimiento, int edad, TipoSangre tipoSangre, boolean isPositivo, ArrayList<String> actividades) {
        super(nombre, direccion, apellido, fechaNacimiento, edad, tipoSangre, isPositivo);
        if( edad > JovenTratable.getEdadMaxima()  || edad < JovenTratable.getEdadMinima() ){
            throw  new IllegalArgumentException("La edad del joven tiene que ser entre " + JovenTratable.getEdadMinima() + " a " + JovenTratable.getEdadMaxima());
        }
        this.actividades = actividades;
    }

    public static int getEdadMinima() {
        return edadMinima;
    }

    public static void setEdadMinima(int edadMinima) {
        JovenTratable.edadMinima = edadMinima;
    }

    public static int getEdadMaxima() {
        return edadMaxima;
    }

    public static void setEdadMaxima(int edadMaxima) {
        JovenTratable.edadMaxima = edadMaxima;
    }

    private int calcularAniosRestantes(){
        return JovenTratable.edadMaxima - super.getEdad();
    }

    public String tratarse() throws  TratamientoImposibleException{
        if(calcularAniosRestantes() <= 2 && actividades.size()%2 ==0){
            throw new TratamientoImposibleException("Lamentamos comunicarte que tu sangre aún no va a poder ser modificada");
        }
        return "Será un tratamiento costoso, pero lo vamos a\n" +
                "lograr";
    }

}
