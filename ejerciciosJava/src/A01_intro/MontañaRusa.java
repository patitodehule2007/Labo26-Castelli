
package A01_intro;
import javax.swing.plaf.metal.MetalTreeUI;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class MontañaRusa {
    public static void main(String[] args) {

        List<Double> alturas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        Double sumAlturas = 0.0;

        Double aux = 1.0;

        System.out.println("Ingrese las alturas de la gente con este formato 1,4");


        while (aux != 0){
            aux = scanner.nextDouble();

            if(aux != 0) {
                alturas.add(aux);
            }
        }
        for(int i = 0; i < alturas.size();i++){
            sumAlturas+= alturas.get(i);

            if(alturas.get(i) < 1.4){
                System.out.println("ALERTA : La persona  mide que " + alturas.get(i) + " Se tiene que retirar");
            }


        }
        System.out.println("Se subieron " + alturas.size() + " personas") ;
        System.out.println("El promedio de altura es  " + (sumAlturas)/alturas.size()) ;

    }

}
