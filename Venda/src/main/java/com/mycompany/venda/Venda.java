
package com.mycompany.venda;

import java.util.Scanner;

public class Venda {

    public static void main(String[] args) {
    
        Scanner teclado = new Scanner(System.in);
        
        produto Produto1 = new produto();
        produto Produto2 = new produto();
        produto Produto3 = new produto(); 
        produto Produto4 = new produto();
        produto Produto5 = new produto();
        
        System.out.println("\nPorduto 1 \n");
        System.out.println("Digite a descricao do produto:");
        String descricao = teclado.nextLine();
        Produto1.setDescricao(descricao);
        
        System.out.println("Digite o preco: ");
        Double preco = teclado.nextDouble();
        Produto1.setPreco(preco);
        teclado.nextLine();
        
        System.out.println("Digite o preco: ");
        int numero = teclado.nextInt();
        Produto1.setNumero(numero);
        teclado.nextLine();
        
        System.out.println("\nPorduto 2 \n");
        System.out.println("Digite a descricao do produto:");
        descricao = teclado.nextLine();
        Produto2.setDescricao(descricao);
        
        System.out.println("Digite o preco: ");
        preco = teclado.nextDouble();
        Produto2.setPreco(preco);
        teclado.nextLine();
        
        System.out.println("Digite o preco: ");
        numero = teclado.nextInt();
        Produto2.setNumero(numero);
        teclado.nextLine();
        
        System.out.println("\nPorduto 3 \n");
        System.out.println("Digite a descricao do produto:");
        descricao = teclado.nextLine();
        Produto3.setDescricao(descricao);
        
        System.out.println("Digite o preco: ");
        preco = teclado.nextDouble();
        Produto3.setPreco(preco);
        teclado.nextLine();
        
        System.out.println("Digite o preco: ");
        numero = teclado.nextInt();
        Produto3.setNumero(numero);
        teclado.nextLine();
        
        System.out.println("\nPorduto 4 \n");
        System.out.println("Digite a descricao do produto:");
        descricao = teclado.nextLine();
        Produto4.setDescricao(descricao);
        
        System.out.println("Digite o preco: ");
        preco = teclado.nextDouble();
        Produto4.setPreco(preco);
        teclado.nextLine();
        
        System.out.println("Digite o preco: ");
        numero = teclado.nextInt();
        Produto4.setNumero(numero);
        teclado.nextLine();
        
        System.out.println("\nPorduto 5 \n");
        System.out.println("Digite a descricao do produto:");
        descricao = teclado.nextLine();
        Produto5.setDescricao(descricao);
        
        System.out.println("Digite o preco: ");
        preco = teclado.nextDouble();
        Produto5.setPreco(preco);
        teclado.nextLine();
        
        System.out.println("Digite o preco: ");
        numero = teclado.nextInt();
        Produto5.setNumero(numero);
        teclado.nextLine();
        
    }
}
