package Jogo;

import java.util.Random;
import java.util.Scanner;

public class Turnos {
        Jogador j1, j2;
        Scanner meuScanner = new Scanner(System.in);


        public Turnos(Jogador j1, Jogador j2) {
                this.j1 = j1;
                this.j2 = j2;
        }

        public void selecionarTurno(Jogador j1, Jogador j2) {
                Random random = new Random();
                int numero = random.nextInt(100);

                if (numero <= 50) {
                        System.out.println("Parabéns jogador " + j2.retornarNome() + ", é sua vez");
                        selecionarTipoDeAtaque(j1); //o 'jogador' que vai atacar não é o que é passado no método.
                } else {
                        System.out.println("Parabéns jogador " + j1.retornarNome() +", é sua vez");
                        selecionarTipoDeAtaque(j2); // o 'jogador' que vai atacar não é o que é passado no método;
                }
                System.out.println (j1.retornarNome() + " HP:" + j1.retornarVida() + " x " + j2.retornarNome() + " HP:" + j2.retornarVida());
        }

                public void selecionarTipoDeAtaque(Jogador jogador){
                        System.out.println("Selecione o ataque desejar 1: Fraco, 2: Medio, 3: Forte");
                        int selecionarAtaque = meuScanner.nextInt();
                        switch (selecionarAtaque) {
                                case 1 -> {
                                        System.out.println("Você escolheu o ataque fraco");
                                        jogador.sofrerDano(1,9,2);
                                }
                                case 2 -> {
                                        System.out.println("Você escolheu o ataque medio");
                                        jogador.sofrerDano(2,6,2);
                                }
                                case 3 -> {
                                        System.out.println("Você escolheu o ataque forte");
                                        jogador.sofrerDano(3,3,2);
                                }
                                default -> {
                                        System.out.println("Opção invalida");
                                        selecionarTurno(j1, j2);
                                }
                        }

                }
}