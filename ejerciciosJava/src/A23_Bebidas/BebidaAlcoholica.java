package A23_Bebidas;

public class BebidaAlcoholica extends  Bebidas {
    private double gradoAlcoholico;

    public BebidaAlcoholica(String nombre, double coeficientePositivo, double coeficienteNegativo, double gradoAlcoholico) {
        super(nombre, coeficientePositivo, coeficienteNegativo);
        this.gradoAlcoholico = gradoAlcoholico;
    }
}
