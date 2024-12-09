package Views;

import java.util.Scanner;

public class MenuView {

    public MenuView() {
        inicializarMenu();
    }

    private void inicializarMenu(){
        Scanner sc = new Scanner(System.in);
        boolean isOn = true;

        while (isOn) {
            System.out.println("""
                Vem Ser Cozinheiro
                
                1. Iniciar jogo
                2. Ver história
                3. Sair""");

            int option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    isOn = false;
                    new JogadorView();
                    break;
                case 2:
                    mostrarHistoria();
                    break;
                case 3:
                    System.out.println("Abandonando o barco...");
                    isOn = false;
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }

    private void mostrarHistoria(){
        System.out.println("Historia Vem Ser Cozinheiro");

        System.out.println("""
                Quem nunca pensou em ser um jurado do MasterChef?! Ou até mesmo ser portador de uma estrela Michellin?!
                Neste jogo você será o dono de uma lanchonete fast-food e precisa atender os clientes, montando os lanches solicitados de forma correta, 
                aumentando sua fama e suas chances em alcançar sucesso na cidade e no mundo.
                
                - Escolher o tipo de carne.
                - Escolher o ponto da carne
                - Selecionar o pão correto.
                - Adicionar a bebida correspondente.
                
                O desafio está em montar os pedidos corretamente antes que o tempo acabe ou que os clientes fiquem insatisfeitos!
                Então, dá play no jogo e Vem Ser Cozinheiro com a gente!
                """);
    }
}
