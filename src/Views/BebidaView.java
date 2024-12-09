package Views;

import Controllers.PedidoController;
import Model.*;
import Enums.TamanhoBebida;
import java.util.Scanner;

public class BebidaView {
    PedidoController pedidoController = new PedidoController();
    Pedido pedidoMontado = PedidoView.getPedidoMontado();

    public BebidaView() {
        Bebidas bebidaMontada = exibirMenuBebidas();
        pedidoController.adicionarItemPedido(pedidoMontado, bebidaMontada);
        new PedidoView(false);
    }

    public Bebidas exibirMenuBebidas() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha o tipo de bebida:");
        System.out.println("1. Refrigerante");
        System.out.println("2. Suco");
        int opcaoBebida = sc.nextInt();
        sc.nextLine();

        System.out.println("Escolha o tamanho da bebida:");
        System.out.println("1. Pequeno");
        System.out.println("2. Médio");
        System.out.println("3. Grande");
        int opcaoTamanho = sc.nextInt();
        sc.nextLine();

        TamanhoBebida tamanhoEscolhido = null;
        switch (opcaoTamanho) {
            case 1:
                tamanhoEscolhido = TamanhoBebida.PEQUENO;
                break;
            case 2:
                tamanhoEscolhido = TamanhoBebida.MEDIO;
                break;
            case 3:
                tamanhoEscolhido = TamanhoBebida.GRANDE;
                break;
            default:
                System.out.println("Opção inválida. Usando tamanho padrão: Médio.");
                tamanhoEscolhido = TamanhoBebida.MEDIO;
        }

        System.out.println("A bebida será gelada? S/N: ");
        String opcaoGelada = sc.nextLine();
        boolean gelada = opcaoGelada.equalsIgnoreCase("S");

        if (opcaoBebida == 1) {
            System.out.println("O refrigerante terá limão? S/N: ");
            String opcaoLimão = sc.nextLine();
            boolean comLimao = opcaoLimão.equalsIgnoreCase("S");

            Refrigerante refrigerante = new Refrigerante("Refrigerante", 1, tamanhoEscolhido, gelada, comLimao);

            System.out.println("Você escolheu o seguinte refrigerante:");
            System.out.println(refrigerante);
            System.out.println("Preço: R$ " + refrigerante.calcularPreco());
            return refrigerante;

        } else if (opcaoBebida == 2) {
            System.out.println("O suco será adoçado? S/N: ");
            String opcaoAdoçado = sc.nextLine();
            boolean adoçado = opcaoAdoçado.equalsIgnoreCase("S");

            Suco suco = new Suco("Suco", 1, tamanhoEscolhido, gelada, adoçado);

            System.out.println("Você escolheu o seguinte suco:");
            System.out.println(suco);
            System.out.println("Preço: R$ " + suco.calcularPreco());
            return suco;
        } else {
            System.out.println("Opção inválida. Tente novamente.");
        }
        return null;
    }
}
