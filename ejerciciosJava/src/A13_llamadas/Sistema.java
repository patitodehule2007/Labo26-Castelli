package A13_llamadas;

import A04_SeresVivos.Empleado;

import java.time.LocalDate;
import java.util.ArrayList;

public class Sistema {
    private ArrayList<Llamada>  historialLlamadas;
    private ArrayList<Empleado> empleados;

    public Sistema() {
        historialLlamadas = new ArrayList<>();
        empleados = new ArrayList<>();
    }

    public void mostrarLlamadasPorEmpleado(){
        for (Empleado empleado: this.empleados){
            System.out.println( "---- Empleado: "+ empleado.getNombre());
            for(Llamada llamada: empleado.getLlamadas(this)){
                System.out.println("De :" + llamada.getEmpleadoOrigen().getNombre());
                System.out.println("A :" + llamada.getEmpleadoDestino().getNombre());
                System.out.println("Costo : " + llamada.calcularCosto());
                System.out.println("Duracion: "+ llamada.getDuracion());
                System.out.println("Fecha: "+ llamada.getFechaLlamada());
            }
        }
    }

    public  int  llamasEmpleadoExterior(Empleado empleado){
        int numLLamadas = 0;
        for (Llamada llamada: this.historialLlamadas){
            numLLamadas+= (int)llamada.obtenerMinutoExterior(empleado);
        }
        return  numLLamadas;
    }

    public   void    topLlamadasExterior(){
        ArrayList<Empleado> empleadosTop = new ArrayList<>();
        int lenghtTop = 3;
        int i = 0;
        for (Empleado empleado: this.empleados){
            Empleado empleadoMax = empleado;
            for(Empleado empleado1: this.empleados){
                if(!empleadosTop.contains(empleado1) && empleadoMax.calcNumLLamasExterior(this) < empleado1.calcNumLLamasExterior(this) ){
                    empleadoMax = empleado1;
                }

            }
            empleadosTop.addLast(empleadoMax);
        }
        while (i < empleadosTop.size() && i <= lenghtTop){
            System.out.println(empleadosTop.get(i).getNombre() + ": " + empleadosTop.get(i).calcNumLLamasExterior(this));
            i++;
        }
    }

    public void ordenarRankingPorMinutosDescendente() {
        ArrayList<Empleado> empleadosTop = new ArrayList<>();
        int lenghtTop = 3;
        int i = 0;
        for (Empleado empleado: this.empleados){
            Empleado empleadoMax = empleado;
            for(Empleado empleado1: this.empleados){
                if(! (empleadosTop.contains(empleado1)) && empleadoMax.calcNumLLamasExterior(this) > empleado1.calcNumLLamasExterior(this) ){
                    empleadoMax = empleado1;
                }

            }
            empleadosTop.addLast(empleadoMax);
        }
        while (i < empleadosTop.size() && i <= lenghtTop ){
            System.out.println(empleadosTop.get(i).getNombre() + ": " + empleadosTop.get(i).calcNumLLamasExterior(this));
            i++;
        }

    }


    public boolean contratarEmpleado(Empleado empleado){
        if(this.empleados.contains(empleado)){
            return  false;
        }
        this.empleados.add(empleado);
        return  true;
    }

    public ArrayList<Llamada> getLlamadasEmpleado(Empleado empleado){
        ArrayList<Llamada> listaLlamadas = new ArrayList<>();
        for(Llamada llamada: this.historialLlamadas ){
            if(llamada.getEmpleadoOrigen().equals(empleado)){
                listaLlamadas.add(llamada);
            }
        }
        return  listaLlamadas;
    }

    public boolean llamar(Empleado empleadoOrigen,Empleado empleadoDestino,int duracion){
        // la gente que no trabaja en la empresa no puede llamar
        if(!(this.empleados.contains(empleadoOrigen) && this.empleados.contains(empleadoDestino))){
            return false;
        }

        if(empleadoDestino.equals(empleadoOrigen)){
            return  false;
        }


        if(empleadoDestino.getPais().equals(empleadoOrigen.getPais())){
            LlamadaNacional llamada = new LlamadaNacional(empleadoOrigen,empleadoDestino, LocalDate.now(),duracion,empleadoOrigen.getProvincia(),empleadoDestino.getProvincia());
            this.historialLlamadas.add(llamada);
        }
        else {
            LlamadaInternacional llamadaInternacional = new LlamadaInternacional(empleadoOrigen,empleadoDestino, LocalDate.now(),duracion,empleadoOrigen.getProvincia(),empleadoDestino.getProvincia());
            this.historialLlamadas.add(llamadaInternacional);
        }

        return  true;
    }

    public ArrayList<Llamada> getHistorialLlamadas() {
        return historialLlamadas;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void mostrarLlamadasDe(Empleado empleado) {
        for(Llamada llamada: this.historialLlamadas){
            if(empleado.equals(llamada.getEmpleadoOrigen())){
                System.out.println("De :" + llamada.getEmpleadoOrigen().getNombre());
                System.out.println("A :" + llamada.getEmpleadoDestino().getNombre());
                System.out.println("Costo : " + llamada.calcularCosto());
                System.out.println("Duracion: "+ llamada.getDuracion());
                System.out.println("Fecha: "+ llamada.getFechaLlamada());
            }
        }
    }
}
