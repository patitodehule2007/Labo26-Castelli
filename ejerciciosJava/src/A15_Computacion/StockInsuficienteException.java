package A15_Computacion;

public class StockInsuficienteException extends Exception {
    private Componente componente;
    private int stockDisponible;
    private int cantidadSolicitada;

    public StockInsuficienteException(String message, Componente componente, int stockDisponible, int cantidadSolicitada) {
        super(message);
        this.componente = componente;
        this.stockDisponible = stockDisponible;
        this.cantidadSolicitada = cantidadSolicitada;
    }

    public StockInsuficienteException(String message) {
        super(message);
    }

    public Componente getComponente() {
        return componente;
    }

    public int getStockDisponible() {
        return stockDisponible;
    }

    public int getCantidadSolicitada() {
        return cantidadSolicitada;
    }
}
