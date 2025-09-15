import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um valor para Fibonacchi.");
        int num_fibo = leitor.nextInt();
        int soma_total = 0;
        int soma_local1 = 0;
        int soma_local2 = 0;

        for (int i = num_fibo; i >= 0; i--) {
            soma_total = soma_local1 + soma_local2;
        }


        leitor.close();
    }
}