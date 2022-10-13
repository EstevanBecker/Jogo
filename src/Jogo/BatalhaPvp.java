package Jogo;
public class BatalhaPvp {
    JogadorHumano j1;
    JogadorHumano j2;
    Turnos turnos = new Turnos();

    public void iniciar(JogadorHumano j1, JogadorHumano j2) {
        do {
            turnos.selecionarTurno(j1, j2);
        } while (j1.vida > 0 && j2.vida >0);
            mensagemFinal(j1,j2);
    }
    public void mensagemFinal(JogadorHumano j1, JogadorHumano j2){
        if (j1.vida <=0) {
            System.out.println("Parabéns " + j2.retornarNome() + " Você ganhou");
        } else {
            System.out.println("Parabéns " + j1.retornarNome() + " Você ganhou");
        }
    }
}

