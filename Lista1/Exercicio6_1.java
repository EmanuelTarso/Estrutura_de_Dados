import java.util.Scanner;

public class Exercicio6_1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        System.out.println("Informe 9 valores inteiros para a matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                 System.out.print("Valor para a posição [" + i + "][" + j + "]: ");
                 matriz[i][j] = scn.nextInt();
            }
        }
        scn.close();
        
        int determinante = matriz[0][0] * (matriz[1][1] * matriz[2][2] - matriz[1][2] * matriz[2][1])
                         - matriz[0][1] * (matriz[1][0] * matriz[2][2] - matriz[1][2] * matriz[2][0])
                         + matriz[0][2] * (matriz[1][0] * matriz[2][1] - matriz[1][1] * matriz[2][0]);
                        //det(A)=a(ei−fh)−b(di−fg)+c(dh−eg)

        System.out.println("O determinante da matriz é: " + determinante);

    }
    //Esse aq tive ajuda externa, não sou bom com matriz ;-;
}
