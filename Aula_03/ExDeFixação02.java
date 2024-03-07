
import java.util.Scanner;

public class ExDeFixação02 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        
        int[] matricula = new int[5];

        String[] nome = new String[5];

        float[] nota1 = new float[5];

        float[] nota2 = new float[5];

        float[] notaFinal =  new float[5];

        int a = 1;
        for (int i = 0; i < 5; i++){

            System.out.println("Digite a matrícula do aluno " + a + ":");
            
            matricula[i] = leitor.nextInt();

            System.out.println("Digite o nome do aluno " + a + ":");
            
            nome[i] = leitor.next();

            System.out.println("Digite a primeira nota do aluno "+ a + ":");
            
            nota1[i] = leitor.nextFloat();

            System.out.println("Digite a segunda nota do aluno "+ a + ":");
            
            nota2[i] = leitor.nextFloat();

            notaFinal[i] = (nota1[i] + nota2[i]) / 2;
            a++;
        }
        for(int i = 0; i < 5 ; i++){
            if (notaFinal[i] >= 6){
                System.out.printf("\nO aluno " + nome[i] + " esta aprovado com a nota: " + notaFinal[i]);
            } else {
                System.out.println("\nO aluno " + nome[i] + " esta reprovado com a nota: " + notaFinal[i]);
            }
        }
    }
    
}
