package Jogo;

import java.util.Scanner;

public class Batalha {
Scanner meuScanner = new Scanner(System.in);
    public int atacar(Jogador j1, Jogador j2) {
        int ataqueFraco = 1;
        int ataqueMedio = 2;
        int ataqueForte = 3;
        do {
            System.out.println ("Selecione o ataque desejar 1: Fraco, 2: Medio, 3: Forte");
            int selecionarAtaque=meuScanner.nextInt();
            switch (selecionarAtaque) {
                case 1 -> {
                    System.out.println("Você escolheu o ataque fraco");
                    int vidaAtual = j1.vida - ataqueFraco;
                    j1.vida = vidaAtual;
                    System.out.println(j1.retornarNome() + "HP:" + j1.retornarVida() + " x " + j2.retornarNome() + "HP:" + j2.retornarVida());
                }
                case 2 -> {
                    System.out.println("Você escolheu o ataque medio");
                    int vidaAtual2 = j1.vida - ataqueMedio;
                    j1.vida = vidaAtual2;
                    System.out.println(j1.retornarNome() + "HP:" + j1.retornarVida() + " x " + j2.retornarNome() + "HP:" + j2.retornarVida());
                }
                case 3 -> {
                    System.out.println("Você escolheu o ataque fraco");
                    int vidaAtual3 = j1.vida - ataqueForte;
                    j1.vida = vidaAtual3;
                    System.out.println(j1.retornarNome() + "HP:" + j1.retornarVida() + " x " + j2.retornarNome() + "HP:" + j2.retornarVida());
                }
                default -> {
                    System.out.println("Opção invalida");
                    atacar(j1, j2);
                }
            }
        } while (j1.vida > 0 && j2.vida >0);
        mensagemFinal(j1,j2);
        return ataqueFraco;
    }
    public void mensagemFinal(Jogador j1, Jogador j2){
        if (j1.vida <=0) {
            System.out.println("Parabéns " + j2.retornarNome() + " Você ganhou");
        } else {
            System.out.println("Parabéns " + j1.retornarNome() + " Você ganhou");
        }
    }

}

