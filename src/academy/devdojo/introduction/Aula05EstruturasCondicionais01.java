package src.academy.devdojo.introduction;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 10;
        int idade2 = 15;
        boolean isAutorizadoComprarBebida = idade2 >=18;

        if (idade >=18) {
            System.out.println("Autorizado a comprar bebida alcólica");
        }else{
            System.out.println("Usuário não autorizado a comprar bebida alcólica!");
        }

        if(!isAutorizadoComprarBebida){ //!isAutorizadoComprarBebida ==  false
            System.out.println("Ops! Não pode comprar bebida");
        }

        //Regras para certificação Java
        boolean c = true;
        if(c = false){ // Estou associando e não fazendo um comparação
            System.out.println("Dentro de algo que nunca deve ser feito");
        }
    }
}
