package Controllers;
import Model.Jogador;

public class JogadorController {

    public Jogador criarJogador(String nomeJogador){
        return new Jogador(nomeJogador);
    }
}
