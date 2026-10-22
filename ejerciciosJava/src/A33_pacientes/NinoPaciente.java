package A33_pacientes;


import java.time.LocalDate;
import java.util.HashSet;

public  class NinoPaciente extends Paciente implements Tratable {
    private int tolerancia;
    private static  TipoSangre sangraObjetivo = TipoSangre.A;
    private static boolean  isPositivoObjetivo = true;

    public NinoPaciente(String nombre, String direccion, String apellido, LocalDate fechaNacimiento, int edad, TipoSangre tipoSangre, boolean isPositivo, int tolerancia) throws IllegalArgumentException{
        super(nombre, direccion, apellido, fechaNacimiento, edad, tipoSangre, isPositivo);
        if(tolerancia > 10 || tolerancia < 1 ){
            throw  new IllegalArgumentException("Tolerancia invalida");
        }


        this.tolerancia = tolerancia;
    }


    @Override
    public String tratarse() throws TratamientoImposibleException {
        checkPaciente();
        super.cambiarTipoSangre(NinoPaciente.getSangraObjetivo(),NinoPaciente.isIsPositivoObjetivo());

        return "Tu tratamiento tardará esta cantidad de días:" + tolerancia*2;

    }

    public int getTolerancia() {
        return tolerancia;
    }

    public void setTolerancia(int tolerancia) {
        this.tolerancia = tolerancia;
    }

    public static TipoSangre getSangraObjetivo() {
        return sangraObjetivo;
    }

    public static void setSangraObjetivo(TipoSangre sangraObjetivo) {
        NinoPaciente.sangraObjetivo = sangraObjetivo;
    }

    public static boolean isIsPositivoObjetivo() {
        return isPositivoObjetivo;
    }

    public static void setIsPositivoObjetivo(boolean isPositivoObjetivo) {
        NinoPaciente.isPositivoObjetivo = isPositivoObjetivo;
    }

    @Override
    public double calcularCostoTratamiento() {
        return tolerancia*450000;
    }

    @Override
    public void checkPaciente() throws TratamientoImposibleException {
        if(super.getEdad() < 3){
            throw  new TratamientoImposibleException("Aún es chico para \n" +
                    "probar el tratamiento");
        }
    }

    public  void insertarse(HashSet<Tratamiento> tratables, HashSet<Paciente> noTratables) throws TratamientoImposibleException{
        checkPaciente();
        tratables.add(new Tratamiento(this));
    }


}