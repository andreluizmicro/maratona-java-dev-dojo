package src.academy.devdojo.javacore.Aintroducaoclasses.test;

import src.academy.devdojo.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudande  = new Estudante();
        Estudante estudande2  = new Estudante();

        System.out.println(estudande.nome);
        System.out.println(estudande.idade);
        System.out.println(estudande.sexo);
        System.out.println("=========================");
        estudande2.nome = "Luiz";
        System.out.println(estudande2.nome);
        System.out.println(estudande2.idade);
        System.out.println(estudande2.sexo);

    }
}
