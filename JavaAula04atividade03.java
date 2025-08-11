
package javaaula04atividade03;
import java.util.Scanner;

public class JavaAula04atividade03 {

    public static void main(String[] args) {

        int numero, leituras;

        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite a quantide de valores que deseja conferir: ");
        leituras = teclado.nextInt();
        
        System.out.println("Digite o 1º numero: ");
        numero = teclado.nextInt();
        
        
        int maior = numero;
        int menor = numero;
        
        
        for(int x = 2; x<=leituras; x++){
        
        System.out.println("Digite o " + x +"º numero: ");
        numero = teclado.nextInt();
        
            if(maior < numero){
                maior = numero;

            } else if(menor > numero){
                menor = numero;
            }
        
        }
        
        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: "+ menor);
        
            
        
    }
    
}
