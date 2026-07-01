package A21_Drones;

public class Cordenada {
    private  double latitud;
    private  double altitud;

    public Cordenada(double latitud, double altitud) {
        this.latitud = latitud;
        this.altitud = altitud;
    }

    public  double calcularDistancia(Cordenada destino){
        double lat1Rad = Math.toRadians(this.getLatitud());
        double lon1Rad = Math.toRadians(this.getAltitud());
        double lat2Rad = Math.toRadians(destino.getLatitud());
        double lon2Rad = Math.toRadians(destino.getAltitud());
        double dLat = lat2Rad - lat1Rad;
        double dLon = lon2Rad - lon1Rad;
        double a = Math.sin(dLat / 2) * Math.sin(dLat / 2) +
                Math.cos(lat1Rad) * Math.cos(lat2Rad) * Math.sin(dLon / 2) * Math.sin(dLon / 2);

        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double radioTierraKm = 6371;
        return radioTierraKm * c;

    }


    public double getLatitud() {
        return latitud;
    }

    public double getAltitud() {
        return altitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public void setAltitud(double altitud) {
        this.altitud = altitud;
    }

    public void setCordenada(double latitud, double altitud) {
        this.latitud = latitud;
        this.altitud = latitud;
    }


}
