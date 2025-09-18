import java.util.Scanner;

public class exercicio14 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantos valores vai calcular? ");
        int n = leitor.nextInt();

        System.out.println("Digite os valores. ");
        int[] array_para_analise = new int[n];

        for(int i = 0; i < n; i++){
            array_para_analise[i] = leitor.nextInt();
        }

        int repetidos = 0;

        int j = 0;
        
        for(int i = 0; i < n; i++){
            if(array_para_analise[j] == array_para_analise[i]){
                repetidos = repetidos + 1;
                array_para_analise[i] = -999;
            }
            j++;
        }
        
        int[] array_sem_repeticao = new int[n - repetidos];
        for(int i = 0; i < n - repetidos; i++){
            if(array_para_analise[i] != -999){
                array_sem_repeticao[i] = array_para_analise[i];
            }
        }
        for(int i = 0; i < n - repetidos; i++)
            System.out.print(array_sem_repeticao[i]);   
        leitor.close();
    }
}
