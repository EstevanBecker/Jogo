package Jogo;

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
}
