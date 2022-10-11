import Jogo.Batalha;
import Jogo.Jogador;
import Jogo.JogadorHumano;
import Jogo.Maquina;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner meuScanner = new Scanner(System.in);
        Batalha batalha = new Batalha();

        System.out.println ("Informe o nome do jogador 1: ");
        String nome = meuScanner.nextLine();
        JogadorHumano j1 = new JogadorHumano(nome);

        System.out.println ("Informe o nome do jogador 2: ");
        String nome2 = meuScanner.nextLine();
        Maquina maquina = new Maquina(nome2);
        System.out.println ("Informe o nome do jogador 2: ");
        String nome3 = meuScanner.nextLine();
        JogadorHumano j2 = new JogadorHumano(nome3);

        System.out.println (j1.retornarNome() + "HP:" + j1.retornarVida() + " x " + maquina.retornarNome() + "HP:" + maquina.retornarVida());

        batalha.iniciar(j1, j2, maquina);

    }

}