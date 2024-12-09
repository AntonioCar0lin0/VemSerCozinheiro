package Model;

import Enums.PontoCarne;
import Enums.TipoCarne;
import Enums.TipoPao;

public class Hamburguer extends Item{

    private TipoCarne tipoCarne;
    private PontoCarne pontoCarne;
    private TipoPao tipoPao;
    private boolean ketchup;
    private boolean mostarda;


    public Hamburguer(String nomeItem, double precoItem, int quantidade, TipoCarne tipoCarne, PontoCarne pontoCarne, TipoPao tipoPao, boolean ketchup, boolean mostarda) {
        super(nomeItem, precoItem, quantidade);
        this.tipoCarne = tipoCarne;
        this.pontoCarne = pontoCarne;
        this.tipoPao = tipoPao;
        this.ketchup = ketchup;
        this.mostarda = mostarda;
    }

    public TipoCarne getTipoCarne() {
        return tipoCarne;
    }

    public PontoCarne getPontoCarne() {
        return pontoCarne;
    }

    public TipoPao getTipoPao() {
        return tipoPao;
    }

    public boolean isKetchup() {
        return ketchup;
    }

    public boolean isMostarda() {
        return mostarda;
    }


    @Override
    public double calcularPreco() {
        return (tipoCarne.getPreco() + tipoPao.getPreco() + pontoCarne.getPreco()) * getQuantidade();
    }

    @Override
    public String toString(){
        return getNomeItem() + " com " + tipoPao + ", " + tipoCarne + " (" + pontoCarne + ") | Quantidade - " + getQuantidade();
    }
}
