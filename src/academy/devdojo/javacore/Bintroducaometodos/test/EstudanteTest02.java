package src.academy.devdojo.javacore.Bintroducaometodos.test;

import src.academy.devdojo.javacore.Bintroducaometodos.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "André";
        estudante01.idade = 34;
        estudante01.sexo = 'M';

        estudante02.nome = "Paulo";
        estudante02.idade = 32;
        estudante02.sexo = 'M';

        estudante01.imprime();
        estudante02.imprime();
    }
}
