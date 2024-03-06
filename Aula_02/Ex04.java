
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a sua idade:");
        int idade = leitor.nextInt();

        if (idade<=13){
            System.out.println("Você é Criança");
        } else if (idade < 18){
            System.out.println("Você é Adolecente");
        } else if(idade <=60){
            System.out.println("Você é Adulto");
        } else {
            System.out.println("Você é Idoso");
        }
       } 
}
