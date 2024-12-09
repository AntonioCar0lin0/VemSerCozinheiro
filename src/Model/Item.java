package Model;

public abstract class Item {

    private String nomeItem;
    private double precoItem;
    private int quantidade;

    public Item(String nomeItem, double precoItem, int quantidade) {
        this.nomeItem = nomeItem;
        this.precoItem = precoItem;
        if(quantidade <= 0){
            System.out.println("Quantidade inválida, por favor, tente novamente.");
        } else {
            this.quantidade = quantidade;
        }
    }

    public String getNomeItem() {
        return nomeItem;
    }

    public double getPrecoItem() {
        return precoItem;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setPrecoItem(double precoItem) {
        this.precoItem = precoItem;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade > 0){
            this.quantidade = quantidade;
        } else {
            System.out.println("Quantidade inválida, por favor, tente novamente.");
        }
    }

    public abstract double calcularPreco();


}
