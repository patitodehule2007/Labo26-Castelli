package A15_Computacion;

import A04_SeresVivos.Cliente_compu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Compra {

    private Cliente_compu cliente;
    private ArrayList<Computadora> computadora;
    private MetodoDePago metodoDePago;

    public Compra(Cliente_compu cliente, ArrayList<Computadora> computadora, MetodoDePago metodoDePago) throws CompraInvalidaException, StockInsuficienteException {
        validarCompra(computadora);

        for (Computadora compu : computadora) {
            for (Componente c : compu.getComponentes()) {
                c.agarrarStock(1);
            }
        }
        this.cliente = cliente;
        this.computadora = computadora;
        this.metodoDePago = metodoDePago;
    }


    public static void validarCompra(ArrayList<Computadora> computadoras) throws CompraInvalidaException, StockInsuficienteException {
        if (computadoras == null || computadoras.isEmpty()) {
            throw new CompraInvalidaException("La compra debe incluir al menos una computadora.");
        }

        for (Computadora compu : computadoras) {
            if (compu == null) {
                throw new CompraInvalidaException("La computadora no puede ser nula.");
            }
            compu.validarComponentesObligatorios();
        }
      
        Map<Componente, Integer> conteo = new HashMap<>();
        for (Computadora compu : computadoras) {
            for (Componente c : compu.getComponentes()) {
                conteo.merge(c, 1, Integer::sum);
            }
        }
        for (Map.Entry<Componente, Integer> entry : conteo.entrySet()) {
            Componente comp = entry.getKey();
            int cantidadNecesaria = entry.getValue();
            if (!comp.tieneStock(cantidadNecesaria)) {
                throw new StockInsuficienteException(
                    "Stock insuficiente para " + comp.getNombreFabricante() + " " + comp.getModelo() +
                    ": solicitado " + cantidadNecesaria + ", disponible " + comp.getStock(),
                    comp, comp.getStock(), cantidadNecesaria);
            }
        }
    }


    public Compra(Cliente_compu cliente, ArrayList<Computadora> computadora, MetodoDePago metodoDePago, boolean validar) throws CompraInvalidaException, StockInsuficienteException {
        if (validar) {
            validarCompra(computadora);
            for (Computadora compu : computadora) {
                for (Componente c : compu.getComponentes()) {
                    c.agarrarStock(1);
                }
            }
        }
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
