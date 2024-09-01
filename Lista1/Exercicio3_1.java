import java.util.Scanner;
import java.util.Arrays;

public class Exercicio3_1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] v_inteiros = new int[10];
        System.out.println("Digite 1 numero a ser adicionado ao vetor");
        v_inteiros[0] = scn.nextInt();
        for(int i=0;i<9;i++){
           v_inteiros[i+1] = v_inteiros[i]*2;
        }
        System.out.println("\n" + Arrays.toString(v_inteiros)); //nas outras imprimi com o for, 
        scn.close();                                            //pesquisei e vi que existia
    }                                                           //esse outro metodo        
}


