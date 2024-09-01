import java.util.Scanner;

public class Exercicio5_1 {
    public static void main(String[] args) {
        int numero;
        Scanner scn = new Scanner(System.in);
        int[] v_Fibonacci = new int[92]; // Pesquisei e vi que o limite seria o número 93 de Fibonacci, o ultimo a respeitar a condição dos 64 bits
        v_Fibonacci[0] = 1;
        v_Fibonacci[1] = 1;
        System.out.println("Digite o número a ser convertido em Fibonacci");     
        numero = scn.nextInt();
        if (numero<93) {
            for(int i=0;i<90;i++){
                v_Fibonacci[i+2] = v_Fibonacci[i+1] + v_Fibonacci[i];
            }
        }
        else{
            System.out.println("O numero digitado excede 64 bits, o valor máximo é 92");
            scn.close();
            return;
        }
        System.out.println("O numero " + numero + " em Fibonacci é " + v_Fibonacci[numero-1]);
        scn.close();
    }

}

// Não sei por qual motivo, mas a partir do numero "49" o programa começa a dar erro, imprime os numeros com "-"