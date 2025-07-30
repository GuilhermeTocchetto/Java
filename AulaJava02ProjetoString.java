package aulajava02projetostring;

public class AulaJava02ProjetoString {

    public static void main(String[] args) {

        String nome, endereco;
        int tamanho1, tamanho2;
        
        nome = "Victor";
        endereco = "Rua martins";
                
        tamanho1 = nome.length();
        tamanho2 = endereco.length();
        
        System.out.println("seu nome tem " + tamanho1 + " caracteres e o seu endereco tem " +  tamanho2 + " caracteres.");

    }
    
}
