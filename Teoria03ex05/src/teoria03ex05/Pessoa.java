
package teoria03ex05;


/**
 *
 * @author jota
 */
public class Pessoa {
    private String nome;
    private String endereco;
    private double renda;
    private String data;
    private ContaComum cc;
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public void setRenda(Double renda){
        this.renda = renda;
    }
    public void setData(String data){
        this.data = data;
    }
    
    public String getNome(){
        return nome;
    }
    public String getEndereco(){
        return endereco;
    }
    public double getRenda(){
        return renda;
    }
    public String getData(){
        return data;
    }

    public Pessoa() {
    }

    public Pessoa(String nome, String endereco, double renda, String data, ContaComum cc) {
        this.nome = nome;
        this.endereco = endereco;
        this.renda = renda;
        this.data = data;
        this.cc = cc;
    }
    
    @Override
    
    public String toString() {
        return "Pessoa{" + "conta comum:" + cc + "nome=" + nome + ", endereco=" + endereco + ", renda=" + renda + ", data=" + data + '}';
    }
    
   
    
    
    
    
    
    
}
