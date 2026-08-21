package A23_Bebidas;

import A04_SeresVivos.Persona;

import java.time.LocalDate;
import java.util.ArrayList;

public class PersonaBebe extends Persona {
    private  int dni;
    private ArrayList<Pedidos> pedidos;

    public PersonaBebe(String nombre, String apellido, String direccion, LocalDate fechaNacimiento, int dni) {
        super(nombre, apellido, direccion, fechaNacimiento);
        this.dni = dni;
        pedidos = new ArrayList<>();
    }
    public  boolean hasSameDNI(int dni){
        return this.dni == dni;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public ArrayList<Pedidos> getBebidas() {
        return pedidos;
    }

    public void setBebidas(ArrayList<Pedidos> pedidos1) {
        this.pedidos = pedidos1;
    }
    public void  consumirBebida(Pedidos pedido){
        pedidos.add(pedido);
    }
    public double getCoeficiente(){
        double coeficiente = 0;
        for(Pedidos pedido: this.pedidos){
            coeficiente+=pedido.getBebidas().getCoeficienteHidratacion()* pedido.getCantidad();
        }
        return coeficiente;
    }

    @Override
    public String toString() {
        return "PersonaBebe{" +
                "dni=" + dni +
                ", pedidos=" + pedidos +
                '}';
    }
}
