package produtos;

import models.ProdutosModels;
import controllers.ProdutosController;
import resources.Entrada;

public class produtos {
    public static void main(String[] args) {
        
        ProdutosController pController = new ProdutosController();

        int opcao = 0;
        while (opcao != 9) {
            opcao = Entrada.leiaInt("1 - Cadastrar produto\n" + "2 - Listar produtos\n" + "3 - Consultar produto\n" + "4 - Excluir produto\n" + "9 - Sair");
            
            if(opcao == 1){
                ProdutosModels p = new ProdutosModels();

                p.setNome(Entrada.leiaString("Qual o nome do produto"));
                p.setDescricao(Entrada.leiaString("Qual a descricao do produto?"));
                p.setPreco(Entrada.leiaInt("Qual o preco do produto?"));
                p.setQuantidadeEstoque(Entrada.leiaInt("Qual a quantidade em estoque do produto?"));

            }else if (opcao == 2) {
                pController.print();
            }else if (opcao == 3) {
                ProdutosModels p = pController.readOne(Entrada.leiaInt("Digite o ID do produto"));
                if(p != null){
                    p.imprimirAtributos();
                }else{
                    System.out.println("Produto nao encontrado");
                }
            }else if (opcao == 4) {
                
            }else if (opcao == 9) {
                System.exit(0);
            }else{
                System.out.println("error");
            }
            };

  
        }

    }

