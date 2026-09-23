package A15_Computacion;

import java.util.ArrayList;

public class Computadora {
    private ArrayList<Componente> componentes;

    public Computadora(ArrayList<Componente> componentes) {
        this.componentes = componentes;
    }

    public Computadora(ArrayList<Componente> componentes, boolean validar) throws CompraInvalidaException, StockInsuficienteException {
        this.componentes = componentes;
        if (validar) {
            validarComponentesObligatorios();
            validarStock(1);
        }
    }

    public ArrayList<Componente> getComponentes() {
        return componentes;
    }
    public double getPrecio(){
        double precio = 0;
        for(Componente componente: this.componentes){
            precio = precio + componente.getPrecioVenta();
        }
        return precio;
    }
    public  void  componentesEntadaYSalida(){

        int numComponentesEntrada = 0;
        int numComponentesSalida = 0;
        for(Componente componente:this.componentes){
            numComponentesSalida+= componente.cantidadSalida();
            numComponentesEntrada+= componente.cantidadEntrada();
        }
        System.out.println("Componentes entrada: " + numComponentesEntrada);
        System.out.println("Componentes salida: " + numComponentesSalida);
    }


    public void validarComponentesObligatorios() throws CompraInvalidaException {
        boolean hasCPU = false;
        boolean hasEntrada = false;
        boolean hasSalida = false;
        int cantidadCPU = 0;

        for (Componente c : this.componentes) {
            if (c instanceof CPU) {
                hasCPU = true;
                cantidadCPU++;
            } else if (c instanceof DispositvoEntrada) {
                hasEntrada = true;
            } else if (c instanceof DispositivoSalida) {
                hasSalida = true;
            }
        }

        if (!hasCPU) {
            throw new CompraInvalidaException("La computadora debe incluir al menos una CPU.");
        }
        if (cantidadCPU > 1) {
            throw new CompraInvalidaException("La computadora no puede incluir más de una CPU. Se encontraron: " + cantidadCPU);
        }
        if (!hasEntrada) {
            throw new CompraInvalidaException("La computadora debe incluir al menos un dispositivo de entrada.");
        }
        if (!hasSalida) {
            throw new CompraInvalidaException("La computadora debe incluir al menos un dispositivo de salida.");
        }
    }


    public void validarStock(int cantidadSolicitada) throws StockInsuficienteException {
        for (Componente c : this.componentes) {
            c.validarStock(cantidadSolicitada);
        }
    }


    public void validarParaCompra(int cantidadSolicitada) throws CompraInvalidaException, StockInsuficienteException {
        validarComponentesObligatorios();
        validarStock(cantidadSolicitada);
    }

    public boolean esValida() {
        try {
            validarComponentesObligatorios();
            return true;
        } catch (CompraInvalidaException e) {
            return false;
        }
    }

    public boolean tieneStock(int cantidad) {
        for (Componente c : this.componentes) {
            if (!c.tieneStock(cantidad)) {
                return false;
            }
        }
        return true;
    }
}
