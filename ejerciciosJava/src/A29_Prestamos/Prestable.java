package A29_Prestamos;

public interface Prestable {
    void prestar() throws ObjetoNoPrestableException;
    boolean puedePrestarse();
    void devolver();
}
