package src.academy.devdojo.javacore.Aintroducaoclasses.test;

import src.academy.devdojo.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Fusca Bala";
        carro1.ano = 1969;
        carro1.modelo = "Sport";

        carro1 = carro2;

        carro2.nome = "Mustang";
        carro2.ano = 1968;
        carro2.modelo = "GT-500";

        System.out.println("CARRO 1: \nnome: " + carro1.nome + " Modelo: " + carro1.modelo + " Ano:" + carro1.ano);
        System.out.println("CARRO 2: \nnome: " + carro2.nome + " Modelo: " + carro2.modelo + " Ano:" + carro2.ano);
    }
}
