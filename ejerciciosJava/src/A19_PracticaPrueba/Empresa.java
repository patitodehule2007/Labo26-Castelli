package A19_PracticaPrueba;

import java.util.ArrayList;

public class Empresa {
    private ArrayList<Producto> productos;


    public Empresa(){
        productos = new ArrayList<>();
    }
    public ArrayList<String> getAllNumLotesAndID(){
        ArrayList<String> listasLotasEID = new ArrayList<>();
        for(Producto producto: this.productos){
            listasLotasEID.add(producto.getNumLoteYcodigoIdentificacion());
        }
        return  listasLotasEID;
    }
    public  void  agregarProd(Producto prod){
        this.productos.add(prod);
    }

    public int codProdMasReciente(){
        Producto maxProd = productos.getFirst();
        for(Producto prod : this.productos){
            if(maxProd.envazoDespuesFresco(prod)){
                maxProd = prod;
            }
        }
        return  maxProd.getCodigoIdentificacion();

    }
    public void   mostrarProdPaisese(){
        for(PaisesOrigen pais: PaisesOrigen.values()){
            System.out.println("---------------------------");
            System.out.println("PAIS: " + pais.name());
            System.out.println("---------------------------");
            for(Producto prod: getProdPaisOrigen(pais)){
                System.out.println("Nombre: " +prod.getNombre());
            }
        }
        System.out.println("---------------------------");
    }
    private ArrayList<Producto> getProdPaisOrigen(PaisesOrigen pais){
        ArrayList<Producto> listaProds = new ArrayList<>();
        for(Producto prod: this.productos){
            if(prod.isFrom(pais)){
                listaProds.add(prod);
            }
        }
        return listaProds;
    }

}
