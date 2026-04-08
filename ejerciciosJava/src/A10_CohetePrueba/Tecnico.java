package A10_CohetePrueba;

import A05_Fechas.Fecha;

public class Tecnico {
    private String nombre;
    private String apellido;
    private Fecha fechaNacimiento;
    private String especialidad;
    private Cohete coheteAsignado;
    public Tecnico(String nombre,String apellido,Fecha fechaNacimiento,String especialidad,Cohete coheteAsignado){
	this.nombre = nombre;
	this.apellido = apellido;
	this.fechaNacimiento = fechaNacimiento;
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
  },
  public  void  activarPropulsores(int cantidad){
		coheteAsignado.activarPropulsores(cantidad);
  }
}

