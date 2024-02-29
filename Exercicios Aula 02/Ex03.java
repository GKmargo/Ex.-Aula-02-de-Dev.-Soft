import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Didite um número:");
        int num1 = leitor.nextInt();

        System.out.println("Digite um segundo número:");
        int num2 = leitor.nextInt();

        if(num1>num2){
            System.out.println("O primeiro número é maior que o segundo");
        } else{
            System.out.println("O segundo número é maior que o primeiro");
        }
    }
    
}
