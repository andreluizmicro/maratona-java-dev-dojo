package src.academy.devdojo.introduction;

/*
    Crie uma variável para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

    Eu <nome>, morando no endereco <endereco>
    confirmo que recebi o salário de <salario>, na <data>
 */
public class Aula03TiposPrimitivosExercicios {
    public static void main(String[] args) {
        String nome = "André";
        String endereco = "Rua Padre Petrus Dingenouts";
        double salario = 6500;
        String dataRecebimento = "10/12/2021";
        String relatorio = "Eu "+nome+ " morando no endereço "+endereco +" confirmo que recebi o salário de R$ "+salario + " , na data " + dataRecebimento;
        System.out.println(relatorio);
    }
}
