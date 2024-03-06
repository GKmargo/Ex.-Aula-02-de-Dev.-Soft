package Exemplos;
import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        int[] vetor1 = new int[6];
        int[] vetor2 = new int[3];
        int[] vetor3 = new int[]{1,5,3};

        System.out.println("Impressão do vetor 1:");
        for(int i = 0 ; i < vetor1.length; i ++){
            String str = "Valor na posição" + (i+1) + ":" + vetor1[i];
            System.out.println(str);
        }

        System.out.println("Impressão do vetor 2:");
        int contador = 0;
        while(contador < vetor2.length){
            String str = "Valor na posição" + (contador + 1) + ":" + vetor2[contador];
            System.out.println(str);
            contador++;
        }

        System.out.println("Impressão do vetor 3:");
        for(int vlr : vetor3){
            System.out.println("Valor:" + vlr);
        }

        leitor.close();
    }
}