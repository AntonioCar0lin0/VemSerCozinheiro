package Views;
import java.util.Scanner;

import Controllers.PedidoController;
import Model.Hamburguer;
import Enums.TipoCarne;
import Enums.TipoPao;
import Enums.PontoCarne;
import Controllers.HamburguerController;
import Model.Pedido;

public class HamburguerView {
    String opcaoPao;
    String opcaoCarne;
    String opcaoPontoCarne;
    boolean apresentaKetchup;
    boolean apresentaMostarda;
    int quantidadeHamburguersMontados;
    HamburguerController hamburguerController = new HamburguerController();
    PedidoController pedidoController = new PedidoController();
    Pedido pedidoMontado = PedidoView.getPedidoMontado();

    public HamburguerView() {
        Hamburguer hamburguerMontado = exibirMenuHamburguer();
        pedidoController.adicionarItemPedido(this.pedidoMontado, hamburguerMontado);
        new BebidaView();
    }


    public Hamburguer exibirMenuHamburguer(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Deseja quantos hamburguers deste tipo? ");
        this.quantidadeHamburguersMontados = sc.nextInt();
        boolean opcaoValida = false;
        int opcaoEscolhida;
        while (!opcaoValida) {
            System.out.println("Escolha o tipo de pão: ");
            System.out.println("1 - Australiano");
            System.out.println("2 - Integral");
            System.out.println("3 - Brioche");
            opcaoEscolhida = sc.nextInt();
            sc.nextLine();
            switch (opcaoEscolhida) {
                case 1:
                    opcaoPao = "AUSTRALIANO";
                    opcaoValida = true;
                    break;
                case 2:
                    opcaoPao = "INTEGRAL";
                    opcaoValida = true;
                    break;
                case 3:
                    opcaoPao = "BRIOCHE";
                    opcaoValida = true;
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
        opcaoValida = false;
        while(!opcaoValida) {
            System.out.println("Escolha o tipo de carne: ");
            System.out.println("1 - Carne");
            System.out.println("2 - Frango");
            System.out.println("3 - Vegano");
            opcaoEscolhida = sc.nextInt();
            sc.nextLine();
            if (opcaoEscolhida == 2) {
                opcaoPontoCarne = "AO_PONTO";
                opcaoCarne = "FRANGO";
            } else {
                opcaoCarne = opcaoEscolhida == 1 ? "CARNE" : "VEGANO";
                System.out.println("Escolha o ponto da carne");
                System.out.println("1 - Mal passada");
                System.out.println("2 - Ao ponto");
                System.out.println("3 - Bem passada");
                opcaoEscolhida = sc.nextInt();
                sc.nextLine();
                switch(opcaoEscolhida){
                    case 1:
                        opcaoPontoCarne = "MAL_PASSADA";
                        opcaoValida = true;
                        break;
                    case 2:
                        opcaoPontoCarne = "AO_PONTO";
                        opcaoValida = true;
                        break;
                    case 3:
                        opcaoPontoCarne = "BEM_PASSADA ";
                        opcaoValida = true;
                        break;
                    default:
                        System.out.println("Opção inválida");
                }
            }
        }
        opcaoValida = false;
        while(!opcaoValida) {
            System.out.println("Acompanha ketchup? ");
            System.out.println("1 - Sim");
            System.out.println("2 - Não");
             opcaoEscolhida = sc.nextInt();
            sc.nextLine();
            if (opcaoEscolhida > 0 && opcaoEscolhida < 3 ) {
                this.apresentaKetchup = opcaoEscolhida == 1 ? true : false;
                opcaoValida = true;

            }
            System.out.println("Opção inválida");
        }
        opcaoValida = false;

        while(!opcaoValida) {
            System.out.println("Acompanha mostarda? ");
            System.out.println("1 - Sim");
            System.out.println("2 - Não");
            opcaoEscolhida = sc.nextInt();
            sc.nextLine();
            if (opcaoEscolhida > 0 && opcaoEscolhida < 3 ) {
                this.apresentaMostarda = opcaoEscolhida == 1 ? true : false;
            }
            System.out.println("Opção inválida");
        }
        opcaoValida = false;
        sc.close();
        Hamburguer hamburguer = montarHamburguer(quantidadeHamburguersMontados, opcaoPao, opcaoCarne, opcaoPontoCarne,  apresentaKetchup, apresentaMostarda);
        return hamburguer;
    }

    public Hamburguer montarHamburguer(int quantidadeHamburguersMontados, String opcaoPao, String opcaoCarne, String opcaoPontoCarne, boolean apresentaKetchup, boolean apresentaMostarda) {
        Hamburguer hamburguer = this.hamburguerController.criarHamburguer("Hamburguer", 0.0, quantidadeHamburguersMontados, TipoCarne.valueOf(opcaoCarne), PontoCarne.valueOf(opcaoPontoCarne), TipoPao.valueOf(opcaoPao),  apresentaKetchup, apresentaMostarda);
        hamburguer.setPrecoItem(hamburguer.calcularPreco());
        return hamburguer;
    }

    public void exibirInformacoesHamburguer(Hamburguer hamburguer) {
        System.out.println("-- Descrição do hambúrguer do pedido --");
        System.out.println("Tipo de pão: " + hamburguer.getTipoPao());
        System.out.println("Tipo da carne: " + hamburguer.getTipoCarne());
        System.out.println("Ponto da carne: " + hamburguer.getPontoCarne());
        System.out.println("Apresenta ketchup? " + (hamburguer.isKetchup() ? "Sim" : "Não"));
        System.out.println("Apresenta mostarda? " + (hamburguer.isMostarda() ? "Sim" : "Não"));
    }
}
