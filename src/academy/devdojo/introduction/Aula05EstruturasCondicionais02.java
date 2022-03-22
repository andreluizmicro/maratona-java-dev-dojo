package src.academy.devdojo.introduction;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        // idade < 15 categoria Infatinl
        // idade >= 15 e idade < 18 Juvenil
        // idade >= 18 categoria Adulto

        int idade = 12;
        String categoria;

        if(idade < 15){
            categoria = "Categoria Infantil";
        }else if(idade >= 15 && idade < 18){
            categoria = "Categoria Juvenil";
        }else{ // Não é necessário if else
            categoria = "Categoria Adulto";
        }

        System.out.println("A categoria é: "+categoria);
    }
}
