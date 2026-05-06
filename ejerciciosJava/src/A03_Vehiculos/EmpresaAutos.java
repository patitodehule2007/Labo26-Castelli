package A03_Vehiculos;

import java.util.ArrayList;

public class EmpresaAutos {
    private ArrayList<Vehiculo> listaVehiculos;

    public EmpresaAutos(ArrayList<Vehiculo> listaVehiculos) {
        this.listaVehiculos = listaVehiculos;
    }

    public String vehiculoMayorCantidad(){
        int numAutos = 0;
        int numBicicletas = 0;
        int numCamnion = 0;
        for(Vehiculo vehiculo: this.listaVehiculos ){
            if(vehiculo.getClass() == Coche.class){
                numAutos++;
            } else if (vehiculo.getClass() == Camion.class){
                numCamnion++;
            }
            else {
                numBicicletas++;
            }
        }
        if(numAutos > numBicicletas && numAutos > numCamnion) {
            return "autos";
        }
        else if(numBicicletas > numAutos && numBicicletas > numCamnion){
            return "camion";
        }
        else {
            return "bicicleta";
        }
    }
    public double porcentajeDescapotable(){
        int numAutos = 0;
        int numDescapotable = 0;
        for(Vehiculo vehiculo:this.listaVehiculos){
            if(vehiculo.getClass() == Coche.class){
                numAutos++;
                if(((Coche) vehiculo).isDescapotable()){
                    numDescapotable++;
                }
            }

        }
        if(numAutos <= 0){
            return  0;
        }
        return ((double)numDescapotable /numAutos);
    }
    private boolean isValidVehiculo(Vehiculo parmvehiculo){
        boolean found;
        String patente;

        if(parmvehiculo.getClass() == Camion.class){
            patente = ((Camion) parmvehiculo).getPatente();
        }
        else if(parmvehiculo.getClass() == Coche.class){
            patente = ((Coche) parmvehiculo).getPatente();
        }
        else {
            return  true;
        }


        for(Vehiculo vehiculo : this.listaVehiculos){
            if(vehiculo.getClass() == Coche.class){
                if(((Coche) vehiculo).getPatente().equals(patente)){
                    return  false;
                }
            }
            else if (vehiculo.getClass() == Camion.class) {
                if(((Camion) vehiculo).getPatente().equals(patente)){
                    return  false;
                }
            }
        }
        return  true;
    }

    public  boolean agregarVehiculo(Vehiculo vehiculo){
        if(this.isValidVehiculo(vehiculo)){
            this.listaVehiculos.add(vehiculo);
            return  true;
        }
        return false;
    }
}
