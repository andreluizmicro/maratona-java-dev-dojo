package src.academy.devdojo.javacore.Gassociacao.test;

import src.academy.devdojo.javacore.Gassociacao.dominio.Jogador;
import src.academy.devdojo.javacore.Gassociacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Time time = new Time("Seleção Brasileira");

        jogador1.setTime(time);

        jogador1.imprime();
    }
}
