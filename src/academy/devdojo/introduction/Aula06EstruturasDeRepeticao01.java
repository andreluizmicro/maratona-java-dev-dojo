package src.academy.devdojo.introduction;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        // while, do while, for
        int count = 0;
        while(count < 10){
            System.out.println(++count);
        }

        // Executa pelo menos uma vez independente da condição
        int count2 = 12;
        do{
            System.out.println("dentro do do-while");
        }while (count2 < 10);

        for(int i=0;i<10;i++){
            System.out.println("For "+i);
        }
    }
}
