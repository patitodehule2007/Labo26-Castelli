package A02_formas_Geometricas;

public class Circulo {
    private int  radio;


    public Circulo(){
            this.radio = 2;
    }
    public  Circulo(int radio){
        this.radio = radio;
    }
    public void  setRadio(int radio){
            this.radio = radio;
        }
        public  int  getRadio(){
            return  this.radio;
        }
        public double getArea(){
            return  (Math.PI * this.radio*this.radio);
        }
        public  double getPerimetro(){
            return   (2 * Math.PI * this.radio);
        }


}
