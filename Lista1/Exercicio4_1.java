import java.util.Scanner;
import java.util.Arrays;

public class Exercicio4_1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] v_inteiros = new int[100];
        System.out.println("Digite 1 numero a ser adicionado ao vetor");
        v_inteiros[0] = scn.nextInt();
        for(int i=0;i<99;i++){
           v_inteiros[i+1] = v_inteiros[i]/2;
        }
        System.out.println("\n" + Arrays.toString(v_inteiros));
        scn.close();
    }
}


