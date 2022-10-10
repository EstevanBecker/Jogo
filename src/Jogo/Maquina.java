package Jogo;
import java.util.Random;

public class Maquina {
    private String nomeMaquina = "maquina";
    int vidaMaquina = 10;

    public Maquina (String nomeMaquina, int vidaMaquina) {
        this.nomeMaquina = nomeMaquina;
        this.vidaMaquina = vidaMaquina;
    }

    public int ataqueMaquina() {
        Random gerador = new Random();
        return gerador.nextInt(3) +1;
    }
}
