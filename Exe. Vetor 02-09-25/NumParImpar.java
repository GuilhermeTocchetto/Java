package numparimpar;
import java.util.Scanner;
public class NumParImpar {

    public static void main(String[] args) {
        
        Scanner tc = new Scanner(System.in);
        int pares = 0, ímpares = 0;
   
        System.out.println("\t\t...Contador de numero  par e ímpar...\n\n");
        System.out.println("Digite a quantidade do vetor que você deseja: ");
        int Quant = tc.nextInt();
        
        int [] numeros = new int [Quant];
        int [] par = new int [Quant];
        int [] impar = new int [Quant];

        for(int i = 0; i<numeros.length; i++){
            
            System.out.println("Digite o "+(i+1)+" número: ");
            numeros[i] = tc.nextInt();
            
            if(numeros [i] % 2 == 0){
                par[pares] = numeros[i];
                pares++;
            } else {
                impar[ímpares] = numeros[i];
                ímpares++;
            }
        }
        System.out.println("\n ..Números pares...\n");
        for(int i = 0; i<pares;i++){
            System.out.println("Valor: "+ par[i]+ ".Indice: "+ i);
        }
        System.out.println("\n ..Números impares...\n");
        for(int i = 0; i<ímpares; i++){
            System.out.println("Valor: "+ impar[i]+ ".Indice: "+ i);
 
        }
        
        //System.out.println("Quantidade de numero par: "+ pares);
        //System.out.println("Quantidade de numero ímpares: "+ ímpares);

    }
    
}
