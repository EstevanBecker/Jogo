package Jogo;

import java.util.Scanner;

public class Batalha {

    public void atacar(Jogador j1, Jogador j2) {
        do {
            ;
        } while (j1.vida > 0 && j2.vida >0);
            mensagemFinal(j1,j2);
    }
    public void mensagemFinal(Jogador j1, Jogador j2){
        if (j1.vida <=0) {
            System.out.println("Parabéns " + j2.retornarNome() + " Você ganhou");
        } else {
            System.out.println("Parabéns " + j1.retornarNome() + " Você ganhou");
        }
    }

}

