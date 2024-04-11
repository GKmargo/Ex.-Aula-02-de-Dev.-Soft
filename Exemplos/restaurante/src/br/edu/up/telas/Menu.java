package br.edu.up.telas;
import java.util.Scanner;
public class Menu {

    Scanner ler = new Scanner(System.in);

    public void mostrar(){

        System.out.println("Menu Pricipal");
        System.out.println("-----------------");

        System.out.println("Selecione uma das Opções:"); 
        System.out.println("--------------------------");
        System.out.println("1. Cadastrar Funcionário");
        System.out.println("...");
        System.out.println("5. Registrar pedido");
        
        int opcao = ler.nextInt();

        switch (opcao) {
            case 1:
                mostrarMenuFuncionario();
                break;
            case 2:

                break;   
            default:
                break;
        }

    }

    public void mostrarMenuFuncionario(){
        System.out.println("Menu Funcionario");
        System.out.println("-----------------");

        System.out.println("Selecione uma das Opções:"); 
        System.out.println("--------------------------");
        System.out.println("1. Listar");
        System.out.println("...");
        System.out.println("5. Registrar pedido");
    }

}
