package A27_Residuos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Sistema {
    private HashSet<Residuo> residuosPermitido;
    private HashSet<PuntoRecoleccion> puntosDeRecoleccion;
    private HashSet<Recolecciones> historialRecolecciones;
    private HashSet<Camion> camions;

    public void modificarResiduo(Residuo residuo, Residuo residuo2) {
        residuosPermitido.remove(residuo);
        residuosPermitido.add(residuo2);
    }

    public void agregarResiduos(Residuo residuo) {
        residuosPermitido.add(residuo);
    }

    public void sacarResiduos(Residuo residuo) {
        residuosPermitido.remove(residuo);
    }

    public ArrayList<PuntoRecoleccion> getPuntoRecoleccionBarrio(String barrio) {
        ArrayList<PuntoRecoleccion> puntos = new ArrayList<>();
        for (PuntoRecoleccion p1 : this.puntosDeRecoleccion) {
            if (p1.isFromBarrio(barrio)) {
                puntos.add(p1);
            }
        }
        return puntos;
    }

    public PuntoRecoleccion getPuntoByDireccion(String direccion) {
        PuntoRecoleccion puntoRecoleccion = null;
        for (PuntoRecoleccion p1 : this.puntosDeRecoleccion) {
            if (p1.hasSameDireccion(direccion)) {
                puntoRecoleccion = p1;
            }
        }
        return puntoRecoleccion;
    }

    public ArrayList<PuntoRecoleccion> getPuntosConTipoResiduo(Residuo tipo) {
        ArrayList<PuntoRecoleccion> residuos = new ArrayList<>();
        for (PuntoRecoleccion puntosDeRecoleccion : this.puntosDeRecoleccion) {
            if (puntosDeRecoleccion.aceptaResiduo(tipo)) {
                residuos.add(puntosDeRecoleccion);
            }
        }
        return residuos;
    }

    public HashMap<Residuo, Integer> getCantidadDelugaresReciduo(String barrio) {
        HashMap<Residuo, Integer> resultado = new HashMap<>();
        for (PuntoRecoleccion p1 : this.puntosDeRecoleccion) {
            if (p1.hasSameDireccion(barrio)) {
                resultado.putAll(p1.getResiduos());
            }
        }
        return resultado;
    }

    public boolean recolectarBasura(Camion camion, ArrayList<PuntoRecoleccion> puntosRecoleccion) {
        Recolecciones recolectorBusqueda = new Recolecciones(LocalDate.now(), camion, true);

        if (historialRecolecciones.contains(recolectorBusqueda)) {
            Recolecciones recoleccionfallida = new Recolecciones(LocalDate.now(), camion, false);
            historialRecolecciones.add(recoleccionfallida);
            return false;
        }

        if (!camion.empezarRecoleccion(puntosRecoleccion)) {
            Recolecciones recoleccionfallida = new Recolecciones(LocalDate.now(), camion, false);
            historialRecolecciones.add(recoleccionfallida);
            return false;
        }
        Recolecciones recoleccionExitosa = new Recolecciones(LocalDate.now(), camion, true);
        historialRecolecciones.add(recoleccionExitosa);
        return true;
    }

    public double getPorcentajeViajesFallidos(){
        double viajesTotal = 0;
        int viajesExito= 0;

        for(Recolecciones recolecciones: this.historialRecolecciones){
            viajesTotal++;
            if(recolecciones.isFunciono()){
                viajesExito++;
            }
        }
        if(viajesTotal == 0){
            return  0;
        }
        return  viajesExito/viajesTotal * 100;
    }


}
