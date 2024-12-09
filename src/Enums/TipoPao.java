package Enums;

public enum TipoPao {
    AUSTRALIANO(4.00),
    INTEGRAL(5.00),
    BRIOCHE(4.50);

    private final double preco;

    TipoPao(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }
}
