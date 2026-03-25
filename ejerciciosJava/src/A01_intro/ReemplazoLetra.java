
package A01_intro;
import java.util.Scanner;

public class ReemplazoLetra {
    public static void main(String[] args) {
        String Palabra = "Demenge";
        char ReplacingLetter = 'e';
        char newLetter;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Palabra original: ");
        System.out.println(Palabra);

        System.out.println("Ingrese el caracter que remplazara a la e: ");
        newLetter = scanner.next().charAt(0);


        System.out.println("Palabra modificada: ");
        System.out.println(Palabra.replace(ReplacingLetter,newLetter));
    }
}
