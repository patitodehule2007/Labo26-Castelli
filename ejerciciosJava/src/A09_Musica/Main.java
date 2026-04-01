package A09_Musica;

import A04_SeresVivos.Persona;

public class Main {
    public  static  void main(String[] Args){

                Persona fito = new Persona("Fito Paez", "Argentina", 61);

                Cancion c1 = new Cancion("El amor despues del amor", fito);


                Cancion c2 = new Cancion();
                c2.setTitulo("Vivir así es morir de amor");
                c2.setAutor(new Persona("Camilo Sesto", "España", 72));


                System.out.println("--- Canción 1 ---");
                System.out.println("Título: " + c1.getTitulo());
                System.out.println("Autor: " + c1.getAutor().getNombre());

                System.out.println("\n--- Canción 2 ---");
                System.out.println("Título: " + c2.getTitulo());
                System.out.println("Autor: " + c2.getAutor().getNombre());

    }
}
