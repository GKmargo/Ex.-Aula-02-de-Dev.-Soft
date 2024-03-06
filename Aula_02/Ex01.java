
import java.util.Scanner;

public class Ex01{
public static void main(String[] args){
    Scanner leitor = new Scanner(System.in);

    System.out.println("Digite a altura do retangulo:");
    float altura = leitor.nextFloat();

    System.out.println("Digite a base do retangulo");
    float base = leitor.nextFloat();

    float area = altura * base;
    System.out.println("A area do retangulo: " + area);

}
}