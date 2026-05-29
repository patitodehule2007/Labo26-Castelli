package A15_Computacion;

import java.util.ArrayList;

public class Computadora {
    private ArrayList<Componente> componentes;

    public Computadora(ArrayList<Componente> componentes) {
        this.componentes = componentes;
    }

    public ArrayList<Componente> getComponentes() {
        return componentes;
    }
    public double getPrecio(){
        double precio = 0;
        for(Componente componente: this.componentes){
            precio = precio + componente.getPrecioVenta();
        }
        return precio;
    }
    public  void  componentesEntadaYSalida(){

        int numComponentesEntrada = 0;
        int numComponentesSalida = 0;
        for(Componente componente:this.componentes){
            if(componente instanceof DispositvoEntrada){
                numComponentesEntrada++;
            } else if (componente instanceof DispositivoSalida) {
                numComponentesSalida++;
            }
        }
        System.out.println("Componentes entrada: " + numComponentesEntrada);
        System.out.println("Componentes salida: " + numComponentesSalida);
    }
}
