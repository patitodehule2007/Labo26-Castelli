package A22_Animales;

import java.util.ArrayList;

public class Sistema {
    private ArrayList<Mascota> mascotas;

    public Sistema() {
        this.mascotas = new ArrayList<>();
    }

    public void saludar(String nombreDueno, String nombreMascota) {

    }
    private  boolean nombreDisponible(Mascota nuevaMascota){
        for(Mascota mascota: this.mascotas){
            if(mascota.hasSameName(nuevaMascota.getNombre())){
                return  false;
            }
        }
        return  true;
    }

    private Mascota findMascotaByName(String nombreMascota){
        for(Mascota mascota: this.mascotas){
            if(mascota.hasSameName(nombreMascota)){
                return  mascota;
            }
        }
        return  null;
    }
    public boolean agregarMascota(Mascota mascota){
        if(nombreDisponible(mascota)){
            this.mascotas.add(mascota);
            return  true;
        }
        return  false;
    }

    public void sacarMascota(Mascota mascota){
        mascotas.remove(mascota);
    }
    public void  modificarMascota(Mascota viejaMascota,Mascota nuevaMascota){
        this.mascotas.set(this.mascotas.indexOf(viejaMascota),nuevaMascota);
    }
    public  void  saludarMascota(String nombreMascota,String nombreDueno){
        Mascota mascota = findMascotaByName(nombreMascota);
        if(mascota != null){
            mascota.saludar(nombreDueno);
        }

    }


}
