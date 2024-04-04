public class Programa {
    public static void main(String[] args){
       
        /** PROGRAMAÇÃO ESTRUTURADA **/
        
        //String modelo1 = "Mille";
        //String modelo2 = "California";

        String[] modelos = {"Mille" , "California"};
        double[] velocidades = {80, 300};

        String[] pessoas = {"Pedro", "James" , "Rafael"};
        double[] alturas = {175, 175, 180};

        /** PROGRAMAÇÃO ORIENTADA A OBJETO **/

        Carro uno = new Carro(Carro.Tipo.UNO, "Mille");
        //uno.modelo = "Mille";
        //uno.velocidade = 80;
        uno.acelerar();
        uno.acelerar();
        uno.acelerar();
        uno.acelerar();
        uno.acelerar();
        uno.acelerar();
        uno.acelerar();
        uno.acelerar();
        System.out.println("Velocidade do UNO: " + uno.getVelocidade());

        Carro ferrari = new Carro(Carro.Tipo.FERRARI);
        //ferrari.modelo = "California";
        ferrari.setModelo("California");
        //ferrari.velocidade = 300;
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        System.out.println("Velocidade da ferrari: " + ferrari.getVelocidade());


        Pessoa pedro = new Pessoa();
        pedro.nome = "Pedro";
        pedro.altura = 175;

        Pessoa james = new Pessoa();
        james.nome = "James";
        james.altura = 175;

        Pessoa rafael = new Pessoa();
        rafael.nome = "Rafael";
        rafael.altura = 180;
        

    }
}
