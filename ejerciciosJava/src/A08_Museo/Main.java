package A08_Museo;

import A04_SeresVivos.Persona;
import A04_SeresVivos.Restaurador;
import A05_Fechas.Fecha;

import java.time.LocalDate;

public class Main {
    public static  void  main(String[] args){
        Cuadro cuadro = new Cuadro("feuh",new Persona("pepe", "perez","feho", LocalDate.now()),2,new Fecha(),new Persona("pepe", "perez","feho",LocalDate.now()));
        Restaurador restaurador = new Restaurador("pepe","rodriquez","no se",39023,LocalDate.now(),87);

        restaurador.restaurarObra(cuadro);
    }
}
