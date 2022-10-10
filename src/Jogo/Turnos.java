package Jogo;

import java.util.Random;

public class Turnos {
        Random random = new Random();
        int numero = random.nextInt(100);

        if (numero >=50){
                System.out.println("Parabéns você começa jogador 1");
        }else {
                System.out.println("Parabéns você começa jogador 2");
        }
}
