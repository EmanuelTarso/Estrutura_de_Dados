import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] v_inteiros = new int[10];
        float media = 0;

        for(int i=0;i<10;i++){
            System.out.println("Digite 1 numero a ser adicionados ao vetor");
            v_inteiros[i] = scn.nextInt();
        }

        for(int i=0;i<10;i++){
            media+= (v_inteiros[i]*i);
        }
        System.out.println("A média dos valores armazenados no vetor ponderados pelos índices nos quais estão armazenados é:" + media/v_inteiros.length);
    }
}