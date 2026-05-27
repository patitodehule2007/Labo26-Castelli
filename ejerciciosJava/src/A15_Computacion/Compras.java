package A15_Computacion;

import A04_SeresVivos.Cliente_compu;

import java.util.ArrayList;

public class Compras {

    private Cliente_compu cliente;
    private ArrayList<Componente> componentes;
    private MetodoDePago metodoDePago;

    public Compras(Cliente_compu cliente, ArrayList<Componente> componentes) {
        this.cliente = cliente;
        this.componentes = componentes;

    }

    public double calcularPrecio(){
        this.metodoDePago.calcularCosto();
    }
}
