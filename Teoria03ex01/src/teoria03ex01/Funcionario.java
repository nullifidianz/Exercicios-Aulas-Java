
package teoria03ex01;

public class Funcionario {
    
    private String nome, sobrenome, sexo;
    private double salario;
    private int idade, numero;
    
    public Funcionario(){
        
    }
    
    public Funcionario(String nome, String sobrenome, String sexo, double salario, int idade, int numero){
        setNome(nome);
        setSobrenome(sobrenome);
        setSexo(sexo);
        setSalario(salario);
        setIdade(idade);
        setNumero(numero);
        
    }
    
    @Override
    
    public String toString(){
     return "Funcionario(" + "nome=" + nome + ", sobrenome=" + sobrenome + ", salario=" 
             + salario + ", idade=" + idade + ", numero=" + numero +']';
             
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getSobrenome(){
        return sobrenome;
    }
    
    public String getSexo(){
        return sexo;
    }
    
    public double getSalario(){
        return salario;
    }
    
    public int getIdade(){
        return idade;
    }
    
    public int getNumero(){
        return numero;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
        }
    
    public void setSexo(String sexo){
        this.sexo = sexo;
        
    }
    
    public void setSalario(double salario){
        this.salario = salario;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    public void setNumero(int numero){
        this.numero = numero;
    }
}
