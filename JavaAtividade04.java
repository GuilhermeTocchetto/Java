package JavaAtividade04;

import java.util.Scanner;

public class JavaAtividade04 {
    public static void main(String[] args) {
        int dado, i, j, cont=0;
        
        Scanner num;
        System.out.println("Digite o numero que começaremos a resolver na ordem diminutiva");
        
        num = new Scanner(System.in);
        
        dado = num.nextInt();
        for(i=dado; i>0; i=i-1){
                if(i%2==0){
                    System.out.print(i+" Número é par  - ");
                }else{
                    System.out.print(i+" Número é impar  - ");
                }
                cont=0;
                for(j=i-1; j>1; j=j-1){
                    if(i%j==0){
                        
                    cont++;}
                    
                }
                if(cont==0){
                    System.out.println(" Número é primo");
                }else{
                System.out.println(" Número não é primo");}
        }
    }  
}
