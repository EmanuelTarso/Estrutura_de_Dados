import java.util.Scanner;
public class Aula1_Exercicio1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] v_i1 = new int[10];
        int[] v_i2 = new int[10];
        int[] v_i3 = new int[10];
        int num;
        int media;

        for(int i=0;i<10;i++){
            System.out.println("Digite 1 números a serem adicionados no vetor 1");
            num = scn.nextInt();
            v_i1[i] = num;
        }

        System.out.println("Digite 10 números a serem adicionados no vetor 2");
        for(int i=0;i<10;i++){
            System.out.println("Digite 1 números a serem adicionados no vetor 2");
            num = scn.nextInt();
            v_i2[i] = num;
        }

        for(int i=0;i<10;i++){
            media = (v_i1[i] + v_i2[i])/2;
            v_i3[i] = media;
        }
        for(int i=0;i<10;i++){
            System.out.print(v_i3[i] + " ");
        }
    }
}
