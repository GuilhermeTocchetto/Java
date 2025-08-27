package testararrayaluno;
import java.util.Scanner;
public class TestarArrayAluno {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        aluno[] turma = new aluno[1];
        
        for(int i = 0; i<turma.length; i++){
            turma[i] = new aluno();
            
            System.out.println("Digite o "+(i +1)+"° nome do aluno: ");
            turma[i].setNome(sc.nextLine());
            
            System.out.println("Digite a primeira nota: ");
            turma[i].setNota1(sc.nextDouble());   
            
            System.out.println("Digite a segunda nota: ");
            turma[i].setNota2(sc.nextDouble());
        }
        for (int i = 0; i<turma.length; i++){
        System.out.println("O nome do "+(i+1)+"° aluno é "+ turma[i].getNome()+ " e a média dele é "+ turma[i].calcularMedia());
        }
        
    }
    
}
