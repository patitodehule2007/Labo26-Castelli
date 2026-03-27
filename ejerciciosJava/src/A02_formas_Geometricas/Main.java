package A02_formas_Geometricas;

public class Main {
    public static void main(String[] args) {
        // circulos
        Circulo pruebaCirculo = new Circulo(80);
        System.out.println("Circulo");
        System.out.println("Perimetro: " + pruebaCirculo.getPerimetro());
        System.out.println("Area: " + pruebaCirculo.getArea());
        // Rectangulos
        Rectangulo pruebaRectangulo = new Rectangulo(3,2);
        System.out.println("Rectangulo");
        System.out.println("Perimetro: " + pruebaRectangulo.getPerimetro());
        System.out.println("Area: " + pruebaRectangulo.getArea());





    }
}
