package A31_ClubesFulbo;

import A04_SeresVivos.Empleado;

import java.util.HashSet;

public class Club {
    private String nombre;
    private HashSet<TrabajadoresClub> genteContratable;
    private HashSet<TrabajadoresClub> genteContratada;



    public void contratarEmpleado(TrabajadoresClub e) throws  RejectionContractExeption{
        if(!genteContratable.contains(e)){
            throw new  RejectionContractExeption("no es una persona elegible");
        }
        e.checkearIncorporacion(this);
        genteContratada.add(e);
        System.out.println(  e.getNombre()+" fue contratado por " + this.nombre);
    }

    public void renovarEmpleado(TrabajadoresClub e) throws  RejectionContractExeption{
        if(!genteContratada.contains(e)){
            throw new  RejectionContractExeption("no es una persona elegible");
        }
        e.checkearIncorporacion(this);
        genteContratada.add(e);
        System.out.println(  e.getNombre()+" fue contratado por " + this.nombre);
    }
    public  void  mostrarStatsGente(){
        for(TrabajadoresClub t : genteContratada){
            System.out.println(t.mostrarInformacion());
        }
    }




}
