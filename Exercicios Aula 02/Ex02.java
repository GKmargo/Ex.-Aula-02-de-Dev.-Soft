import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args){
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite quantos reais voce tem:");
        float reais = leitor.nextFloat();

        float dolar = reais / 5.17f;
        float euro = reais / 6.14f;
        float peso = reais / 0.05f;

        System.out.println("Real em dolar:" + dolar);
        System.out.println("Real em euro:" + euro);
        System.out.println("Real em peso:" + peso);
    }
}
