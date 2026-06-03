package A06_libro;

import A05_Fechas.Fecha;

public class Main {
    public  static  void main(String[] args){
        // isbn: codigo libro
        Libro libro = new Libro("jf",30,new Fecha());
        System.out.println(libro.getCantidadHojas());
    }
}
