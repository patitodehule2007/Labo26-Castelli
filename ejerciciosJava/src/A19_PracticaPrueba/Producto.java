package A19_PracticaPrueba;

import java.time.LocalDate;

public class Producto {
    private LocalDate fechaVencimiento;
    private int numeroLote;
    private String nombre;
    private int codigoIdentificacion;
    private EmpresaOrigen empresaOrigen;
    private PaisesOrigen paisesOrigen;
    private LocalDate fechaEmbasado;


    public Producto(LocalDate fechaVencimiento, int numeroLote, String nombre, int codigoIdentificacion, PaisesOrigen paisesOrigen, LocalDate fechaEmbasado) {
        this.fechaVencimiento = fechaVencimiento;
        this.numeroLote = numeroLote;
        this.nombre = nombre;
        this.codigoIdentificacion = codigoIdentificacion;
        this.empresaOrigen = EmpresaOrigen.POLI_AGROS;
        this.paisesOrigen = paisesOrigen;
        this.fechaEmbasado = fechaEmbasado;
    }

    public String getNumLoteYcodigoIdentificacion(){
        return  this.codigoIdentificacion + ": " + this.numeroLote;
    }
    public Producto EnvazadoDespues(Producto compracion){
        if(compracion.getFechaVencimiento().isBefore(this.fechaVencimiento)){
            return  this;
        }
        else return  compracion;
    }
    public  boolean doesitEnvazadoDespues(Producto comparacion){
        return  this.equals(this.EnvazadoDespues(comparacion));
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }
    public boolean envazoDespuesFresco(Producto comparacon){
        return  false;
    }

    public int getCodigoIdentificacion() {
        return codigoIdentificacion;
    }
    public  boolean isFrom(PaisesOrigen pais){
        return  this.paisesOrigen.equals(pais);
    }

    public String getNombre() {
        return nombre;
    }
    public String getInfoNutricional(){
        return "833";
    }
}
