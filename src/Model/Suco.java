package Model;

import Enums.TamanhoBebida;

public class Suco extends Bebidas{

    private boolean gelo;
    private boolean adocado;

    public Suco(String nomeItem, int quantidade, TamanhoBebida tamanhoBebida, boolean gelada, boolean adocado) {
        super(nomeItem, quantidade, tamanhoBebida, gelada);
        this.adocado = adocado;
    }

    public boolean isAdocado() {
        return adocado;
    }

    public void setAdocado(boolean adocado) {
        this.adocado = adocado;
    }

    @Override
    public double calcularPreco(){
        return tamanhoBebida.getPreco() * getQuantidade();
    }

    @Override
    public String toString() {
        return getNomeItem() + "|" + getTamanhoBebida() + "| Gelo: " + (isGelada() ? "Sim" : "Não") + "\n" +
                "|Adoçado: " + (isAdocado()?"Sim" : "Não");
    }
}
