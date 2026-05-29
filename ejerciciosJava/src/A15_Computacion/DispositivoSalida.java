package A15_Computacion;

public class DispositivoSalida  extends Componente {
    private String tipoDispositivo;
    private int numPuertos;
    private String metodoImpresion;

    public DispositivoSalida(int stock, double precioVenta, String modelo, String nombreFabricante, String tipoDispositivo, int numPuertos, String metodoImpresion) {
        super(stock, precioVenta, modelo, nombreFabricante);
        this.tipoDispositivo = tipoDispositivo;
        this.numPuertos = numPuertos;
        this.metodoImpresion = metodoImpresion;
    }
    @Override
    public int  cantidadSalida(){
        return 1;
    }
}
