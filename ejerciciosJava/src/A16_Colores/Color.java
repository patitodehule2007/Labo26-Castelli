package A16_Colores;

public enum Color {
    VERDE("00FF00"),ROJO("FF0000");
    private  String hexa;

      Color(String hexa) {
        this.hexa = hexa;
      }

    public String getHexa() {
        return hexa;
    }
}
