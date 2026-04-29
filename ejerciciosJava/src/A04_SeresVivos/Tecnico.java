package A04_SeresVivos;

import A05_Fechas.Fecha;
import A03_Vehiculos.Cohete;

import java.time.LocalDate;

public class Tecnico extends Persona {
    private String especialidad;
    private Cohete coheteAsignado;
    public Tecnico(String nombre, String apellido, LocalDate fechaNacimiento, String especialidad, String direccion, Cohete coheteAsignado){
	super(nombre,apellido,direccion,fechaNacimiento);
	this.especialidad = especialidad;
	this.coheteAsignado = coheteAsignado;
    }
    public boolean puedeTrabajar(Cohete coheteComparar){
	switch(this.especialidad){
	      case "Propulsion":
		return  coheteComparar.getPropulsores() >= 4;
	      case "Navegacion":
		return coheteComparar.getVelocidad() > 28000;
	      case "Estructura":
		return coheteComparar.getAltura() > 70;
	     default:
		return true; 
	}
    }
  public boolean cambiarCohete(Cohete coheteNuevo) {
	  boolean res = false;
	  if (this.puedeTrabajar(coheteNuevo)) {
		  this.coheteAsignado = coheteNuevo;
		  res = true;
	  }
	  return res;
  }
  public  void  activarPropulsoresPersona(int cantidad){
		coheteAsignado.activarPropulsores(cantidad);
  }
}

