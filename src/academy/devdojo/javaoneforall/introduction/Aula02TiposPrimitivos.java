package src.academy.devdojo.javaoneforall.introduction;

/**
 * Tipos primitivos são tipos que vão guardar em memória um valor simples
 */
public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        //int, double, float, char, byte, short, long, boolean
        int idade = (int)10000000000L;
        long numeroGrande = 100000;
        double salarioDouble = (float)2000.0D; // Especifica o tipo de Variavel
        float salarioFloat = 2500.0F;
        byte idadeByte = 10;
        short idadeShort = 32000;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 'M';
        char caractereDois = 87;
        char caractereTres = '\u0041';
        //Ver tabela ASC

        // String não é um tipo primitivo, é uma classe, logo devemos instanciar com letra maiuscula
        String nome = "Goku";

        System.out.println("A idade é: "+idade + " anos");
        System.out.println(verdadeiro);
        System.out.println(falso);
        System.out.println(caractereDois);
        System.out.println(caractereTres);
        System.out.println(idade);

        System.out.println("Oi meu nome é: "+ nome);
    }
}
