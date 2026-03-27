package A03_Vehiculos;

public class Main {
    public static void main(String[] args) {
        // Autos
        Coche autoPrueba = new Coche("Marcedes","Ni idea", "negro");
        System.out.println("Marca: " + autoPrueba.getMarca());
        System.out.println("Velocidad: " + autoPrueba.getVelocidad());
        System.out.println("Acelerando..." );
        autoPrueba.acelerar(392);
        System.out.println("Velocidad: " + autoPrueba.getVelocidad() +   " KM");


    }
}
