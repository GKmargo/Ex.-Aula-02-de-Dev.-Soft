package br.edu.up.modelos;

public class Pedido {

    /**Relações TEM UM**/

    //Pedido tem um cliente
    private Cliente cliente;
    //Pedidoo tem um Cliente
    private Garcom garcom;
    //Pedido tem varios itens
    private Item[] itens;

    
    public Pedido() {
    }
    
    public Pedido(Cliente cliente) {
        this.cliente = cliente;
    }

    public Pedido(Cliente cliente, Garcom garcom) {
        this.cliente = cliente;
        this.garcom = garcom;
    }

    public Pedido(Cliente cliente, Garcom garcom, Item[] itens) {
        this.cliente = cliente;
        this.garcom = garcom;
        this.itens = itens;
    }

    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Garcom getGarcom() {
        return garcom;
    }
    public void setGarcom(Garcom garcom) {
        this.garcom = garcom;
    }
    public Item[] getItens() {
        return itens;
    }
    public void setItens(Item[] itens) {
        this.itens = itens;
    }
   
}
