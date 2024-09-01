import java.util.Scanner;

public class Exercicio7_1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int tamanhoMatriz;

        System.out.println("Digite o número N que determinara o tamanho da matriz quadrada NxN, esse deve estar entre o intervalo de 2 e 5");
        tamanhoMatriz = scn.nextInt();
        if (tamanhoMatriz <2 || tamanhoMatriz >5) {
            System.out.println("Valor inválido, o valor deve ser entre 2 e 5");
            scn.close();
            return;            
        }
        scn.close();

        int[][] matriz = new int[tamanhoMatriz][tamanhoMatriz];   //até aqui fiz suave.

        int valor = 1;
        for(int i=0;i<tamanhoMatriz;i++){
           for(int j=0;j<tamanhoMatriz;j++) {                    //aqui ja tive que pesquisar
            matriz[i][j] = valor++;                              //não criei uma variavel auxiliar "valor"
           }
        }
        int[][] resultado = new int[tamanhoMatriz][tamanhoMatriz];          // Matriz que armazenará o resultado

        for (int i = 0; i < tamanhoMatriz; i++) {                           // Loop externo percorre as linhas da matriz A
            for (int j = 0; j < tamanhoMatriz; j++) {                       // Loop intermediário percorre as colunas da matriz B
                resultado[i][j] = 0;                                        // Inicializa o elemento da matriz resultado em 0
                for (int k = 0; k < tamanhoMatriz; k++) {                   // Loop interno calcula a soma dos produtos para resultado[i][j]
                    resultado[i][j] += matriz[i][k] * matriz[k][j];         // Multiplicação e acumulação
                }
            }                                                               //pesquisei, mas entendi.
        }

        for (int i = 0; i < tamanhoMatriz; i++) {
            for (int j = 0; j < tamanhoMatriz; j++) {
                System.out.print(String.format("%5d", resultado[i][j])); //essa "String.format" é mt boa kkkk
            }
            System.out.println();
        }   
    }
}