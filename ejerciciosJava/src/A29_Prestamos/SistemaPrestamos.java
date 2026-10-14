package A29_Prestamos;

import java.util.ArrayList;

public class SistemaPrestamos {
    private ArrayList<ObjetoPrestable> objetos;

    public SistemaPrestamos() {
        this.objetos = new ArrayList<>();
    }

    public void agregarObjeto(ObjetoPrestable objeto) {
        objetos.add(objeto);
    }

    public int cantidadObjetosPrestables() {
        int cantidad = 0;
        for (ObjetoPrestable objeto : objetos) {
            if (objeto.puedePrestarse()) {
                cantidad++;
            }
        }
        return cantidad;
    }

    public int cantidadObjetosNoPrestables() {
        return objetos.size() - cantidadObjetosPrestables();
    }

    public ArrayList<ObjetoPrestable> getObjetos() {
        return objetos;
    }
}
