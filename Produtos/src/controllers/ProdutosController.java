package controllers;

import java.util.ArrayList;
import models.ProdutosModels;

public class ProdutosController {

    /**
     * @author guilherme.tolio
     */
    ArrayList<ProdutosModels> produtosArrayList = new ArrayList();
    int serial = 1;

    public void save(ProdutosModels p) {
        p.setId(serial);
        produtosArrayList.add(p);
        serial += 1;
    } 
    
    public void print() {
        System.out.println("####### Consultando produto #######");
        for (int i = 0; i < produtosArrayList.size(); i++) {
            produtosArrayList.get(i).imprimirAtributos();
        }
        System.out.println("###################################");
    }

    public ProdutosModels readOne(int id) {
        for (int i = 0; i < produtosArrayList.size(); i++) {
            ProdutosModels p = produtosArrayList.get(i);
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    public void delete(ProdutosModels p) {
        produtosArrayList.remove(p);
    }

    public void sizeArray() {
        System.out.println(produtosArrayList.size());
    }

}
