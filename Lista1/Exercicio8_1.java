import java.util.Scanner;
public class Exercicio8_1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int valor1 = 1;
        int valor2 = 1;

        System.out.println("Digite o numero de linhas da matriz_1 a ser multiplicada");
        int linhas1 = scn.nextInt();
        System.out.println("Digite o numero de colunas da matriz_1");
        int colunas1 = scn.nextInt();

        System.out.println("Digite o numero de linhas da matriz_2 a ser multiplicada");
        int linhas2 = scn.nextInt();
        System.out.println("Digite o numero de colunas da matriz_2");
        int colunas2 = scn.nextInt();

        if (colunas1 != linhas2) {
            System.out.println("Multiplicação de matrizes não é possível. O número de colunas da primeira matriz deve ser igual ao número de linhas da segunda matriz.");
            scn.close();
            return;
        }
        scn.close();

        int [][] matriz_1 = new int[linhas1][colunas1];
        
        for(int i=0;i<linhas1;i++){
           for(int j=0;j<colunas1;j++) {                   
            matriz_1[i][j] = valor1++;                            
           }
        }

        int[][] matriz_2 = new int[linhas2][colunas2];
        for(int i=0;i<linhas2;i++){
            for(int j=0;j<colunas2;j++) {                   
             matriz_2[i][j] = valor2++;                            
            }
         }
        //até aqui fiz bem, agora a lógica das multiplicações ainda não peguei o jeito, vou pesquisar.  
        
        int[][] resultado = new int[linhas1][colunas2];

        // Multiplicação das matrizes
        for (int i = 0; i < linhas1; i++) {
            for (int j = 0; j < colunas2; j++) {
                resultado[i][j] = 0;
                for (int k = 0; k < colunas1; k++) {
                    resultado[i][j] += matriz_1[i][k] * matriz_2[k][j];
                }
            }
        }
        System.out.println("Resultado da multiplicação das matrizes:");
        for (int i = 0; i < linhas1; i++) {
            for (int j = 0; j < colunas2; j++) {
                System.out.print(String.format("%4d", resultado[i][j]));
            }
            System.out.println();
        }
    }
}

       