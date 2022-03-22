package src.academy.devdojo.introduction;

/**
 * Imprima os primeiros 25 números de um dados valor. Por exemplo, 50
 */
public class Aula06EstruturasDeRepeticao03 {
    public static void main(String[] args) {
        int valorMaximo = 50;
        for (int i = 0; i < valorMaximo; i++) {
            if(i > 25){
                break; // Quebra o for, não existe break dentro de um if
            }
            System.out.println(i);
        }
    }
}
