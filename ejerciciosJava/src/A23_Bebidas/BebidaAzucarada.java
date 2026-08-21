package A23_Bebidas;

public class BebidaAzucarada extends  Bebidas{
    private double cantidadAzucar;

    public BebidaAzucarada(String nombre, double cantidadAzucar) {
        super(nombre, 1, cantidadAzucar*10);
        this.cantidadAzucar = cantidadAzucar;
    }
}
