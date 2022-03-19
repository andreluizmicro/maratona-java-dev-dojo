package src.academy.devdojo.javaoneforall.introduction;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        double salarioAnual = 70000;
        double primeiraFaixa = 9.70 / 100; // 9.70%
        double segundaFaixa = 37.35 / 100; // 37.35%
        double terceiraFaixa = 49.50 / 100; // 49.50%
        double valorImposto;

        if(salarioAnual <= 34712){
            valorImposto = salarioAnual * primeiraFaixa;
        }else if(salarioAnual >= 34713 && salarioAnual <= 68507){
            valorImposto = salarioAnual * segundaFaixa;
        }else {
            valorImposto = salarioAnual * terceiraFaixa;
        }
        System.out.println("Valor do imposto: R$ " + valorImposto);
    }
}
