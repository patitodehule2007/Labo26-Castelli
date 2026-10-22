package A33_pacientes;

public class Tratamiento {
    private int diasTratamiento;
    private Tratable paciente;

    public Tratamiento(Tratable paciente) {
        this.diasTratamiento = 0;
        this.paciente = paciente;
    }

    public int getDiasTratamiento() {
        return diasTratamiento;
    }

    public void setDiasTratamiento(int diasTratamiento) {
        this.diasTratamiento = diasTratamiento;
    }

    public Tratable getPaciente() {
        return paciente;
    }

    public void setPaciente(Tratable paciente) {
        this.paciente = paciente;
    }
    public void sumarDia(){
        diasTratamiento++;
    }
}
