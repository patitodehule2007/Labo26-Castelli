package A19_PracticaPrueba;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        Producto productoFresco = new  ProductoFresco(
                LocalDate.now(),
                1,
                "papa",
                167,
                PaisesOrigen.BRASIL,
                LocalDate.now()
        );
        Producto productoFresco2 = new  ProductoFresco(
                LocalDate.now(),
                10,
                "paia",
                160,
                PaisesOrigen.ARGENTINA,
                LocalDate.now()
        );

        Producto productoCongelado = new ProductoCongelado(
                LocalDate.now(),
                1,
                "carne",
                160,
                PaisesOrigen.ARGENTINA,
                LocalDate.now(),
                25
        );

        Producto productoCongelado2 = new ProductoCongelado(
                LocalDate.now(),
                1,
                "pollo",
                67,
                PaisesOrigen.ARGENTINA,
                LocalDate.now(),
                20
        );
        empresa.agregarProd(productoFresco);
        empresa.agregarProd(productoFresco2);
        empresa.agregarProd(productoCongelado);
        empresa.agregarProd(productoCongelado2);

        empresa.mostrarProdPaisese();

        System.out.println("codigo de producto envazado mas reciente: " + empresa.codProdMasReciente());

        System.out.println("Todos codigo de prod y serie");
        for(String cod:  empresa.getAllNumLotesAndID()){
            System.out.println(cod);
        }

    }
}
