package src.academy.devdojo.javacore.Bintroducaometodos.test;

import src.academy.devdojo.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        System.out.println("Finalizando Calculadora Test01");
        calculadora.subtraiDoisNumeros();
    }
}
