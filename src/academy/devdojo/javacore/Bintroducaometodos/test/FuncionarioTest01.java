package src.academy.devdojo.javacore.Bintroducaometodos.test;

import src.academy.devdojo.javacore.Bintroducaometodos.dominio.Funcionario;

/**
 * Crie uma classe Funcionário com os seguintes atributos
 *
 * nome
 * idade
 * salario // Três salários devem ser guardados
 *
 * Crie dois métodos
 *
 * Para imprimir os dados
 * Para tirar a média dos salários e imprimir o resultado.
 *
 */
public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "André Luiz";
        funcionario.idade = 34;
        funcionario.salarios = new double[]{1200, 987.32, 2000};

        funcionario.imprime();
    }
}
