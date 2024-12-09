package Model;

import java.util.ArrayList;

public class Pedido {

    private int id = 1;
    public ArrayList<Item> itens;
    private boolean acompanhaBatata;


    public Pedido(boolean acompanhaBatata) {
        this.id = ++id;
        this.itens = new ArrayList<>();
        this.acompanhaBatata = acompanhaBatata;
    }

    public int getId() {
        return id;
    }

    public ArrayList<Item> getItens() {
        return itens;
    }

    public void adicionarItem(Item item){
        itens.add(item);
    }

    public double calcularTotal(){
        return itens.stream()
                .mapToDouble(Item::calcularPreco)
                .sum();
    }

    public void removerItens(){
        itens.clear();
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Pedido ID: ").append((id)).append("\n");
        sb.append("Itens do Pedido:\n");

        for (Item item : itens){
            sb.append("- ").append(item.toString()).append("\n");
        }

        return sb.toString();
    }
}
