package A35_repasopruebaU8;

import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Bizcochuelo bizcochuelo = new Bizcochuelo(-200, 100, 50, 2, 500, 10, 1, 10);
        Brownie brownie = new Brownie(200, 100, 50, 2, 700, 8, 150);
        Cookie cookie = new Cookie(100, 40, 30, 1, 300, 12, 5, Topping.OREOS);

        Sistema sistema = new Sistema(new HashSet<>(), new HashSet<>(), new HashMap<>());

        // prueba bizcochuelo
        System.out.println(bizcochuelo.conocerReceta());
        try {
            sistema.nuevaPreparacion(bizcochuelo);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        // bronies
        sistema.nuevaPreparacion(brownie);

        System.out.println(brownie.conocerReceta());
        System.out.println(brownie.mensajePromocion());

        try {
            sistema.registrarVenta(brownie,80);
        } catch (NotEnoughtInventoryException e) {
            System.out.println(e.getMessage());;
        }
        System.out.println(brownie.agregarStock(10000));
        try {
            sistema.registrarVenta(brownie,80);
        } catch (NotEnoughtInventoryException e) {
            System.out.println(e.getMessage());;
        }
        // cookie

        sistema.nuevaPreparacion(cookie);

        System.out.println(cookie.conocerReceta());
        System.out.println(cookie.mensajePromocion());
        sistema.registrarVenta(cookie,2);


    }
}
