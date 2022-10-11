package Jogo;

public interface Jogador {
    String retornarNome();
    int retornarVida();
    void sofrerDano(int dano, Integer chanceAcerto, Integer chanceAcertoCritico);
}
