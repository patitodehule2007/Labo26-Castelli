package A11_Colegio;

import A04_SeresVivos.Persona;
import A04_SeresVivos.Profesor;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Comparator;
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
        if(persona instanceof Profesor p){
            // si es profe aplico descuento
            precio = precio * (1 - ((double)(p).getPorcentajeDescuento())/100);
        }
        return  precio;
    }

    public void ordenarPlato(Persona persona, Plato plato, LocalTime horaEntrega){
        double precio = this.calcularPrecio(persona,plato);
        Pedido pedido = new Pedido(plato ,persona,horaEntrega,precio);
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
    // cuenta cuantas veces se pidio un plato
    private  int  countPlatosUsage(Plato plato){
        int cant = 0;
        for(Pedido pedido : this.pedidoList){
            if(pedido.getPato().equals(plato)){
                cant++;
            }
        }
        return  cant;
    }

    public List<Pedido> listarPendientes(){
        List<Pedido> pendientes = new ArrayList<>();
        for(Pedido pedido : this.pedidoList){
            if(!pedido.isEntregado()){
                pendientes.add(pedido);
            }
        }
        return pendientes;
    }

    public ArrayList<Plato> top(int cantidad){
        // copio para no tocar la lista original
        ArrayList<Plato> copia = new ArrayList<>(this.platoList);
        copia.sort(Comparator.comparingInt(this::countPlatosUsage).reversed());
        if(cantidad > this.platoList.size()){
            return  copia;
        }
        return new  ArrayList<>(copia.subList(0,cantidad));
    }
    public void mostrarPlatosACocinar() {
        for (Pedido pedido : this.pedidoList) {
            System.out.println(pedido.getPato().getNombre() + " - : $" + pedido.getPrecio());

        }
    }
}
