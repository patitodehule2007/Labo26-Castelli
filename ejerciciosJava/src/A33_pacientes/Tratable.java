package A33_pacientes;

public interface Tratable {
    String tratarse() throws  TratamientoImposibleException;
    double calcularCostoTratamiento();
    void checkPaciente() throws TratamientoImposibleException;
}
