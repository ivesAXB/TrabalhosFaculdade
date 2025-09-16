import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantos números irá digitar? ");
        int n = leitor.nextInt();
        System.out.println("Digite uma sequencia de números");
        int[] inteiros = new int[n];

        for (int i = 0; i < n; i++){
            inteiros[i] = leitor.nextInt();   
        }

        leitor.close();
    }
    public static int[] crescente(int[] arrayParaOrdenar){

        int meio = (arrayParaOrdenar.length/2);
        int[] metadeesquerda = new int[meio];
        int[] metadedireita = new int[(arrayParaOrdenar.length-meio)];


            if (arrayParaOrdenar.length <= 1){
                return arrayParaOrdenar;
            } else {
                for(int i = 0; i < meio; i++){
                    metadeesquerda[i] = arrayParaOrdenar[i];
                }
                for(int i = meio; i < arrayParaOrdenar.length; i++){
                    metadedireita[i - meio] = arrayParaOrdenar[i];
                }
                int[] metadeEsquerdaOrdenada = crescente(metadeesquerda);
                int[] metadeDireitaOrdenada = crescente(metadedireita);
                int[] arrayResultado = new int[arrayParaOrdenar.length];

                int i = 0; // para o indice da esquerda
                int j = 0; // para o indice da direita
                int k = 0; // para o indice do resultado

                 (while (i < metadeEsquerdaOrdenada.length && j < metadeDireitaOrdenada.length)){
                    if(metadeEsquerdaOrdenada[i] > metadeDireitaOrdenada[j]){
                        arrayResultado[k] = metadeDireitaOrdenada[j];
                    } else {
                        arrayResultado[k] = metadeEsquerdaOrdenada[i];
                    }
                    i++;
                    j++;
                    k++;
                 }

                return arrayResultado;
            }

        }
}