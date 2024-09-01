import java.util.Scanner;

public class Exercicio1_1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] v_inteiros = new int[10];
        for(int i=0;i<10;i++){
            System.out.println("Digite 1 numero a ser adicionados ao vetor");
            v_inteiros[i] = scn.nextInt();
        }
        System.out.println("Os números pares adicionados ao vetor são:");
        for(int i=0;i<10;i++){
            if(v_inteiros[i]%2==0){ 
                System.out.print(v_inteiros[i] + " ");
            }
        }
        System.out.println("\nOs números impares adicionados ao vetor são:");
        for(int i=0;i<10;i++){
            if(v_inteiros[i]%2!=0){
                System.out.print(v_inteiros[i] + " ");
            }
        }
        scn.close();
    }                               // Dava pra fazer com um for só, mas não quis tentar
}