package A28_errores;

public class ErrorStringInvalido extends Exception {
    private  String stringInvalido;

    public ErrorStringInvalido(String message, String stringInvalido) {
        super(message);
        this.stringInvalido = stringInvalido;
    }
}
