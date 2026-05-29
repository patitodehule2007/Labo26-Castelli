package A15_Computacion;

public class DispositvoEntrada  extends Componente{
    private String tipoDispositivo;
    private int numPuertos;
    private String metodoImpresion;

    public DispositvoEntrada(int stock, double precioVenta, String modelo, String nombreFabricante, String tipoDispositivo, int numPuertos, String metodoImpresion) {
        super(stock, precioVenta, modelo, nombreFabricante);
        this.tipoDispositivo = tipoDispositivo;
        this.numPuertos = numPuertos;
        this.metodoImpresion = metodoImpresion;
    }
    @Override
    public int  cantidadEntrada(){
        return 1;
    }
}
