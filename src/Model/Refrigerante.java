package Model;

import Enums.TamanhoBebida;

public class Refrigerante extends Bebidas{

    private boolean comLimao;

    public Refrigerante(String nomeItem, int quantidade, TamanhoBebida tamanhoBebida, boolean gelada, boolean comLimao) {
        super(nomeItem, quantidade, tamanhoBebida, gelada);
        this.comLimao = comLimao;

    }

    public boolean isComLimao() {
        return comLimao;
    }

    public void setComLimao(boolean comLimao) {
        this.comLimao = comLimao;
    }

    @Override
    public double calcularPreco(){
        return tamanhoBebida.getPreco() * getQuantidade();
    }

    @Override
    public String toString(){
        return getNomeItem() + "|" + getTamanhoBebida() + "| Gelo: " + (isGelada() ? "Sim" : "Não") + "\n" +
        "|Limão: " + (isComLimao()?"Sim" : "Não");
    }
}
