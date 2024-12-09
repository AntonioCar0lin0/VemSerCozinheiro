package Views;
import Controllers.PedidoController;
import Model.Hamburguer;
import Model.Pedido;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PedidoView {
    private String nomeCliente;
    private int horarioPedidoFeito;
    private int horarioPedidoEntregue;
    static Pedido pedidoCliente;
    static Pedido pedidoMontado;
    static List<Pedido> pedidosDoDia;
    static List<Pedido> pedidosEntreguesDia;
    static int pedidoAtual=0;
    static int faseAtual = 1;
    static int pedidosEntregues = 0;
    PedidoController pedidoController = new PedidoController();

    public PedidoView(boolean isInicio) {
        if(isInicio) {
            gerarPedidosFaseAtual();
            exibirMenu();
        } else {
            exibirMenu();
        }
    }

    private void exibirMenu(){
        Scanner sc = new Scanner(System.in);
        boolean opcaoValida = false;

        while(!opcaoValida){
            System.out.println("""
                Tela de Pedido
                
                1. Receber pedido
                2. Visualizar pedido recebido
                3. Montar pedido
                4. Entregar pedido""");

            int opcao = sc.nextInt();
            sc.nextLine();

            switch(opcao){
                case 1:
                    receberNovoPedido(pedidoAtual);
                    visualizarPedido();
                    pedidoAtual++;
                    break;
                case 2:
                    visualizarPedido();
                    break;
                case 3:
                    montarHamburguer();
                    opcaoValida = true;
                    break;
                case 4:
                    entregarPedido();
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }

    }

    private void receberNovoPedido(int pedidoAtual) {
        if(pedidoCliente != null){
            System.out.println("Você tem um pedido para ser entregue!");
            return;
        }
        pedidoCliente = pedidosDoDia.get(pedidoAtual);
        System.out.println("Pedido recebido com sucesso!");
    }

    private void gerarPedidosFaseAtual(){
        switch(faseAtual){
            case 1:
                pedidosDoDia = pedidoController.gerarPedidosDia(2);
                break;
            case 2:
                pedidosDoDia = pedidoController.gerarPedidosDia(3);
                break;
            default:
                System.out.println("Você completou todos os níveis.");
                System.out.println("Pontuação: ");
        }
    }

    private void entregarPedido(){
        pedidosEntreguesDia.add(pedidoMontado);
        if(pedidoCliente.equals(pedidoMontado)){
            System.out.println("Você entregou o pedido correto!");
        } else {
            System.out.println("Você entregou o pedido com falhas!");
        }
        pedidosEntregues++;
        if(pedidosEntregues == pedidosDoDia.size()){
            System.out.println("Você passou de nível! Agora recebera uma lista de pedidos maior!");
            faseAtual++;
        }
    }

    private void calcularPontuacaoPedido(){}

    private void visualizarPedido(){
        System.out.println(pedidoCliente.toString());
    }

    private void montarHamburguer(){
        new HamburguerView();
    }

    private void adicionarBebida(Pedido pedido){}

    public static Pedido getPedidoCliente() {
        return pedidoCliente;
    }

    public static void setPedidoCliente(Pedido pedidoCliente) {
        PedidoView.pedidoCliente = pedidoCliente;
    }

    public static Pedido getPedidoMontado() {
        return pedidoMontado;
    }

    public static void setPedidoMontado(Pedido pedidoMontado) {
        PedidoView.pedidoMontado = pedidoMontado;
    }
}