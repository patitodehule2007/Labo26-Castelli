package A22_Animales;

public class Pez extends Mascota{
    private int vidas;

    public Pez(String saludo, String nombre, String nombreDueno, int felicidad) {
        super(saludo, nombre, nombreDueno, felicidad,TipoMascota.PEZ);
        this.vidas = 10;

    }


    @Override
    public void alimentar() {
        vidas+=1;
    }

    private void  sacarVida(){
        if(!(vidas <= 1)){
            vidas = 1;
        }
        else {
            vidas-=1;
        }
    }
    public  void matar(){
        this.vidas = 0;
            
    }
    @Override
    public void saludar(String nombrePersona){
        if(super.isOwner(nombrePersona)){
            sacarVida();
        }
        else {
            matar();
        }
    }

}
