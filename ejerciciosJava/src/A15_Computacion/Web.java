package A15_Computacion;

import A04_SeresVivos.Cliente_compu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Web {
    private ArrayList<Compra> compras;
    private ArrayList<Componente> componentes;

    public Web() {
        this.compras = new ArrayList<>();
        this.componentes = new ArrayList<>();
    }

    public Web(ArrayList<Componente> componentes) {
        this.compras = new ArrayList<>();
        this.componentes = componentes != null ? componentes : new ArrayList<>();
    }

    public ArrayList<Componente> getComponentes() {
        return componentes;
    }

    public void agregarComponente(Componente c) {
        if (c != null) componentes.add(c);
    }

    public ArrayList<Compra> getCompras() {
        return compras;
    }

  

    private boolean SacarComponentes(Computadora computadora){
        try {
            sacarComponentes(computadora);
            return true;
        } catch (StockInsuficienteException e) {
            System.out.println("Error de stock: " + e.getMessage());
            return false;
        }
    }


    private void sacarComponentes(Computadora computadora) throws StockInsuficienteException {
        validarStock(computadora);
        for (Componente componente: computadora.getComponentes()){
            componente.agarrarStock(1);
        }
    }

    private void validarStock(Computadora computadora) throws StockInsuficienteException {
        for (Componente componente : computadora.getComponentes()) {
            if (!componente.tieneStock(1)) {
                throw new StockInsuficienteException(
                    "Stock insuficiente para " + componente.getNombreFabricante() + " " + componente.getModelo() +
                    ": solicitado 1, disponible " + componente.getStock(),
                    componente, componente.getStock(), 1);
            }
        }
    }

 
    private boolean hayStock(Computadora computadora){
        boolean hayStock = true;
        for(Componente componente :computadora.getComponentes()){
            if(!componente.tieneStock(1)){
                hayStock = false;
            }
        }
        return  hayStock;
    }

    private void validarPuedeComprar(Computadora computadora) throws CompraInvalidaException {
        if (computadora == null) {
            throw new CompraInvalidaException("La computadora no puede ser nula.");
        }

        computadora.validarComponentesObligatorios();

      
        if (componentes != null && !componentes.isEmpty()) {
            for (Componente curComp : computadora.getComponentes()) {
                if (!this.componentes.contains(curComp)) {
                    throw new CompraInvalidaException("Componente no registrado en el sistema: " + curComp.getModelo());
                }
            }
        }
    }


    private boolean puedeComprar(Computadora computadora){
        try {
            validarPuedeComprar(computadora);
            return true;
        } catch (CompraInvalidaException e) {
            System.out.println("Compra inválida: " + e.getMessage());
            return false;
        }
    }

    private int numUsoComponente(Componente componente){
        int numCompra = 0;
        for(Compra compra: this.compras){
            for(Computadora computadora: compra.getComputadora()){
                if(computadora.getComponentes().contains(componente)){
                    numCompra ++;
                }

            }
        }
        return  numCompra;
    }

    public  void  componenteMasComprado(){
        Componente componenteMasUsado = componentes.getFirst();

        for(Componente componente:this.componentes){
            if(this.numUsoComponente(componenteMasUsado) < this.numUsoComponente(componente)){
                componenteMasUsado = componente;
            }
        }
        System.out.println("Componente mas usado: ");
        System.out.println("Nombre: " + componenteMasUsado.getNombreFabricante());
        System.out.println("Stock: " + componenteMasUsado.getStock());
    }

    

    private void validarStockAgregado(ArrayList<Computadora> computadoras) throws StockInsuficienteException {
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

    public void comprar(ArrayList<Computadora> computadoras, Cliente_compu cliente, MetodoDePago metodoDePago) throws CompraInvalidaException, StockInsuficienteException {
        if (computadoras == null || computadoras.isEmpty()) {
            throw new CompraInvalidaException("La compra debe incluir al menos una computadora.");
        }

       
        for (Computadora computadora : computadoras) {
            validarPuedeComprar(computadora);
        }

        validarStockAgregado(computadoras);


        Map<Componente, Integer> conteo = new HashMap<>();
        for (Computadora compu : computadoras) {
            for (Componente c : compu.getComponentes()) {
                conteo.merge(c, 1, Integer::sum);
            }
        }
        for (Map.Entry<Componente, Integer> entry : conteo.entrySet()) {
            entry.getKey().agarrarStock(entry.getValue());
        }

        Compra compra = new Compra(cliente, computadoras, metodoDePago, false); // false = no volver a descontar stock
        this.compras.add(compra);
    }


    public void comprarLegacy(ArrayList<Computadora> computadoras, Cliente_compu cliente, MetodoDePago metodoDePago){
        ArrayList<Computadora> computadorasCheckeadas = new ArrayList<>();
        for(Computadora computadora: computadoras){
            if(this.puedeComprar(computadora) && this.SacarComponentes(computadora)){
                computadorasCheckeadas.add(computadora);
            }
        }
        if (computadorasCheckeadas.isEmpty()) {
            System.out.println("No se pudo realizar la compra: ninguna computadora válida.");
            return;
        }
        try {
            Compra compra = new Compra(cliente,computadorasCheckeadas,metodoDePago, false);
            this.compras.add(compra);
            System.out.println("Compra realizada con " + computadorasCheckeadas.size() + " computadora(s).");
        } catch (Exception e) {
            System.out.println("Error al crear la compra: " + e.getMessage());
        }
    }
}
