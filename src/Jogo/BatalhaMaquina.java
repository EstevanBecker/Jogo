package Jogo;

public class BatalhaMaquina {
    Turnos turnos = new Turnos();

    public void iniciar(Jogador j1, Jogador maquina) {
        do {
            turnos.selecionarTurnoMaquina(j1, maquina);
        } while (j1.retornarVida() > 0 && maquina.retornarVida() >0);
        mensagemFinal(j1, maquina);
    }
    public void mensagemFinal(Jogador j1, Jogador maquina){
        if (j1.retornarVida() <=0) {
            System.out.println("Parabéns " + maquina.retornarNome() + " Você ganhou");
        } else {
            System.out.println("Parabéns " + j1.retornarNome() + " Você ganhou");
        }
    }
}
