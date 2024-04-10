package br.edu.up.modelos;

public class Cardapio {

    //Relações tem um
    private Gerente gerente;
    private Prato[] pratos;
    private Bebida[] bebidadas;
    private Sobremesa[] sobremesas;
    
    public Cardapio() {
    }

    public Cardapio(Gerente gerente) {
        this.gerente = gerente;
    }

    public Cardapio(Prato[] pratos, Bebida[] bebidadas, Sobremesa[] sobremesas) {
        this.pratos = pratos;
        this.bebidadas = bebidadas;
        this.sobremesas = sobremesas;
    }

    public Cardapio(Gerente gerente, Prato[] pratos, Bebida[] bebidadas, Sobremesa[] sobremesas) {
        this.gerente = gerente;
        this.pratos = pratos;
        this.bebidadas = bebidadas;
        this.sobremesas = sobremesas;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }

    public Prato[] getPratos() {
        return pratos;
    }

    public void setPratos(Prato[] pratos) {
        this.pratos = pratos;
    }

    public Bebida[] getBebidadas() {
        return bebidadas;
    }

    public void setBebidadas(Bebida[] bebidadas) {
        this.bebidadas = bebidadas;
    }

    public Sobremesa[] getSobremesas() {
        return sobremesas;
    }

    public void setSobremesas(Sobremesa[] sobremesas) {
        this.sobremesas = sobremesas;
    }

    
    
}
