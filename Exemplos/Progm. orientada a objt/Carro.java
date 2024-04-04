public class Carro extends Veiculo {
    
    //enum é usado para definir algo
    public static enum Tipo{
        FERRARI,
        UNO
    }

    /** Atributos, Caractéristicas ou propriedades - Sempre privadas **/
    private Tipo tipo;
    private String modelo;
    private double velocidade = 0;

    public double getVelocidade(){
        return this.velocidade;
    }

    public String getModelo(){
        return this.modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public Carro(){
    }

    public Carro(Tipo tipo){
        this.tipo = tipo;
    }

    public Carro(Tipo tipo, String modelo){
        this.tipo = tipo;
        this.modelo = modelo;
    }

    public void acelerar(){
        if (tipo.equals(Tipo.UNO) && this.velocidade <= 150){
            this.velocidade++;
        } else if (tipo.equals(Tipo.FERRARI) && this.velocidade <= 300){
            this.velocidade ++;
        }
    }

    public void freiar(){
        if (this.velocidade >= 0){
            this.velocidade--;
        }
    }

}
