package A09_Musica;

import java.util.ArrayList;

public class CD {
    private ArrayList<Cancion> listaCanciones;

    public CD() {
        this.listaCanciones = new ArrayList<Cancion>();
    }

    public ArrayList<Cancion> getListaCanciones() {
        return listaCanciones;
    }

    public void setListaCanciones(ArrayList<Cancion> listaCanciones) {
        this.listaCanciones = listaCanciones;
    }
    public  Cancion verCancion(int pos){
        return this.listaCanciones.get(pos);
    }
    public  void grabarCancion(Cancion cancion,int pos){
        this.listaCanciones.add(pos,cancion);
    }
    public  void  agregar(Cancion cancion){
        this.listaCanciones.add(cancion);
    }
    public  void  eliminar(int pos){
        this.listaCanciones.remove(pos);
    }
    public  void listarCanciones(){
        for(Cancion cancion: this.listaCanciones){
            System.out.println(cancion.getTitulo());
        }

    }


}
