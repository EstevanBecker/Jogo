import Jogo.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner meuScanner = new Scanner(System.in);
        BatalhaPvp batalhaPvp = new BatalhaPvp();
        BatalhaMaquina batalhaMaquina = new BatalhaMaquina();


        System.out.println ("Informe o nome do jogador 1: ");
        String nome = meuScanner.nextLine();
        Jogador j1 = new JogadorHumano(nome);

        System.out.println ("Escolha se você deseja jogar com 1 ou 2 players");
        int escolha = meuScanner.nextInt();

        if (escolha == 2) {

            System.out.println("Informe o nome do jogador 2: ");
            String nome2 = meuScanner.nextLine();
            Jogador j2 = new JogadorHumano(nome2);

            System.out.println(j1.retornarNome() + "HP:" + j1.retornarVida() + " x " + j2.retornarNome() + "HP:" + j2.retornarVida());

            batalhaPvp.iniciar(j1, j2);
        }
        else if (escolha == 1) {
            Jogador maquina = new Maquina("Jorge");
            System.out.println(j1.retornarNome() + "HP:" + j1.retornarVida() + " x " + maquina.retornarNome() + "HP:" + maquina.retornarVida());
            batalhaMaquina.iniciar(j1, maquina);
        }

    }

}