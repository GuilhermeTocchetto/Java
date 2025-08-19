
package com.mycompany.venda;

import java.util.Scanner;

public class Venda {

    public static void main(String[] args) {
    
        Scanner teclado = new Scanner(System.in);
        
        produto item1 = new produto();
        produto item2 = new produto();
        produto item3 = new produto(); 
        produto item4 = new produto();
        produto item5 = new produto();
        
        String descricao;
        double preco;
        int numero; 
        
        System.out.println("\nPorduto 1 \n");
        System.out.println("Digite a descricao do produto:");
        descricao = teclado.nextLine();
        item1.setDescricao(descricao);
        
        System.out.println("Digite o preco: ");
        preco = teclado.nextDouble();
        item1.setPreco(preco);
        teclado.nextLine();
        
        System.out.println("Digite o preco: ");
        numero = teclado.nextInt();
        item1.setNumero(numero);
        teclado.nextLine();
        
        System.out.println("\nPorduto 2 \n");
        System.out.println("Digite a descricao do produto:");
        descricao = teclado.nextLine();
        item2.setDescricao(descricao);
        
        System.out.println("Digite o preco: ");
        preco = teclado.nextDouble();
        item2.setPreco(preco);
        teclado.nextLine();
        
        System.out.println("Digite o preco: ");
        numero = teclado.nextInt();
        item2.setNumero(numero);
        teclado.nextLine();
        
        System.out.println("\nPorduto 3 \n");
        System.out.println("Digite a descricao do produto:");
        descricao = teclado.nextLine();
        item3.setDescricao(descricao);
        
        System.out.println("Digite o preco: ");
        preco = teclado.nextDouble();
        item3.setPreco(preco);
        teclado.nextLine();
        
        System.out.println("Digite o preco: ");
        numero = teclado.nextInt();
        item3.setNumero(numero);
        teclado.nextLine();
        
        System.out.println("\nPorduto 4 \n");
        System.out.println("Digite a descricao do produto:");
        descricao = teclado.nextLine();
        item4.setDescricao(descricao);
        
        System.out.println("Digite o preco: ");
        preco = teclado.nextDouble();
        item4.setPreco(preco);
        teclado.nextLine();
        
        System.out.println("Digite o preco: ");
        numero = teclado.nextInt();
        item4.setNumero(numero);
        teclado.nextLine();
        
        System.out.println("\nPorduto 5 \n");
        System.out.println("Digite a descricao do produto:");
        descricao = teclado.nextLine();
        item5.setDescricao(descricao);
        
        System.out.println("Digite o preco: ");
        preco = teclado.nextDouble();
        item5.setPreco(preco);
        teclado.nextLine();
        
        System.out.println("Digite o preco: ");
        numero = teclado.nextInt();
        item5.setNumero(numero);
        teclado.nextLine();
        
    }
}
