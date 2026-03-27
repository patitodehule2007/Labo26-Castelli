package A02_formas_Geometricas;

public class Rectangulo {
    private double altura;
    private double base;

    public Rectangulo(double altura,double base){
        this.altura = altura;
        this.base = base;
    }

    public  double getBase(){
        return this.base;
    }
    public  void  setBase(double base){
        this.base = base;
    }

    public  double getAltura(){
        return this.altura;
    }
    public  void  setAltura(double altura){
        this.altura = altura;
    }

    public  double getArea(){
        return  this.altura * this.base;
    }
    public  double getPerimetro(){
        return  this.altura * 2 + this.base * 2;
    }
}
