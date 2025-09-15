import java.util.Scanner;

public class Exercicio9 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite uma palavra para ser analisada:");
        String palavra = leitor.nextLine();

        for (int i = 0; i < (palavra.length()); i++) {
            char is_vogal = palavra.charAt(i);
            if ((is_vogal == 'a') || (is_vogal == 'e') || (is_vogal == 'i') || (is_vogal == 'u')){
                System.out.printf("Achamos uma vogal, na %d° letra.\n", (i+1));
            }
        }

        leitor.close();
    }
}