package controllers;

import java.util.ArrayList;

import models.Loja;

public class LojaControllers {
    
    ArrayList<Loja> lojas = new ArrayList();
    int serial = 1;

    public void save(Loja l) {
        l.setId(serial);
        lojas.add(l);
        serial += 1;
    }

    public void print() {
        System.out.println("####### Imprimindo lojas #######");
        for (int i = 0; i < lojas.size(); i++) {
            lojas.get(i).printAttributes();
        }
        System.out.println("####### Finalizando impressão #######");
    }

    public Loja readOne(int id) {
        for (int i = 0; i < lojas.size(); i++) {
            Loja l = lojas.get(i);
            if (l.getId() == id) {
                return l;
            }
        }
        return null;
    }

    public void delete(Loja b) {
    }

    public void edit(Loja b) {

    }
}
