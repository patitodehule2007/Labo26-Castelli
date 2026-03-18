
package A01_intro;
import javax.swing.plaf.metal.MetalTreeUI;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class MontañaRusa {
    public static void main(String[] args) {

        List<Double> Alturas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        Double SumAlturas = 0.0;

        Double Aux = 1.0;

        System.out.println("Ingrese las alturas de la gente con este formato 1,4");


        while (Aux != 0){
            Aux = scanner.nextDouble();

            if(Aux != 0) {
                Alturas.add(Aux);
            }
        }
        for(int i = 0; i < Alturas.size();i++){
            SumAlturas+= Alturas.get(i);

            if(Alturas.get(i) < 1.4){
                System.out.println("ALERTA : La persona  mide que " + Alturas.get(i) + " Se tiene que retirar");
            }


        }


        System.out.println("Se subieron " + Alturas.size() + " personas") ;
        System.out.println("El promedio de altura es  " + (SumAlturas)/Alturas.size()) ;







    }

}
