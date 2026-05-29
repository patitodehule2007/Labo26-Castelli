package A15_Computacion;

import A04_SeresVivos.Cliente_compu;

import java.util.ArrayList;

public class Compra {

    private Cliente_compu cliente;
    private ArrayList<Computadora> computadora;
    private MetodoDePago metodoDePago;

    public Compra(Cliente_compu cliente, ArrayList<Computadora> computadora, MetodoDePago metodoDePago) {
        this.cliente = cliente;
        this.computadora = computadora;
        this.metodoDePago = metodoDePago;
    }
    private  double getCosto(){
        double precioTotal = 0;
        for(Computadora computadora: this.computadora){
            precioTotal = precioTotal + computadora.getPrecio();
        }
        return precioTotal;
    }

    public double calcularPrecio(){

        return this.metodoDePago.calcularCosto(getCosto());
    }

    public void  mostrarCompraPlata(){
        System.out.println("Total: " + this.calcularPrecio());
        System.out.println("Precio con recargo: " + this.getCosto());
        System.out.println("Recargo: " +(this.calcularPrecio() - this.getCosto()));
    }

    public Cliente_compu getCliente() {
        return cliente;
    }

    public void setCliente(Cliente_compu cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Computadora> getComputadora() {
        return computadora;
    }

    public void setComputadora(ArrayList<Computadora> computadora) {
        this.computadora = computadora;
    }

    public MetodoDePago getMetodoDePago() {
        return metodoDePago;
    }

    public void setMetodoDePago(MetodoDePago metodoDePago) {
        this.metodoDePago = metodoDePago;
    }
}
