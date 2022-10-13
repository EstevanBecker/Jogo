package Jogo;

import java.util.Random;
import java.util.Scanner;

public class Turnos {
        Jogador j1, j2, maquina;
        Scanner meuScanner = new Scanner(System.in);


        public Turnos() {
                this.j1 = j1;
                this.j2 = j2;
                this.maquina = maquina;
        }

        public void selecionarTurno(Jogador j1, Jogador j2) {
                Random random = new Random();
                int numero = random.nextInt(10);
                if (numero <= 5) {
                        System.out.println("Parabéns jogador " + j2.retornarNome() + ", é sua vez");
                        selecionarAtaqueMaquina(j1); //o 'jogador' que vai atacar não é o que é passado no método.
                } else {
                        System.out.println("Parabéns jogador " + j1.retornarNome() +", é sua vez");
                        selecionarAtaqueMaquina(j2); // o 'jogador' que vai atacar não é o que é passado no método;
                }
                System.out.println (j1.retornarNome() + " HP:" + j1.retornarVida() + " x " + j2.retornarNome() + " HP:" + j2.retornarVida());
        }

                public void selecionarAtaque(Jogador jogadorHumano){
                        System.out.println("Selecione o ataque desejar 1: Fraco, 2: Medio, 3: Forte");
                        int selecionarAtaque = meuScanner.nextInt();
                        switch (selecionarAtaque) {
                                case 1 -> {
                                        System.out.println("Você escolheu o ataque fraco");
                                        jogadorHumano.sofrerDano(1,9,2);
                                }
                                case 2 -> {
                                        System.out.println("Você escolheu o ataque medio");
                                        jogadorHumano.sofrerDano(2,6,2);
                                }
                                case 3 -> {
                                        System.out.println("Você escolheu o ataque forte");
                                        jogadorHumano.sofrerDano(3,3,2);
                                }
                                default -> {
                                        System.out.println("Opção invalida");
                                        selecionarAtaque(jogadorHumano);
                                }
                        }

                }

        public void selecionarTurnoMaquina(Jogador j1, Jogador maquina) {
                Random random = new Random();
                int numero = random.nextInt(10);
                if (numero <= 5) {
                        System.out.println("Parabéns jogador " + maquina.retornarNome() + ", é sua vez");
                        selecionarAtaqueMaquina(j1); //o 'jogador' que vai atacar não é o que é passado no método.
                } else {
                        System.out.println("Parabéns jogador " + j1.retornarNome() +", é sua vez");
                        selecionarAtaque(maquina); // o 'jogador' que vai atacar não é o que é passado no método;
                }
                System.out.println (j1.retornarNome() + " HP:" + j1.retornarVida() + " x " + maquina.retornarNome() + " HP:" + maquina.retornarVida());
        }

        public void selecionarAtaqueMaquina(Jogador maquina){
                Random random = new Random();
                int selecionarAtaque = random.nextInt(3);
                switch (selecionarAtaque) {
                        case 1 -> {
                                System.out.println("A Maquina escolheu o ataque fraco");
                                maquina.sofrerDano(1,9,2);
                        }
                        case 2 -> {
                                System.out.println("A Maquina escolheu o ataque medio");
                                maquina.sofrerDano(2,6,2);
                        }
                        case 3 -> {
                                System.out.println("A Maquina escolheu o ataque forte");
                                maquina.sofrerDano(3,3,2);
                        }
                }

        }


}