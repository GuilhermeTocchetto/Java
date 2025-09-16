
package loja;
import java.util.Scanner;
public class Loja {

    public static void main(String[] args) {
        
        Scanner tc = new Scanner(System.in);
        int codigo, registro;
        String descricao;
        double valor;
        double quantidade;
        
        
        
        System.out.println("Quantos registro você deseja criar: ");
        registro = tc.nextInt();
        tc.nextLine();
        
        Vendas[] notas = new Vendas[registro];
        //o vetor tem que ser o msm nome da classe
        for(int i = 0;i<notas.length;i++){
            
            System.out.println("Digite o código do "+(i+1)+"produto: ");
            codigo = tc.nextInt();
            tc.nextLine();
            
            System.out.println("Escreva a descrição do "+(i+1)+"produto: ");
            descricao = tc.nextLine();
            
            System.out.println("Digite o valor do "+(i+1)+"produto: ");
            valor = tc.nextDouble();
            
            System.out.println("Digite a quantidade do "+(i+1)+"produto: ");
            quantidade = tc.nextDouble();
            
            notas[i] = new Vendas(codigo,descricao,valor,quantidade);
            
            
        }
        
        double somaValor = 0, somaQuantidade = 0,mediaValor =0, mediaQuantidade = 0;
        
        int maiorValor = 0, menorQuantidade = 0;
        
        for(int i = 0; i<notas.length;i++){
            
           somaValor += notas[i].getValor();
           
           somaQuantidade += notas[i].getQuantidade();
           
           
           if(notas[i].getValor()<notas[maiorValor].getValor()){
               maiorValor = i;
           }
           if(notas[i].getQuantidade()<notas[menorQuantidade].getValor()){
               menorQuantidade = i;
           }
           
        }
        
        mediaValor = somaValor/notas.length;
        mediaQuantidade = somaQuantidade/notas.length;
        
        System.out.println("A media do valor: "+mediaValor);
        System.out.println("A media da quanridade: "+mediaQuantidade);
        System.out.println("O codigo do maior valor: "+ notas[maiorValor].getCodigo());
        System.out.println("A descrição da menor quantidade: "+ notas[menorQuantidade].getDescricao());
    }    
}
