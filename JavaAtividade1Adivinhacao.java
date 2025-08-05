
package javaatividade1.adivinhacao;
import java.util.Scanner;
public class JavaAtividade1Adivinhacao {

    public static void main(String[] args) {
     int segredo, numero, tentativas = 0;
     Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor que seja: ");
        segredo = teclado.nextInt();
        do{
            System.out.println("Digite o segredo: ");
            numero = teclado.nextInt();
            tentativas++;
            
        }while(segredo!=numero);{
    }
        System.out.println("O numero secreto é "+ segredo + " e seu numero de tentativas é " + tentativas);
    }
    
}
