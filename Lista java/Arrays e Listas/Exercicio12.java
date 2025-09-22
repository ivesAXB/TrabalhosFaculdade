import java.util.Arrays;
import java.util.Scanner;

public class Exercicio12 {

    // Método principal: Ponto de entrada do programa
    public static void main(String[] args) {
        // --- 1. LEITURA DOS DADOS ---
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantos números irá digitar? ");
        int n = leitor.nextInt();
        System.out.println("Digite uma sequencia de números");
        int[] inteiros = new int[n];

        for (int i = 0; i < n; i++) {
            inteiros[i] = leitor.nextInt();
        }
        leitor.close();

        // --- 2. CHAMADA DA FUNÇÃO DE ORDENAÇÃO ---
        // Chama o método 'crescente' e guarda o novo array ordenado.
        int[] arrayOrdenado = crescente(inteiros);

        // --- 3. IMPRESSÃO DO RESULTADO ---
        System.out.println("\nO array ordenado é:");
        System.out.println(Arrays.toString(arrayOrdenado));
    }

    /**
     * Ordena um array de inteiros em ordem crescente usando o algoritmo Merge Sort recursivo.
     * @param arrayParaOrdenar O array que será ordenado.
     * @return Um novo array contendo os elementos do original, mas em ordem crescente.
     */
    public static int[] crescente(int[] arrayParaOrdenar) {

        // --- CASO BASE ---
        // Se o array tem 1 ou 0 elementos, ele já está ordenado. Esta é a condição de parada.
        if (arrayParaOrdenar.length <= 1) {
            return arrayParaOrdenar;
        }

        // --- ETAPA DE "DIVIDIR" ---
        // Acha o meio e cria os dois subarrays.
        int meio = arrayParaOrdenar.length / 2;
        int[] metadeEsquerda = new int[meio];
        int[] metadeDireita = new int[arrayParaOrdenar.length - meio];

        // Preenche o subarray da esquerda
        for (int i = 0; i < meio; i++) {
            metadeEsquerda[i] = arrayParaOrdenar[i];
        }
        // Preenche o subarray da direita
        for (int i = meio; i < arrayParaOrdenar.length; i++) {
            metadeDireita[i - meio] = arrayParaOrdenar[i];
        }

        // --- ETAPA DE "CONQUISTAR" (AS CHAMADAS RECURSIVAS) ---
        // Chama a si mesmo para ordenar as duas metades.
        int[] metadeEsquerdaOrdenada = crescente(metadeEsquerda);
        int[] metadeDireitaOrdenada = crescente(metadeDireita);

        // --- ETAPA DE "COMBINAR" (O MERGE) ---
        // Junta as duas metades já ordenadas em um único array final.
        int[] arrayResultado = new int[arrayParaOrdenar.length];
        int i = 0; // Ponteiro para a metade esquerda
        int j = 0; // Ponteiro para a metade direita
        int k = 0; // Ponteiro para o array de resultado

        // Compara os elementos das duas metades e adiciona o menor ao resultado
        while (i < metadeEsquerdaOrdenada.length && j < metadeDireitaOrdenada.length) {
            if (metadeEsquerdaOrdenada[i] <= metadeDireitaOrdenada[j]) {
                arrayResultado[k] = metadeEsquerdaOrdenada[i];
                i++;
            } else {
                arrayResultado[k] = metadeDireitaOrdenada[j];
                j++;
            }
            k++;
        }

        // Depois que um dos subarrays acaba, copia o restante do outro.
        // Apenas um destes dois 'while' será executado.
        while (i < metadeEsquerdaOrdenada.length) {
            arrayResultado[k] = metadeEsquerdaOrdenada[i];
            i++;
            k++;
        }
        while (j < metadeDireitaOrdenada.length) {
            arrayResultado[k] = metadeDireitaOrdenada[j];
            j++;
            k++;
        }

        return arrayResultado;
    }
}