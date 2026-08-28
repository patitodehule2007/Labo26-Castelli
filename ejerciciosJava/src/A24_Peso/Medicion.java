package A24_Peso;

public class Medicion {
    private  int altura;
    private int peso;

    private  double calcularVariacion(int valor1,int valor2){
        if(valor1 == 0){
            return  0;
        }
        return  (float)(valor1 - valor2) / valor1;
    }

    public boolean hasMorePeso(int peso){
        return this.peso > peso;
    }
    public boolean hasMoreAltura(int altura){
        return this.altura > altura;
    }



    public   double calcularVariacionPeso(Medicion medicion){
        return calcularVariacion(this.peso,medicion.getPeso());
    }

    public   double calcularVariacionAltura(Medicion medicion){
        return calcularVariacion(this.altura,medicion.getAltura());
    }

    public Medicion(int altura, int peso) {
        this.altura = altura;
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
}
