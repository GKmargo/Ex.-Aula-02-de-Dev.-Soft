public class Texto{
    public static void main(String[] args){
        String texto1 = "200";
        String texto2 = "450";

        System.out.println("Texto concatenado: " + (texto1 + texto2));

        Integer valor1 = Integer.parseInt(texto1);
        int valor2 = Integer.parseInt(texto2);

        int resultado = valor1 + valor2;
        System.out.println("Valor: " + resultado);

        String sterVrl1 = valor1.toString();
        String txtResultado = String.valueOf(resultado);

    }
}