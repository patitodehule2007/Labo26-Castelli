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

        try {
            System.out.println("agarrarStock(3): " + cpu.agarrarStock(3));
        } catch (StockInsuficienteException e) {
            System.out.println("Error agarrarStock(3): " + e.getMessage());
        }
        System.out.println("Stock despues de sacar 3: " + cpu.getStock());
        try {
            System.out.println("agarrarStock(100): " + cpu.agarrarStock(100));
        } catch (StockInsuficienteException e) {
            System.out.println("Error agarrarStock(100): " + e.getMessage() + " (stock insuficiente capturado correctamente)");
        }

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

    
        ArrayList<Computadora> compusCompraValida = new ArrayList<>();
        compusCompraValida.add(pc1);

        try {
  CPU cpuDemo = new CPU(5, 80000, "i7-12700", "Intel");
            DispositvoEntrada tecladoDemo = new DispositvoEntrada(20, 3000, "K380", "Logitech", "Teclado", 1, "Bluetooth");
            DispositvoEntrada mouseDemo = new DispositvoEntrada(30, 2000, "MX Master", "Logitech", "Mouse", 1, "Wireless");
            DispositivoSalida monitorDemo = new DispositivoSalida(8, 45000, "27GL850", "LG", "Monitor", 2, "HDMI");
            ArrayList<Componente> compDemo = new ArrayList<>();
            compDemo.add(cpuDemo);
            compDemo.add(tecladoDemo);
            compDemo.add(monitorDemo);
            Computadora pcValida = new Computadora(compDemo);
            ArrayList<Computadora> compraValidaList = new ArrayList<>();
            compraValidaList.add(pcValida);

            Compra compraEfectivo = new Compra(cliente, compraValidaList, efectivo);
            System.out.println("Compra válida en efectivo (debe tener éxito):");
            compraEfectivo.mostrarCompraPlata();
            System.out.println();


            CPU cpuDemo2 = new CPU(5, 80000, "i7-12700", "Intel");
            DispositvoEntrada tecladoDemo2 = new DispositvoEntrada(20, 3000, "K380", "Logitech", "Teclado", 1, "Bluetooth");
            DispositivoSalida monitorDemo2 = new DispositivoSalida(8, 45000, "27GL850", "LG", "Monitor", 2, "HDMI");
            ArrayList<Componente> compDemo2 = new ArrayList<>();
            compDemo2.add(cpuDemo2);
            compDemo2.add(tecladoDemo2);
            compDemo2.add(monitorDemo2);
            Computadora pcValida2 = new Computadora(compDemo2);
            ArrayList<Computadora> compraValidaList2 = new ArrayList<>();
            compraValidaList2.add(pcValida2);
            Compra compraTarjeta = new Compra(cliente, compraValidaList2, tarjeta);
            System.out.println("Compra válida con tarjeta (debe tener éxito, 5% recargo):");
            compraTarjeta.mostrarCompraPlata();
            System.out.println();
        } catch (StockInsuficienteException e) {
            System.out.println("Error de stock en compra válida (no debería pasar): " + e.getMessage());
        } catch (CompraInvalidaException e) {
            System.out.println("Error de compra inválida (no debería pasar): " + e.getMessage());
        }

     
        System.out.println("--- 7b. PRUEBA COMPRA INVÁLIDA (falta dispositivo de entrada) ---");
        System.out.println("pc2 tiene: CPU + DispositivoSalida pero NO tiene DispositvoEntrada");
        System.out.println("Validación pc2: ");
        try {
            pc2.validarComponentesObligatorios();
            System.out.println("pc2 validada (ERROR: debería haber fallado)");
        } catch (CompraInvalidaException e) {
            System.out.println("Correctamente detectada compra inválida: " + e.getMessage());
        }
        ArrayList<Computadora> compusInvalidas = new ArrayList<>();
        compusInvalidas.add(pc2);
        try {
            Compra compraInvalida = new Compra(cliente, compusInvalidas, efectivo);
            System.out.println("ERROR: compra inválida no lanzó excepción");
            compraInvalida.mostrarCompraPlata();
        } catch (CompraInvalidaException e) {
            System.out.println("Compra no realizada por falta de componentes: " + e.getMessage());
        } catch (StockInsuficienteException e) {
            System.out.println("Error de stock inesperado: " + e.getMessage());
        }
        System.out.println();


        System.out.println("--- 7c. PRUEBA COMPRA INVÁLIDA (falta CPU) ---");
        ArrayList<Componente> compsSinCPU = new ArrayList<>();
        compsSinCPU.add(new DispositvoEntrada(10, 3000, "K120", "Logitech", "Teclado", 1, "USB"));
        compsSinCPU.add(new DispositivoSalida(10, 45000, "24MP", "LG", "Monitor", 1, "HDMI"));
        Computadora pcSinCPU = new Computadora(compsSinCPU);
        ArrayList<Computadora> listaSinCPU = new ArrayList<>();
        listaSinCPU.add(pcSinCPU);
        try {
            Compra compraSinCPU = new Compra(cliente, listaSinCPU, efectivo);
            System.out.println("ERROR: debería haber fallado por falta de CPU");
        } catch (CompraInvalidaException e) {
            System.out.println("Correctamente detectada falta de CPU: " + e.getMessage());
        } catch (StockInsuficienteException e) {
            System.out.println("Error de stock inesperado: " + e.getMessage());
        }
        System.out.println();


        System.out.println("--- 7d. PRUEBA COMPRA INVÁLIDA (falta dispositivo de salida) ---");
        ArrayList<Componente> compsSinSalida = new ArrayList<>();
        compsSinSalida.add(new CPU(5, 70000, "Ryzen 5", "AMD"));
        compsSinSalida.add(new DispositvoEntrada(10, 3000, "K120", "Logitech", "Teclado", 1, "USB"));
        Computadora pcSinSalida = new Computadora(compsSinSalida);
        ArrayList<Computadora> listaSinSalida = new ArrayList<>();
        listaSinSalida.add(pcSinSalida);
        try {
            Compra compraSinSalida = new Compra(cliente, listaSinSalida, efectivo);
            System.out.println("ERROR: debería haber fallado por falta de salida");
        } catch (CompraInvalidaException e) {
            System.out.println("Correctamente detectada falta de salida: " + e.getMessage());
        } catch (StockInsuficienteException e) {
            System.out.println("Error de stock inesperado: " + e.getMessage());
        }
        System.out.println();

        // --- Stock insuficiente ---
        System.out.println("--- 7e. PRUEBA STOCK INSUFICIENTE ---");
        Componente ramPocoStock = new Componente(1, 15000, "Fury 8GB", "Kingston");
        ramPocoStock.setStock(1); // solo 1 unidad
        CPU cpuStockOk = new CPU(10, 80000, "i5", "Intel");
        DispositvoEntrada tecladoStock = new DispositvoEntrada(10, 3000, "K120", "Logitech", "Teclado", 1, "USB");
        DispositivoSalida monitorStock = new DispositivoSalida(10, 45000, "24MP", "LG", "Monitor", 1, "HDMI");
        // Creamos dos computadoras que usan el mismo objeto ramPocoStock (stock compartido)
        ArrayList<Componente> compStock1 = new ArrayList<>();
        compStock1.add(cpuStockOk);
        compStock1.add(tecladoStock);
        compStock1.add(monitorStock);
        compStock1.add(ramPocoStock);
        Computadora pcStock1 = new Computadora(compStock1);
        ArrayList<Componente> compStock2 = new ArrayList<>();
        // Reusamos el mismo ramPocoStock, con stock ya limitado
        compStock2.add(new CPU(10, 80000, "i5-2", "Intel"));
        compStock2.add(new DispositvoEntrada(10, 3000, "Mouse", "Logitech", "Mouse", 1, "USB"));
        compStock2.add(new DispositivoSalida(10, 45000, "Monitor2", "Samsung", "Monitor", 1, "HDMI"));
        compStock2.add(ramPocoStock);
        Computadora pcStock2 = new Computadora(compStock2);

        // Primera compra consume el único stock de ramPocoStock
        ArrayList<Computadora> listaStock1 = new ArrayList<>();
        listaStock1.add(pcStock1);
        try {
            Compra compraStock1 = new Compra(cliente, listaStock1, efectivo);
            System.out.println("Primera compra con ramPocoStock: éxito, stock restante de RAM: " + ramPocoStock.getStock());
        } catch (Exception e) {
            System.out.println("Error primera compra: " + e.getMessage());
        }
        // Segunda compra debería fallar por stock insuficiente
        ArrayList<Computadora> listaStock2 = new ArrayList<>();
        listaStock2.add(pcStock2);
        try {
            Compra compraStock2 = new Compra(cliente, listaStock2, efectivo);
            System.out.println("ERROR: segunda compra debería haber fallado por stock insuficiente");
        } catch (StockInsuficienteException e) {
            System.out.println("Correctamente detectado stock insuficiente: " + e.getMessage());
            System.out.println("Compra no realizada, el usuario es informado.");
        } catch (CompraInvalidaException e) {
            System.out.println("Error compra inválida inesperado: " + e.getMessage());
        }
        System.out.println();

        // --- Demostración con Web ---
        System.out.println("--- 7f. PRUEBA WEB.COMPRAR CON EXCEPCIONES ---");
        Web web = new Web();
        web.agregarComponente(cpuStockOk);
        web.agregarComponente(tecladoStock);
        web.agregarComponente(monitorStock);
        web.agregarComponente(ramPocoStock);
        // Agregar componentes de pc válida
        CPU cpuWeb = new CPU(5, 80000, "i7-Web", "Intel");
        DispositvoEntrada tecladoWeb = new DispositvoEntrada(10, 3000, "KWeb", "Logitech", "Teclado", 1, "USB");
        DispositivoSalida monitorWeb = new DispositivoSalida(10, 45000, "MWeb", "LG", "Monitor", 1, "HDMI");
        web.agregarComponente(cpuWeb);
        web.agregarComponente(tecladoWeb);
        web.agregarComponente(monitorWeb);
        ArrayList<Componente> compWeb = new ArrayList<>();
        compWeb.add(cpuWeb);
        compWeb.add(tecladoWeb);
        compWeb.add(monitorWeb);
        Computadora pcWeb = new Computadora(compWeb);
        ArrayList<Computadora> listaWeb = new ArrayList<>();
        listaWeb.add(pcWeb);
        try {
            web.comprar(listaWeb, cliente, efectivo);
            System.out.println("Web.comprar válida: éxito");
        } catch (StockInsuficienteException e) {
            System.out.println("Web stock insuficiente: " + e.getMessage());
        } catch (CompraInvalidaException e) {
            System.out.println("Web compra inválida: " + e.getMessage());
        }

        // Intento con falta de componentes vía Web
        ArrayList<Componente> compWebInvalida = new ArrayList<>();
        compWebInvalida.add(cpuWeb);
        compWebInvalida.add(monitorWeb); // falta entrada
        Computadora pcWebInvalida = new Computadora(compWebInvalida);
        ArrayList<Computadora> listaWebInvalida = new ArrayList<>();
        listaWebInvalida.add(pcWebInvalida);
        try {
            web.comprar(listaWebInvalida, cliente, efectivo);
            System.out.println("ERROR: web debería haber rechazado falta de entrada");
        } catch (CompraInvalidaException e) {
            System.out.println("Web correctamente rechazó compra inválida: " + e.getMessage());
        } catch (StockInsuficienteException e) {
            System.out.println("Error stock inesperado: " + e.getMessage());
        }

        System.out.println();
        System.out.println("========================================");
        System.out.println("   PRUEBAS COMPLETADAS - EXCEPCIONES MANEJADAS");
        System.out.println("========================================");
    }
}
