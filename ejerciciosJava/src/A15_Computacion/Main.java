package A15_Computacion;

import A04_SeresVivos.Cliente_compu;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("--- 1. COMPONENTE ---");
        Componente cpu = new Componente(10, 50000, "Ryzen 5", "AMD");
        System.out.println("Fabricante: " + cpu.getNombreFabricante());
        System.out.println("Modelo: " + cpu.getModelo());
        System.out.println("Precio venta: $" + cpu.getPrecioVenta());
        System.out.println("Stock: " + cpu.getStock());


        System.out.println("tieneStock(5): " + cpu.tieneStock(5));
        System.out.println("tieneStock(15): " + cpu.tieneStock(15));


        System.out.println("agarrarStock(3): " + cpu.agarrarStock(3));
        System.out.println("Stock despues de sacar 3: " + cpu.getStock());
        System.out.println("agarrarStock(100): " + cpu.agarrarStock(100));

        cpu.aumentarPrecioVenta(10);
        System.out.println("Precio tras aumentar 10%: $" + cpu.getPrecioVenta());

        cpu.setPrecioVenta(55000);
        System.out.println("Precio tras setter: $" + cpu.getPrecioVenta());
        System.out.println();

        System.out.println("--- 2. CPU ---");
        CPU cpuIntel = new CPU(5, 80000, "i7-12700", "Intel");
        System.out.println("Fabricante: " + cpuIntel.getNombreFabricante());
        System.out.println("Modelo: " + cpuIntel.getModelo());
        System.out.println("Precio: $" + cpuIntel.getPrecioVenta());
        System.out.println("Stock: " + cpuIntel.getStock());
        System.out.println();

        System.out.println("--- 3. DISPOSITVO ENTRADA ---");
        DispositvoEntrada teclado = new DispositvoEntrada(20, 3000, "K380", "Logitech", "Teclado", 1, "Bluetooth");
        DispositvoEntrada mouse = new DispositvoEntrada(30, 2000, "MX Master", "Logitech", "Mouse", 1, "Wireless");
        System.out.println("Teclado: " + teclado.getNombreFabricante() + " " + teclado.getModelo() + " $" + teclado.getPrecioVenta());
        System.out.println("Mouse: " + mouse.getNombreFabricante() + " " + mouse.getModelo() + " $" + mouse.getPrecioVenta());
        System.out.println("Teclado es DispositvoEntrada: " + (teclado instanceof DispositvoEntrada));
        System.out.println("Teclado es Componente: " + (teclado instanceof Componente));
        System.out.println();

        System.out.println("--- 4. DISPOSITIVO SALIDA ---");
        DispositivoSalida monitor = new DispositivoSalida(8, 45000, "27GL850", "LG", "Monitor", 2, "HDMI");
        DispositivoSalida impresora = new DispositivoSalida(4, 35000, "LaserJet", "HP", "Impresora", 1, "Laser");
        System.out.println("Monitor: " + monitor.getNombreFabricante() + " " + monitor.getModelo() + " $" + monitor.getPrecioVenta());
        System.out.println("Impresora: " + impresora.getNombreFabricante() + " " + impresora.getModelo() + " $" + impresora.getPrecioVenta());
        System.out.println("Monitor es DispositivoSalida: " + (monitor instanceof DispositivoSalida));
        System.out.println();

        System.out.println("--- 5. COMPUTADORA ---");
        ArrayList<Componente> componentesPC1 = new ArrayList<>();
        componentesPC1.add(cpuIntel);
        componentesPC1.add(teclado);
        componentesPC1.add(mouse);
        componentesPC1.add(monitor);

        Computadora pc1 = new Computadora(componentesPC1);
        System.out.println("Cantidad de componentes: " + pc1.getComponentes().size());
        System.out.println("Precio total de la PC: $" + pc1.getPrecio());
        System.out.println("Desglose de componentes:");
        pc1.componentesEntadaYSalida();
        System.out.println();

        ArrayList<Componente> componentesPC2 = new ArrayList<>();
        componentesPC2.add(new CPU(3, 60000, "Ryzen 7", "AMD"));
        componentesPC2.add(new DispositivoSalida(5, 50000, "Odyssey G7", "Samsung", "Monitor", 2, "DisplayPort"));

        Computadora pc2 = new Computadora(componentesPC2);
        System.out.println("PC2 precio: $" + pc2.getPrecio());
        System.out.println("PC2 desglose:");
        pc2.componentesEntadaYSalida();
        System.out.println();

        System.out.println("--- 6. METODOS DE PAGO ---");
        MetodoDePago pagoBase = new MetodoDePago();
        PagoEnPesos efectivo = new PagoEnPesos();
        PagoConTarjeta tarjeta = new PagoConTarjeta();

        double costoEjemplo = 100000;
        System.out.println("Costo base: $" + costoEjemplo);
        System.out.println("MetodoDePago: $" + pagoBase.calcularCosto(costoEjemplo));
        System.out.println("PagoEnPesos (efectivo): $" + efectivo.calcularCosto(costoEjemplo));
        System.out.println("PagoConTarjeta (5% recargo): $" + tarjeta.calcularCosto(costoEjemplo));
        System.out.println();

        System.out.println("--- 7. COMPRA ---");
        Cliente_compu cliente = new Cliente_compu("Lucas", "Castelli", "Calle 123", LocalDate.of(1990, 5, 10), 200000);

        ArrayList<Computadora> compusCompra = new ArrayList<>();
        compusCompra.add(pc1);
        compusCompra.add(pc2);

        Compra compraEfectivo = new Compra(cliente, compusCompra, efectivo);
        System.out.println("Compra en efectivo:");
        compraEfectivo.mostrarCompraPlata();
        System.out.println();

        Compra compraTarjeta = new Compra(cliente, compusCompra, tarjeta);
        System.out.println("Compra con tarjeta:");
        compraTarjeta.mostrarCompraPlata();
        System.out.println();

        System.out.println("========================================");
        System.out.println("   PRUEBAS COMPLETADAS");
        System.out.println("========================================");
    }
}
