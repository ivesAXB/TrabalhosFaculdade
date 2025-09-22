import java.util.Arrays;
import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantos valores vai calcular? ");
        int n = leitor.nextInt();

        System.out.println("Digite os valores. ");
        int[] array_para_analise = new int[n];

        for(int i = 0; i < n; i++){
            array_para_analise[i] = leitor.nextInt();
        }
        leitor.close();

        int repetidos = 0;

        for(int j = 0; j < n; j++){
            for(int i = j + 1; i < n; i++){
                if((array_para_analise[j] == array_para_analise[i])){
                    repetidos++;
                    break;
                }
            }
        }

        int tamanho_array_sem_repeticao = (n - repetidos);
        int[] array_sem_repeticao = new int[tamanho_array_sem_repeticao];

        int proximoIndiceLivre = 0;
        
        for (int i = 0; i < n; i++) {
            
            boolean encontradoAntes = false;    
            
            for (int j = 0; j < i; j++) {
                if (array_para_analise[j] == array_para_analise[i]) {
                    encontradoAntes = true;
                    break; // Já achamos uma cópia, não precisa procurar mais
                }
            }
            if (!encontradoAntes) {
                array_sem_repeticao[proximoIndiceLivre] = array_para_analise[i];
                proximoIndiceLivre++;
            }
        }






        

        for(int j = 0; j < tamanho_array_sem_repeticao; j++){
            for(int i = j + 1; i < n; i++){
                if(array_para_analise[j] != array_para_analise[i]){
                    array_sem_repeticao[j] = array_para_analise[j];
                    
                    break;
                }
            }
        }
        
        System.out.println(Arrays.toString(array_sem_repeticao));
        
    }
}
