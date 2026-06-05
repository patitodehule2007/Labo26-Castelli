package A15_Computacion;

import java.util.ArrayList;

public class Impresora  extends  DispositivoSalida{
    private ArrayList<Puertos> puertosValidos;
    private MetodoImpresion metodoImpresion;

    public Impresora(int stock, double precioVenta, String modelo, String nombreFabricante, String tipoDispositivo, int numPuertos, String metodoImpresion, ArrayList<Puertos> puertosValidos, MetodoImpresion metodoImpresion1) {
        super(stock, precioVenta, modelo, nombreFabricante, tipoDispositivo, numPuertos, metodoImpresion);
        this.puertosValidos = puertosValidos;
        this.metodoImpresion = metodoImpresion1;
    }
}
