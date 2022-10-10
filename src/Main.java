import Jogo.Batalha;
import Jogo.Jogador;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner meuScanner = new Scanner(System.in);
        Batalha batalha = new Batalha();

        System.out.println ("Informe o nome do jogador 1: ");
        String nome = meuScanner.nextLine();
        Jogador j1 = new Jogador(nome);

        System.out.println ("Informe o nome do jogador 2: ");
        String nome2 = meuScanner.nextLine();
        Jogador j2 = new Jogador(nome2);

        System.out.println (j1.retornarNome() + "HP:" + j1.retornarVida() + " x " + j2.retornarNome() + "HP:" + j2.retornarVida());

        batalha.atacar(j1,j2);


    }

}