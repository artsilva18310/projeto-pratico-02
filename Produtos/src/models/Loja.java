package models;

import java.util.ArrayList;

import produtos.produtos;

public class Loja {
    private String nome;
    private String razaoSocial;
    private int id;
    private ArrayList<ProdutosModels> produto = new ArrayList();

    public Loja(String nome, String razaoSocial, int id, ArrayList<ProdutosModels> produto) {
        this.id = id;
        this.nome = nome;
        this.razaoSocial = razaoSocial;
        this.produto = produto;
    }

    public Loja(String razaoSocial, ArrayList<ProdutosModels> produto) {
        this.razaoSocial = razaoSocial;
        this.produto = produto;

    }

    public String getNome() {
        return nome;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public int getId() {
        return id;
    }

    public ArrayList<ProdutosModels> getProduto() {
        return produto;
    }

    public Loja() {
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProduto(ArrayList<ProdutosModels> produto) {
        this.produto = produto;
    }

    public void addProduto(ProdutosModels p) {
        this.produto.add(p);
    }

    public void printAttributes() {
        System.out.println(" Nome da Loja: " + nome);
        System.out.println(" Qual razao social da loja: " + razaoSocial);
        System.out.println(" Produtos disponiveis: " + produto.size());
        for (int i = 0; i < this.produto.size(); i++) {
            ProdutosModels p = produto.get(i);
            p.imprimirAtributos();
        }
        System.out.println("##");
    }

}
