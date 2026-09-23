package A28_errores;

public class ejercicio1 {
    public static  int ObtenerLongitud(String palabra) throws ErrorStringInvalido{

        try {
            return  palabra.length();
        }
        catch (NullPointerException e){
            throw new ErrorStringInvalido("Error textoInvalido",palabra);
        }
    }

    public static void main(String[] args){
        String nombre = null;
        try{
            System.out.println("El largo del nombre es:" + ObtenerLongitud(nombre));
        }
        catch (ErrorStringInvalido e){
            System.out.println(e.getMessage());
        }
    }
}
