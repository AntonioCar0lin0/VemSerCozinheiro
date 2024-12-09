package Enums;

public enum TipoCarne {
    CARNE(4.00),
    FRANGO(3.00),
    VEGANO(6.00);

    private final double preco;

    TipoCarne(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }
}
