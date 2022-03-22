package src.academy.devdojo.introduction;

/**
 * Operador Ternário
 */
public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        // Doar se salário > 5000
        double salario = 8000;
        String resultado;

        //           (Condição)    ? verdadeiro : falso
        resultado = salario > 5000 ? "Eu vou doar 500 pro DevDojo" : "Ainda não tenho condições, mas vou ter!";
        System.out.println(resultado);

        //Outra forma, porém não aconselahada
        //System.out.println(salario > 5000 ? mensagemDoar : mensageNaoDoar);

        boolean possoDoar = salario > 5000 ? true : false;
        System.out.println("Posso doar: "+possoDoar);

        /**************** NÂO RECOMENDADO FAZER ISSO ********************************
        // Forma complexa mais não recomendada
        int idade = 100;
        String categoria;
        categoria = idade < 15 ? "Categoria Infantil" : idade >=15 && idade < 18 ? "Categoria Juvenil": "Categoria Adulto";
        **/
    }
}
