package A04_SeresVivos;

import A24_Peso.Medicion;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class PersonaPeso extends  Persona{
    private Medicion medicion;
    private HashMap<LocalDate,Medicion> historial;

    public PersonaPeso(String nombre, String apellido, String direccion, LocalDate fechaNacimiento, Medicion medicion) {
        super(nombre, apellido, direccion, fechaNacimiento);
        this.medicion = medicion;
        this.historial = new HashMap<>();
        this.historial.put(fechaNacimiento, medicion);
    }

    public Medicion getMedicion() {
        return medicion;
    }

    public void setMedicion(Medicion medicion) {
        this.medicion = medicion;
    }

    public void agregarMedicion(LocalDate fecha, Medicion medicion) {
        this.historial.put(fecha, medicion);
    }

    public Medicion getPesoYAltura(LocalDate fecha){
        return historial.get(fecha);
    }
    public  float promedioPeso(int anio){
        float sumPeso = 0;
        int numMediciones = 0;
        for(Map.Entry<LocalDate,Medicion> entry: historial.entrySet()){
            LocalDate fecha = entry.getKey();
            Medicion medicion1 = entry.getValue();
            if(fecha.getYear() == anio){
                numMediciones++;
                sumPeso+=medicion1.getPeso();
            }

        }
        if(numMediciones != 0){
            return  sumPeso/numMediciones;
        }
        return  0;
    }
    public  float promedioAltura(int anio){
        float sumPeso = 0;
        int numMediciones = 0;
        for(Map.Entry<LocalDate,Medicion> entry: historial.entrySet()){
            LocalDate fecha = entry.getKey();
            Medicion medicion1 = entry.getValue();
            if(fecha.getYear() == anio){
                numMediciones++;
                sumPeso+=medicion1.getAltura();
            }

        }
        if(numMediciones != 0){
            return  sumPeso/numMediciones;
        }
        return  0;
    }

    public  double getPorcentajeVariacionAltura(LocalDate fecha1,LocalDate fecha2){
        Medicion medicion1 = historial.get(fecha1);
        Medicion medicion2 = historial.get(fecha2);
        return medicion1.calcularVariacionAltura(medicion2);
    }

    public  double getPorcentajeVariacionPeso(LocalDate fecha1,LocalDate fecha2){
        Medicion medicion1 = historial.get(fecha1);
        Medicion medicion2 = historial.get(fecha2);
        return medicion1.calcularVariacionPeso(medicion2);
    }


    public  LocalDate getFechaMayorPeso(){

        LocalDate maximaMedicion = null;

        for(Map.Entry<LocalDate,Medicion> entry: historial.entrySet()){
            LocalDate fecha = entry.getKey();
            Medicion medicion1 = entry.getValue();
            if(maximaMedicion == null){
                maximaMedicion = fecha;
            }
            if(historial.get(maximaMedicion).getPeso() < medicion1.getPeso()){
                maximaMedicion = fecha;
            }

        }
        return  maximaMedicion;
    }

    public  LocalDate getFechaMenorPeso(){

        LocalDate maximaMedicion = null;

        for(Map.Entry<LocalDate,Medicion> entry: historial.entrySet()){
            LocalDate fecha = entry.getKey();
            Medicion medicion1 = entry.getValue();
            if(maximaMedicion == null){
                maximaMedicion = fecha;
            }
            if(historial.get(maximaMedicion).getPeso() > medicion1.getPeso()){
                maximaMedicion = fecha;
            }

        }
        return  maximaMedicion;
    }


}
