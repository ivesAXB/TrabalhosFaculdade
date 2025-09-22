import java.util.Scanner;


public class Exercicio13 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantos valores vai calcular? ");
        int n = leitor.nextInt();

        System.out.println("Digite os valores. ");
        int[] valores_para_media = new int[n];

        int valor_total = 0;

        for(int i = 0; i < n; i++){
            valores_para_media[i] = leitor.nextInt();
        }
        for(int i = 0; i < n; i++){
            valor_total = valor_total + valores_para_media[i];
        }

        double calc_media = (double) valor_total/n;

        System.out.printf("A média da lista de valores é: %.2f", calc_media);

        leitor.close();
    }
}
