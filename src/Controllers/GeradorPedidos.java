package Controllers;

import Enums.PontoCarne;
import Enums.TamanhoBebida;
import Enums.TipoCarne;
import Enums.TipoPao;
import Model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GeradorPedidos {

    private static final Random RANDOM = new Random();

    public static Pedido gerarPedidoAleatorio() {
        Pedido pedido = new Pedido(RANDOM.nextBoolean());

        // Seleciona valores aleatórios dos ENUMs
        TipoPao pao = TipoPao.values()[RANDOM.nextInt(TipoPao.values().length)];
        TipoCarne carne = TipoCarne.values()[RANDOM.nextInt(TipoCarne.values().length)];
        PontoCarne pontoCarne = PontoCarne.values()[RANDOM.nextInt(PontoCarne.values().length)];

        double precoItem = pao.getPreco() + carne.getPreco() + pontoCarne.getPreco();

        Hamburguer hamburguer = new Hamburguer("Hamburguer", precoItem,
                RANDOM.nextInt(2) + 1,
                carne,
                pontoCarne,
                pao,
                RANDOM.nextBoolean(),
                RANDOM.nextBoolean()
                );

        pedido.adicionarItem(hamburguer);

        // RANDOMIZADOR DE BEBIDA
        if (RANDOM.nextBoolean()){
            Refrigerante refrigerante = new Refrigerante(
                    "Refrigerante", RANDOM.nextInt(2) + 1,
                    TamanhoBebida.values()[RANDOM.nextInt(TamanhoBebida.values().length)],
                    RANDOM.nextBoolean(),
                    RANDOM.nextBoolean()
            );
            pedido.adicionarItem(refrigerante);
        } else {
            Suco suco = new Suco(
                    "Suco", RANDOM.nextInt(2) + 1,
                    TamanhoBebida.values()[RANDOM.nextInt(TamanhoBebida.values().length)],
                    RANDOM.nextBoolean(),
                    RANDOM.nextBoolean()
            );
            pedido.adicionarItem(suco);
        }

        return pedido;
    }

    public static List<Pedido> gerarPedidosDia(int numeroDePedidos) {
        List<Pedido> pedidosDoDia = new ArrayList<>();
        for (int i = 0; i < numeroDePedidos; i++) {
            pedidosDoDia.add(gerarPedidoAleatorio());
        }
        return pedidosDoDia;
    }

}
