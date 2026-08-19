package A22_Animales;

public class Pajaro extends Mascota {
    public boolean isCantor;
    public String canto;



    public Pajaro(String saludo, String nombre, String nombreDueno, int felicidad, boolean isCantor, String canto) {
        super(saludo, nombre, nombreDueno, felicidad,TipoMascota.PAJARO);
        this.isCantor = isCantor;
        this.canto = canto;
    }

    @Override
    public void alimentar() {
        super.aumentarFelicidad();
    }
    @Override
    public void saludar(String nombrePersona){
        if(isCantor && nombrePersona.equals(super.getNombreDueno())){

            System.out.println(this.getSaludo());
        }
        System.out.println("No canto");
    }
}
