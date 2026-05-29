package A12_deporte;

import A04_SeresVivos.Participante;

import java.util.ArrayList;

public class Equipo {
    private ArrayList<Participante> jugadores;
    private ArrayList<Horario> horariosJuego;
    private Participante capitan;

    public Equipo(Participante capitan, ArrayList<Horario> horarioJuego, ArrayList<Participante> jugadores) {
        int found = 0;
        // checkeamos si no se repiten cuando se agregan
        for (Participante p: jugadores) {
            if(this.estaEnUso(p.getNumeroCamiseta(),p,jugadores)){
                found+=1;
            }
        }
        if(found == 0 && jugadores.size() == 11){
            this.jugadores = jugadores;
            // checkeamos capitan usando el metodo que filtra
            this.setCapitan(capitan);
        }
            this.horariosJuego = horarioJuego;
    }
    public ArrayList<Participante> getJugadores() {
        return jugadores;
    }


    public ArrayList<Horario> getHorarioJuego() {
        return horariosJuego;
    }

    public void setHorarioJuego(ArrayList<Horario> horarioJuego) {
        this.horariosJuego = horarioJuego;
    }

    public Participante getCapitan() {
        return capitan;
    }

    public void setCapitan(Participante capitan) {
        if(this.jugadores.contains(capitan)) {
            this.capitan = capitan;
        }
    }

    public  boolean estaEnUso(int numCamisa,Participante ignorando,ArrayList<Participante> jugadores){
        boolean found = false;
        for(Participante p: jugadores) {
            found = p.getNumeroCamiseta() == numCamisa;
            if(found && !p.equals(ignorando)){
                return  found;
            }
        }
        return  found;
    }
    public boolean hasHorarioJuego(Horario horario){
        return  this.horariosJuego.contains(horario);
    }

    public String JugarPartido(Equipo equipo,int dia,Torneo torneo){
        return  torneo.agregarPartido(equipo,this,dia);
    }
}
