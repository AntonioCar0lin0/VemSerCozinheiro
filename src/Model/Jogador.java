package Model;

public class Jogador {
    private String nomeJogador;
    private int pontos;

    public Jogador(String nomeJogador) {
        this.nomeJogador = nomeJogador;
        this.pontos = 0;
    }

    public String getNomeJogador() {
        return nomeJogador;
    }

    public void setNomeJogador(String nomeJogador) {
        this.nomeJogador = nomeJogador;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }
}
