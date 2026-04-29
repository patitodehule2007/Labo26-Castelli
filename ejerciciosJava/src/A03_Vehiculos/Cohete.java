package A03_Vehiculos;

public class Cohete {
    private String nombre;
    private double velocidad;
    private double altura;
    private double ancho;
    private int propulsores;
    private int propulsoresActivos;

   public Cohete(String nombre,double velocidad,double ancho, int propulsores){
	this.nombre = nombre;
	this.velocidad = velocidad;
	this.ancho = ancho;
	this.propulsores = propulsores;
	this.altura = 93;
	this.propulsoresActivos = 0;
   }
   public boolean puedeDespegar(){
	return (this.velocidad > 25000 && this.propulsores >= 2);
   }

   public void activarPropulsores(int cantidadPropulsores){
	if(! this.puedeDespegar()){
	      System.out.println("El cuete No puede despegar");
	}
	else if((this.propulsoresActivos + cantidadPropulsores) >this.propulsores){
	      System.out.println("Numero invalido de propulsores a activar");
	}
	else {
              for(int i = this.propulsoresActivos; i <=(this.propulsoresActivos + cantidadPropulsores); i ++){
		System.out.println("Propulsor " + i + " Activo");
              this.propulsoresActivos+=1;
	      }
	}
   }
   public double calcularTiempo(double distancia){
	double tiempo;
	if(distancia <= 0){
		tiempo = -1;
	}
	else if(this.velocidad <= 0){
		tiempo = -1;
	}
	else {
		tiempo = (this.velocidad)/distancia;
	}
	return tiempo;
   }
   public int getPropulsores(){
	return this.propulsores;
   }
   public double getVelocidad(){
	return this.velocidad;
   }
   public double getAltura(){
	return this.altura;
   }

}
