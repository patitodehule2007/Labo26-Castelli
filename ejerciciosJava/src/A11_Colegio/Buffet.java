package A11_Colegio;

import A04_SeresVivos.Persona;
import A04_SeresVivos.Profesor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class Buffet {
    private List<Pedido> pedidoList;
    private List<Plato> platoList;

    public Buffet() {
        this.pedidoList = new ArrayList<>();
        this.platoList = new ArrayList<>();
    }

    public List<Pedido> getPedidoList() {
        return pedidoList;
    }


    public List<Plato> getMenu() {
        return platoList;
    }
    private  double calcularPrecio(Persona persona,Plato plato){
        double precio = plato.getPrecio();
        if(persona.getClass() == Profesor.class){
            precio = precio * (1 +((double)((Profesor) persona).getPorcentajeDescuento())/100);
        }
        return  precio;
    }


    public void ordenarPlato(Persona persona, Plato plato){
        double precio = this.calcularPrecio(persona,plato);
        Pedido pedido = new Pedido(plato ,persona,LocalDate.now().plusDays(13),precio);
        this.pedidoList.add(pedido);
    }
    public void  insertarPlato(Plato plato){
        this.platoList.add(plato);
    }
    public void  eliminarPlato(Plato plato){
        this.platoList.remove(plato);
    }
    public void  modificarPlato(Plato plato,Plato newPlato){
        this.platoList.remove(plato);
        this.platoList.add(newPlato);
    }

    public boolean marcarPlatoPedido(Pedido pedido){
        if(this.pedidoList.contains(pedido)){
            pedido.setEntregado(true);
            return  true;
        }
        return  false;
    }
    //  contamos platos para el top
    private  int  countPlatosUsage(Plato plato){
        int i ;
        for(i = 0;i < this.pedidoList.size();i++){
            if(this.pedidoList.get(i).getPato().equals(plato)){
                i++;
            }
        }
        return i;
    }

    public ArrayList<Plato> top(int cantidad){
        // copiamos para no modificar la tabla que tenemos
        ArrayList<Plato> copia = new ArrayList<>(this.platoList);
        // la ordenamos llamando al metodo q hicmos para ver los platos
        copia.sort(Comparator.comparingInt(this::countPlatosUsage).reversed());
        if(cantidad > this.pedidoList.size()){
            return  copia;
        }
        // recortamos hasta el limite
        return new  ArrayList<>(copia.subList(0,cantidad));
    }
    public void mostrarPlatosACocinar() {
        for (Pedido pedido : this.pedidoList) {
            System.out.println(pedido.getPato().getNombre() + " - : $" + pedido.getPrecio());

        }
    }
}
