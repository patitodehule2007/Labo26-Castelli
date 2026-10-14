package A29_Prestamos;

public abstract class ObjetoPrestable implements Prestable {
    private boolean prestado;

    public abstract String getNombreObjeto();
    public abstract boolean cumpleRequisitoPrestamo();

    @Override
    public void prestar() throws ObjetoNoPrestableException {
        if (!puedePrestarse()) {
            throw new ObjetoNoPrestableException("El objeto " + getNombreObjeto() + " no se puede prestar");
        }

        prestado = true;
        System.out.println("El/La " + getNombreObjeto() + " se dara prestado");
    }

    @Override
    public boolean puedePrestarse() {
        return !prestado && cumpleRequisitoPrestamo();
    }

    @Override
    public void devolver() {
        prestado = false;
    }

    public boolean isPrestado() {
        return prestado;
    }
}
