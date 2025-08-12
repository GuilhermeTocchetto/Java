package JavaAtividade02;
import java.util.Scanner;
public class JavaAtividade02 {
    public static void main(String[] args) {
        
        int tabuada, i, resultado;
        int acertos=0, erros=0;
                
        Scanner teclado;
        
        teclado = new Scanner(System.in);
        
        System.out.println("Digite um numero para tabuada");
        
        tabuada = teclado.nextInt();
        
        System.out.println("Digite o resultado da multiplicação");
        
        for(i=0; i<=10; i++){
            System.out.println(i + " X " + tabuada);
            Scanner res;
            res = new Scanner(System.in);
            resultado = res.nextInt();
            if(resultado==i*tabuada){
                acertos++;
            }
            else{
                erros++;
            }
        }
        
        System.out.println("Você obteve: " +acertos+ " acertos");
        System.out.println("Você obteve " +erros+ "erros");
    }
}