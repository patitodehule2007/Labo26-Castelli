package A15_Computacion;

import java.util.ArrayList;

public class Web {
    private ArrayList<Componente>   componentes;
    private ArrayList<Compras> compras;

    private boolean puedeComprar(Computadora computadora){
        boolean isValid = true;
        boolean hasDispSalida = false;
        boolean hasDispEntrada = false;
        boolean hasCPU = false;
        int i = 0;

        for( i = 0 ; i < computadora.getComponentes().size() && isValid;i++){
            Componente curComp = computadora.getComponentes().get(i);
            if(! this.componentes.contains(curComp)){
                isValid = false;
            }
            if(curComp instanceof DispositvoEntrada){
                if(hasDispSalida){
                    isValid = false;
                }
                hasDispSalida = false;
            }
            else if(curComp instanceof Disp)


        }

        return  isValid
    }
}
