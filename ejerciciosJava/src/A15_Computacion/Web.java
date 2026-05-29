package A15_Computacion;

import A04_SeresVivos.Cliente_compu;

import java.util.ArrayList;

public class Web {
    private ArrayList<Computadora>   computadoras;
    private ArrayList<Compra> compras;
    private ArrayList<Componente> componentes;

    private ArrayList<Componente> getComponentes(){
        ArrayList<Componente> componentes2 = new ArrayList<>();
        for(Computadora computadora: this.computadoras){
            for(Componente componente: computadora.getComponentes()) {
                componentes2.add(componente);
            }
        }
        return  componentes2;
    }

    private boolean SacarComponentes(Computadora computadora){
        if(hayStock(computadora)){
            for (Componente componente: computadora.getComponentes()){
                componente.agarrarStock(1);
            }
            return  true;
        }
        return false;

    }

    private boolean hayStock(Computadora computadora){
        boolean hayStock = true;
        for(Componente componente :computadora.getComponentes()){
            if(componente.tieneStock(1)){
                hayStock = false;
            }
        }
        return  hayStock;
    }

    private boolean puedeComprar(Computadora computadora){
        boolean isValid = true;
        boolean hasDispSalida = false;
        boolean hasDispEntrada = false;
        boolean hasCPU = false;
        boolean hasNoStock;


        int i = 0;
        while (isValid && i < computadora.getComponentes().size()){
            Componente currComputador = computadora.getComponentes().get(i);

            Componente curComp = computadora.getComponentes().get(i);
            if(! this.getComponentes().contains(curComp)){
                isValid = false;
            }
            if(curComp instanceof DispositvoEntrada){
                hasDispEntrada = true;
            }
            else if(curComp instanceof DispositivoSalida){
                hasDispSalida = true;
            }
            else {
                if(hasCPU){
                    isValid = false;
                }
                hasCPU = true;
            }
            i++;
        }

        return  isValid;
    }

    private int numUsoComponente(Componente componente){
        int numCompra = 0;
        for(Computadora computadora: this.computadoras){
            if(computadora.getComponentes().contains(componente)){
                numCompra ++;
            }
        }

        return  numCompra;

    }

    public  void  componenteMasComprado(){
        Componente componenteMasUsado = componentes.getFirst();

        for(Componente componente:this.componentes){
            if(this.numUsoComponente(componenteMasUsado) < this.numUsoComponente(componente)){
                componenteMasUsado = componente;
            }
        }
        System.out.println("Componente mas usado: ");
        System.out.println("Nombre: " + componenteMasUsado.getNombreFabricante());
        System.out.println("Stock: " + componenteMasUsado.getStock());
    }

    public void  comprar(ArrayList<Computadora> computadoras, Cliente_compu cliente,MetodoDePago metodoDePago){
        ArrayList<Computadora> computadorasCheckeadas = new ArrayList<>();
        for(Computadora computadora: computadoras){
            if(this.puedeComprar(computadora) && this.SacarComponentes(computadora)){
                computadorasCheckeadas.add(computadora);
            }
        }
        Compra compra = new Compra(cliente,computadorasCheckeadas,metodoDePago);
        this.compras.add(compra);
    }
}
