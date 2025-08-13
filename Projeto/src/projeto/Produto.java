
package projeto;

public class Produto {
    
    private int id;
    private String nome;
    private String Desc;

    //exibir os atributos no objeto =>getter
    
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDesc() {
        return Desc;
    }
    //insetir atributos no objeto =>setter
    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDesc(String Desc) {
        this.Desc = Desc;
    }
    
    
}
