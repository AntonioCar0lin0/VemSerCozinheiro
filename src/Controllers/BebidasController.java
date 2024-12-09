package Controllers;

import Enums.TamanhoBebida;
import Model.Refrigerante;
import Model.Suco;

public class BebidasController {
    public Refrigerante criarRefrigerente(String nomeItem, int quantidade, TamanhoBebida tamanhoBebida, boolean gelada, boolean comLimao){
        return new Refrigerante(nomeItem, quantidade,tamanhoBebida, gelada, comLimao);
    }

    public Suco criarSuco(String nomeItem, int quantidade, TamanhoBebida tamanhoBebida, boolean gelada, boolean adocado){
        return new Suco(nomeItem, quantidade, tamanhoBebida, gelada, adocado);
    }

}
