package A18_Productos;

public enum TelevisorCategoria {
    ULTRAHD(1000,3300),QUATROKA(1000,3300),FULLHD(1000,3300);

    private int resoluciony;
    private int getResolucionx;

    TelevisorCategoria(int resoluciony, int getResolucionx) {
        this.resoluciony = resoluciony;
        this.getResolucionx = getResolucionx;
    }

    public String getResolucion (){
        return  this.getResolucionx + " x " + this.resoluciony;
    }
}
