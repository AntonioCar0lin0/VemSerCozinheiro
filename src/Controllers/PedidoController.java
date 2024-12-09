package Controllers;

import Model.Item;
import Model.Pedido;

import java.util.List;

public class PedidoController {


    public List<Pedido> gerarPedidosDia(int numeroPedidos){
        return GeradorPedidos.gerarPedidosDia(numeroPedidos);
    }

    public void adicionarItemPedido(Pedido pedido, Item item){
        pedido.adicionarItem(item);
    }

    public void zerarPedido(Pedido pedido){
        pedido.removerItens();
    }
}
