package Enums;

public enum TamanhoBebida {
    PEQUENO(5.00),
    MEDIO(7.00),
    GRANDE(10.00);

    private final double preco;

    TamanhoBebida(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }
}
