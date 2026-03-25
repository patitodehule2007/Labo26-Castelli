
package A01_intro;

import java.util.ArrayList;
import java.util.List;

public class ContarVocales {
    public static void main(String[] args) {
        List<Character> Vocales = new ArrayList<>(List.of('a','e', 'i', 'o', 'u'));
        String Palabra = "Domingo";
        Palabra = Palabra.toLowerCase();
        int numVocales = 0;



        for (int i = 0; i < Palabra.length() ; i++) {
            if(Vocales.contains((Palabra.charAt(i)))){
                numVocales++;
            }
        }
        System.out.println("Hay " + numVocales + " Vocales");
    }

}
