package A23_Bebidas;

import java.util.ArrayList;

public class Sistema {
    private ArrayList<PersonaBebe> personaBebe;

    private boolean userHasSameDNI(int dni){
        for(PersonaBebe personaBebe1: personaBebe){
            if(personaBebe1.hasSameDNI(dni)){
                return  true;
            }
        }
        return  false;
    }

    public Sistema() {
        this.personaBebe = new ArrayList<>();
    }

    public boolean addUser(PersonaBebe p1){
        if(userHasSameDNI(p1.getDni())){
            return  false;
        }
        personaBebe.add(p1);
        return  true;
    }

    public void  mostrarPersonaMasHidratacion(){
        PersonaBebe personaBebeMaxHidratacion = personaBebe.getFirst();
        for(PersonaBebe personaBebe1: personaBebe){
            if(personaBebe1.getCoeficiente() > personaBebeMaxHidratacion.getCoeficiente()){
                personaBebeMaxHidratacion = personaBebe1;
            }
        }
        System.out.println(personaBebeMaxHidratacion);
    }

    public void  mostrarPersonaMenosHidratacion(){
        PersonaBebe personaBebeMenosHidratacion = personaBebe.getFirst();
        for(PersonaBebe personaBebe1: personaBebe){
            if(personaBebe1.getCoeficiente() < personaBebeMenosHidratacion.getCoeficiente()){
                personaBebeMenosHidratacion = personaBebe1;
            }
        }
        System.out.println(personaBebeMenosHidratacion);
    }

    public void  consumir(PersonaBebe personaBebe, int cantidad, Bebida bebida){
        Pedidos pedido = new Pedidos(bebida,cantidad);
        personaBebe.consumirBebida(pedido);
    }


}
