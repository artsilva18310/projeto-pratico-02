package produtos;

import models.Loja;
import models.ProdutosModels;
import controllers.LojaControllers;
import controllers.ProdutosController;
import resources.Entrada;

public class produtos {

    public static void main(String[] args) {

        ProdutosController pController = new ProdutosController();
        LojaControllers lController = new LojaControllers();

        int opcao = 0;
        while (opcao != 9) {
            opcao = Entrada.leiaInt("1 - Cadastrar produto\n" + "2 - Listar produtos\n" + "3 - Consultar produto\n"
                    + "4 - Excluir produto\n" + "5 - Criar Loja\n" + "6 - Listar lojas\n"
                    + "7 - Adicionar produtos a loja\n" + "9 - Sair ");

            if (opcao == 1) {
                ProdutosModels p = new ProdutosModels();

                p.setNome(Entrada.leiaString("Qual o nome do produto"));
                p.setDescricao(Entrada.leiaString("Qual a descricao do produto?"));
                p.setPreco(Entrada.leiaInt("Qual o preco do produto?"));
                p.setQuantidadeEstoque(Entrada.leiaInt("Qual a quantidade em estoque do produto?"));

            } else if (opcao == 2) {
                pController.print();

            } else if (opcao == 3) {
                ProdutosModels p = pController.readOne(Entrada.leiaInt("Digite o ID do produto"));
                if (p != null) {
                    p.imprimirAtributos();
                } else {
                    System.out.println("Produto nao encontrado");
                }
            } else if (opcao == 4) {

            } else if (opcao == 5) {
                Loja l = new Loja();
                l.setNome(Entrada.leiaString(" Nome da Loja "));
                l.setRazaoSocial(Entrada.leiaString(" Razao social da loja: "));
                lController.save(l);

            } else if (opcao == 6) {
                lController.print();

            } else if (opcao == 7) {
                lController.print();
                Loja l = lController
                        .readOne(Entrada.leiaInt(" Digite o código da  loja que deseja atribuir Produtos "));

                if (l != null) {

                    char continuar = 'c';
                    while (continuar == 'c') {
                        pController.print();
                        ProdutosModels p = pController
                                .readOne(Entrada.leiaInt("Digite o código do produto que deseja adicionar"));

                        if (l != null) {
                            l.addProduto(p);
                        } else {
                            System.out.println(" Produto não encontrado ");
                        }

                        continuar = Entrada.leiaChar("Deseja adicionar mais um Produto? [s / n]");
                    }
                } else {
                    System.out.println("Loja não encontrada");

                }

            } else if (opcao == 9) {
                System.exit(0);
            } else {
                System.out.println("error");
            }
        }
        

    }

}
