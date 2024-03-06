
import java.util.Scanner;

public class ExDeFixação01 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a matrícula do aluno:");
        int matricula = leitor.nextInt();

        System.out.println("Digite o nome do aluno:");
        String nome = leitor.next();

        System.out.println("Digite a primeira nota do aluno:");
        float nota1 = leitor.nextFloat();

        System.out.println("Digite a segunda nota do aluno:");
        float nota2 = leitor.nextFloat();

        float notaFinal = (nota1 + nota2) / 2;

        if (notaFinal >= 6){
            System.out.println("O alundo esta aprovado com a nota: " + notaFinal);
        } else {
            System.out.println("O alundo esta reprovado com a nota: " + notaFinal);
        }

    }
}