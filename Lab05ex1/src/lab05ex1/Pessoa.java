/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab05ex1;


/**
 *
 * @author jota
 */
public class Pessoa {
    
    private String nome;
    private long cpf;
    private Data nascimento;

    public Pessoa() {
    }

    public Pessoa(String nome, long cpf, Data nascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.nascimento = nascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public Data getNascimento() {
        return nascimento;
    }

    public void setNascimento(Data nascimento) {
        this.nascimento = nascimento;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", cpf=" + cpf + ", nascimento=" + 
                nascimento + '}';
    }
    
    
    
}
