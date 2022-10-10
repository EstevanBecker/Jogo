package Jogo;

import java.util.Random;

public class Jogador {
    private String nome;
    int vida;

    public Jogador(String nome) {  //Criar construtor
        this.nome = nome;
        this.vida = 10;
    }

    public String retornarNome() {
        return this.nome;
    }

    public int retornarVida() {
        return this.vida;
    }

    public void sofrerDano(int dano, Integer chanceAcerto, Integer chanceAcertoCritico) {
        Random random = new Random();
        int numeroAleatorio = random.nextInt(10) + 1;
        int chanceCritico = random.nextInt(10) + 1;
        System.out.println("O Numero foi: " + numeroAleatorio);
        System.out.println("chanceAcerto é: " + chanceAcerto);
        if (numeroAleatorio <= chanceAcerto) {
            vida = vida - dano;
        } else if (chanceCritico <= chanceAcertoCritico) {
            System.out.println ("Uau, isso foi um acerto critico");
            vida = vida - dano * 2;
        } else {
            System.out.println("Você errou");
        }

    }
}
