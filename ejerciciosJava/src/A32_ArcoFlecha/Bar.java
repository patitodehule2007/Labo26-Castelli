package A32_ArcoFlecha;

import java.util.ArrayList;
import java.util.List;

public class Bar {
    private String nombre;
    private List<Diana> dianas = new ArrayList<>();
    private int cantidadClientes;
    private double dineroRecaudado;
    private List<Beneficio> beneficios = new ArrayList<>();
    private List<BeneficioAcumulable> beneficiosAcumulables = new ArrayList<>();

    public Bar(String nombre) {
        this.nombre = nombre;
    }

    public void agregarDiana(Diana diana) {
        dianas.add(diana);
    }

    public void implementarBeneficio(Beneficio beneficio) {
        beneficios.add(beneficio);
        if (beneficio instanceof BeneficioAcumulable) {
            beneficiosAcumulables.add((BeneficioAcumulable) beneficio);
        }
    }

    public void registrarJuego(double montoCobrado) {
        cantidadClientes++;
        dineroRecaudado += montoCobrado;
    }

    public long contarBeneficiosDeTragos() {
        long cantidad = 0;
        for (Beneficio beneficio : beneficios) {
            if (beneficio instanceof BeneficioTrago) {
                cantidad++;
            }
        }
        return cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Diana> getDianas() {
        return new ArrayList<>(dianas);
    }

    public int getCantidadClientes() {
        return cantidadClientes;
    }

    public double getDineroRecaudado() {
        return dineroRecaudado;
    }

    public List<Beneficio> getBeneficios() {
        return new ArrayList<>(beneficios);
    }

    public List<BeneficioAcumulable> getBeneficiosAcumulables() {
        return new ArrayList<>(beneficiosAcumulables);
    }
}
