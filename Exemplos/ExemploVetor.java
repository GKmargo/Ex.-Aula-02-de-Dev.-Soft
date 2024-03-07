import java.util.Scanner;

public class ExemploVetor {

    public static void main(String[] args) {
        

        Scanner leitor = new Scanner(System.in);


        // Vetores e repetidores

        //declaração
        int[] vetor1; 
        //declaração e inicialização
        int[] vetor2 = new int[3]; 
        //declaração, inicialização e atribuição
        int[] vetor3 = new int[] {1, 5, 2}; 

        //inicialização
        vetor1 = new int[2];
        vetor1[0] = 45;
        vetor1[1] = 32;

        //atribuição de valores
        int contador = 0;
        do {
            System.out.println("Digite um valor: ");
            int vlr = leitor.nextInt();
            vetor2[contador] = vlr;
            contador++;
        } while (contador < 3);

        //recuperação de valor
        int vlrVetor2 = vetor2[1];
        int vlrVetor3 = vetor3[2];

        //impressão dos valores
        //System.out.println("Valor vetor 2: " + vlrVetor2);
        //System.out.println("Valor vetor 3: " + vlrVetor3);

        System.out.println("Impressão do vetor 1");
        for(int i = 0; i < vetor1.length; i++){
            String str = "Valor na pos " + (i + 1) + ": " + vetor1[i];
            System.out.println(str);
        }

        System.out.println("\nImpressão do vetor 2");
        contador = 0;
        while(contador < vetor2.length){
            String str = "Valor na pos " + (contador + 1) + ": " + vetor2[contador];
            System.out.println(str);
            contador++;
        }

        System.out.println("\nImpressão do vetor 3");
        for(int vlr : vetor3){
            System.out.println("Valor:" + vlr);
        }
      
        
        leitor.close();

    }

    public static void executarAula1(){
          //Tipos primitivos
          int a = 10;
          float b = 10.5f;
          double c = 10.5;
          boolean e = true;
          
          double x = a;
          int y = (int) c; //casting
          float z = b;
  
          //Estrutura de controle
          if(a >= 10){
              System.out.println("Faço alguma coisa...");
          } else if(b < 50) {
              System.out.println("Faz outra coisa...");
          } else {
              System.out.println("Faz ainda outra coisa...");
          }
  
          //Repetidores
          for(int i = 0; i < 100; i++){
              System.out.println("Valor: " + i);
          }
  
          boolean executar = true;
          int contador = 0;
          String[] letras = new String[]{"A", "B", "C"};
  
  
          while (executar && contador < letras.length) {
              String letra = letras[contador];
              System.out.println("Letra: " + letra);
              contador++;
          }
    }

}
