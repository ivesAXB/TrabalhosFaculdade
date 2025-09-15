import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um valor para Fibonacchi.");
        int num_fibo = leitor.nextInt();

        int resultado_final = fibonacchi(num_fibo);

        System.out.printf("O resultado é: %d", resultado_final);
        
        leitor.close();
        }
        
        public static int fibonacchi(int n){
            //1. CASO BASE
            //Se 'n' for 0 ou 1 sabemos que deve retornar 0 para n = 0 e 1 para n = 1.
            //Condição de parada
            if (n < 2){
                return n; //Se digitarem 1 ou 0 o caso tá resolvido (e maior que 0)
            } else {
                return fibonacchi(n - 1) + fibonacchi(n - 2);//Se digitarem qualquer coisa que for maior que 1 ele vai retornar n = (a função - 1) + (a função -2)
            }                                                                                                                   // no caso seria num_fibo = 3
    }                                                                                                                          // ...fibonacchi(3) = ..fibonacchi(2) + .fibonacchi(1)
                                                                                                                              // ..fibonacchi(2) = .fibonachi(1) + fibonacchi(0)
}                                                                                                                            // ..fibonacchi(2) = .1 + 0 = 1
                                                                                                                            // ...fibonacchi(3) = ..1 + .1 = 2