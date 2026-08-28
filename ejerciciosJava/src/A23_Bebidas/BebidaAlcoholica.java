package A23_Bebidas;

public class BebidaAlcoholica extends Bebida {
    private double gradoAlcoholico;

    public BebidaAlcoholica(String nombre, double coeficientePositivo, double gradoAlcoholico) {
        super(nombre, coeficientePositivo, gradoAlcoholico*20);
        this.gradoAlcoholico = gradoAlcoholico;
    }
}
