package Jogo;
import java.util.Random;

public class Maquina implements Jogador {
    private String nome;
    int vida;

    public Maquina(String nome) {  //Criar construtor
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
        ataqueMaquina();
    }

    public int ataqueMaquina () {
        Random random = new Random();
        int ataqueMaquina = random.nextInt(3);
        return ataqueMaquina;
    }
}
