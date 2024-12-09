package Controllers;

import Model.Hamburguer;
import Views.HamburguerView;
import Enums.PontoCarne;
import Enums.TipoCarne;
import Enums.TipoPao;

public class HamburguerController {
    public Hamburguer criarHamburguer(String nomeItem, double precoItem, int quantidade, TipoCarne tipoCarne, PontoCarne pontoCarne, TipoPao tipoPao, boolean ketchup, boolean mostarda) {
        return new Hamburguer(nomeItem, precoItem, quantidade, tipoCarne, pontoCarne, tipoPao, ketchup, mostarda);
    }

}
