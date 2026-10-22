package A33_pacientes;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;

public class JovenTratable extends  Paciente implements Tratable {
    private static  int edadMinima= 20;
    private static  int edadMaxima = 30;
    private static  TipoSangre sangraObjetivo = TipoSangre.A;
    private static boolean  isPositivoObjetivo = true;
    private HashSet<String> actividades;



    public JovenTratable(String nombre, String direccion, String apellido, LocalDate fechaNacimiento, int edad, TipoSangre tipoSangre, boolean isPositivo, HashSet<String> actividades) {
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
        checkPaciente();
        super.cambiarTipoSangre(JovenTratable.getSangraObjetivo(),JovenTratable.isIsPositivoObjetivo());
        return "Será un tratamiento costoso, pero lo vamos a\n" +
                "lograr";
    }

    @Override
    public double calcularCostoTratamiento() {
        if(super.getFechaNacimiento().getYear() %2 == 0){
            return super.getFechaNacimiento().getMonth().getValue() * 760000;
        }
        return super.getFechaNacimiento().getDayOfMonth() *  145400;
    }

    @Override
    public void checkPaciente() throws TratamientoImposibleException {
        if(calcularAniosRestantes() <= 2 && actividades.size()%2 ==0){
            throw new TratamientoImposibleException("Lamentamos comunicarte que tu sangre aún no va a poder ser modificada");
        }
    }

    public static TipoSangre getSangraObjetivo() {
        return sangraObjetivo;
    }

    public static void setSangraObjetivo(TipoSangre sangraObjetivo) {
        JovenTratable.sangraObjetivo = sangraObjetivo;
    }

    public static boolean isIsPositivoObjetivo() {
        return isPositivoObjetivo;
    }

    public static void setIsPositivoObjetivo(boolean isPositivoObjetivo) {
        JovenTratable.isPositivoObjetivo = isPositivoObjetivo;
    }

    public HashSet<String> getActividades() {
        return actividades;
    }

    public void setActividades(HashSet<String> actividades) {
        this.actividades = actividades;
    }

    public  void insertarse(HashSet<Tratamiento> tratables,HashSet<Paciente> noTratables) throws TratamientoImposibleException{
        checkPaciente();
        tratables.add(new Tratamiento(this));
    }
}
