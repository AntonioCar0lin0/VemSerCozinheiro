package Views;
import Controllers.JogadorController;
import Model.Jogador;
import java.util.Scanner;

public class JogadorView {
    private Jogador jogador;
    private JogadorController jogadorController = new JogadorController();

    public JogadorView() {
        inicializarRestaurante();
    }

    private void inicializarRestaurante() {
        Scanner sc = new Scanner(System.in);
        boolean isOn = true;


        configurarJogador(sc);

        while (isOn) {
            System.out.printf("""
                    Restaurante %s
                    
                    1. Iniciar dia
                    2. Editar restaurante
                    3. Voltar para o menu inicial""", jogador.getNomeJogador());

            int opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    new PedidoView(true);
                    break;
                case 2:
                    configurarJogador(sc);
                    break;
                case 3:
                    isOn = false;
                    new MenuView();
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }

    private void configurarJogador(Scanner sc) {
        System.out.println("Digite o nome do seu restaurante: ");
        String nomeJogador = sc.nextLine();
        jogador = jogadorController.criarJogador(nomeJogador);
    }
}
