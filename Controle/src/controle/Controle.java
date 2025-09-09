package controle;
import java.util.Scanner;

public class Controle {

    public static void main(String[] args) {
        
        Scanner tc = new Scanner(System.in);
        
        int numero;
        double valor;
        String titulo;
        
        Documento[] doc = new Documento[5];
        
        for(int i = 0; i< doc.length; i++){
            
            System.out.println("Digite o numero: ");
            numero = tc.nextInt();
            tc.nextLine();
            
            System.out.println("Digite o titulo: ");
            titulo = tc.nextLine();
            
            System.out.println("Digite o valor:");
            valor = tc.nextDouble();
            
            doc[i] = new Documento(numero, valor, titulo);
        }
        
        double valorTotal = 0, media;
        
        int maior = 0, menor = 0;
        
        for(int i = 0; i<doc.length;i++ ){
            
            if(doc[i].getValor()< doc[i+1].getValor()){
                 maior = i;
            }
            if(doc[i].getValor()< doc[i+1].getValor()){
                 menor = i;
            }
             
        }
        for(int i = 0; i < doc.length; i++){
                valorTotal += doc[i].getValor();
    }
        
        media = valorTotal / doc.length;
        
        
        System.out.println("O maior valor informado foi: \t"+"Titulo: "+ doc[maior].getTitulo()+" Valor: "+ doc[maior].getValor());
        System.out.println("O menor valor informado foi: \t"+"Titulo: "+ doc[menor].getTitulo()+" Valor: "+ doc[menor].getValor());
        System.out.println("A soma de todos os valores informados é: " + valorTotal);
        System.out.println("A média de todos os valores informados é: " + media);
    }
    
}
