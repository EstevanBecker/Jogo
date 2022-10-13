package Jogo;
public class BatalhaPvp {
    Turnos turnos = new Turnos();

    public void iniciar(Jogador j1, Jogador j2) {
        do {
            turnos.selecionarTurno(j1, j2);
        } while (j1.retornarVida() > 0 && j2.retornarVida() >0);
            mensagemFinal(j1,j2);
    }
    public void mensagemFinal(Jogador j1, Jogador j2){
        if (j1.retornarVida() <=0) {
            System.out.println("Parabéns " + j2.retornarNome() + " Você ganhou");
        } else {
            System.out.println("Parabéns " + j1.retornarNome() + " Você ganhou");
        }
    }
}

