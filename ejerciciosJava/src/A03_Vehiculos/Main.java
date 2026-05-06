package A03_Vehiculos;

public class Main {
    public static void main(String[] args) {
        // Autos
        Coche autoPrueba = new Coche("Marcedes","Ni idea", "negro",8,2000,799,"juan");
        System.out.println("Marca: " + autoPrueba.getMarca());
        System.out.println("Velocidad: " + autoPrueba.getVelocidad());
        System.out.println("Acelerando..." );
        autoPrueba.acelerar(392);
        System.out.println("Velocidad: " + autoPrueba.getVelocidad() +   " KM");

        Submarino submarino = new Submarino("gol",9999);
        submarino.emerger(99999.9);
        submarino.sumergir(99999.9);


    }
}
