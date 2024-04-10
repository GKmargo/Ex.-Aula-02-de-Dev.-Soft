package br.edu.up.modelos;

//Sobremesa é um item
public class Sobremesa extends Item{

    //Relações tem um
    private Ingrediente[] ingrediente;

    public Sobremesa() {
    }

    public Sobremesa(Ingrediente[] ingrediente) {
        this.ingrediente = ingrediente;
    }

    public Ingrediente[] getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(Ingrediente[] ingrediente) {
        this.ingrediente = ingrediente;
    }

}
