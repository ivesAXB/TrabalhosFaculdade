import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantos números irá digitar? ");
        int n = leitor.nextInt();
        System.out.println("Digite uma sequencia de números");
        int[] inteiros = new int[n];

        int maior_numero = 0;

        for (int i = 0; i < n; i++){
            inteiros[i] = leitor.nextInt();
            if(maior_numero < inteiros[i]){
                maior_numero = inteiros[i];
            }
            System.out.printf("Pegando o número %d e colocando no indice %d.\n",inteiros[i], i);
        }

        System.out.printf("O maior número que você tem é o %d.",maior_numero);

        



        leitor.close();
    }
}