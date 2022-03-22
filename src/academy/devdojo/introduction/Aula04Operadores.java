package src.academy.devdojo.introduction;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / *
        int numero01 = 10;
        int numero02 = 20;
        double numero03 = 30;
        int resultado = numero01 / numero02;
        System.out.println("Valor: " + resultado);

        // Outros Operadores
        // % -> resto
        int resto = 20 / 2;
        System.out.println("Resto: " + resto);

        // Operadores Lógicos
        // < > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10.0;
        System.out.println("isDezMaiorQueVinte: " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte: " + isDezMenorQueVinte);
        System.out.println("isDezIgualDez: " + isDezIgualVinte);
        System.out.println("isDezDiferenteDez: " + isDezDiferenteDez);

        // Operadores Lógicos
        // && (AND), || (OR), !(NOT)

        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println("isDentroDaLeiMaiorQueTrinta: " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta: " + isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupança = 10000;
        float valorPlaystation = 5000F;

        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupança > valorPlaystation;
        System.out.println("Posso comprar um Playstation 5: "+ isPlaystationCincoCompravel);

        // Operadores de atribuição
        // = += -= *= /= %=
        double bonus = 1800;
        //bonus = bonus + 1000
        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println(bonus);

        //Operadores Unários
        int contador = 0;
        contador += 1; // contador = contador + 1
        // Pós incremento
        contador ++;
        contador --;
        // Pré incremento
        ++contador;
        --contador;
        System.out.println(contador);

        int contador2 = 0;
        System.out.println("Contador2: "+contador2++);
        System.out.println("Contador2: "+contador2);

    }
}
