package Enums;

public enum PontoCarne {
    MAL_PASSADA("Mal passada - Carne vermelha e suculenta",1.00),
    AO_PONTO("Ao ponto - Carne rosada no meio",1.00),
    BEM_PASSADA("Bem passada - Carne completamente Cozida",1.00);

    private final String descricao;
    private final double preco;

    PontoCarne(String descricao, double preco) {
        this.descricao = descricao;
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public String getDescricao() {
        return descricao;
    }
}
