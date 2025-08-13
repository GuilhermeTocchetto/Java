
package projeto;

public class Projeto {

    public static void main(String[] args) {
        
        Produto p;
        
        p = new Produto();
        
        p.setId(1); //inserindo a descricao 1 no Id com set
        p.setNome("João Victor");
        p.setDesc("Um humano muito legal");
        
        
        System.out.println("O Id: "+ p.getId()); //retirar a descrição com o get
        System.out.println("O Nome: "+ p.getNome());
        System.out.println("A desc: "+ p.getDesc());
    
        Produto p2 = new Produto();
        
        p2.setId(100);
        p2.setNome("Grabryel");
        p2.setDesc("muito gay");
        
        System.out.println("O Id: " + p2.getId());
        System.out.println("O nome: " + p2.getNome());
        System.out.println("A desc: " + p2.getDesc());
    }
    
}
