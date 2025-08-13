
package calculadora;
import java.util.Scanner;
public class Calculadora {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        Calculo conta01 = new Calculo();
        
        System.out.println("Digite o numero01: ");
        conta01.setNumero1(teclado.nextDouble());
        
        System.out.println("Digote o numero02: ");
        conta01.setNumero2(teclado.nextDouble());
        
        System.out.println("Qual operador (+ - / *): ");
        conta01.setOperador(teclado.next());
        
        System.out.println("O resutado foi "+conta01.resultado());
        
        
        
        
        
    }
    
}
