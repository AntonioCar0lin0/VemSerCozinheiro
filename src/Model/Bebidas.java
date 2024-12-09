package Model;

import Enums.TamanhoBebida;

public abstract class Bebidas extends Item{
    public TamanhoBebida tamanhoBebida;
    private boolean gelada;

    public Bebidas(String nomeItem, int quantidade, TamanhoBebida tamanhoBebida, boolean gelada) {
        super(nomeItem, tamanhoBebida.getPreco(), quantidade);
        this.tamanhoBebida = tamanhoBebida;
        this.gelada = gelada;
    }

    public TamanhoBebida getTamanhoBebida() {
        return tamanhoBebida;
    }

    public boolean isGelada() {
        return gelada;
    }

    public void setTamanhoBebida(TamanhoBebida tamanhoBebida) {
        this.tamanhoBebida = tamanhoBebida;
    }

    public void setGelada(boolean gelada) {
        this.gelada = gelada;
    }

}
