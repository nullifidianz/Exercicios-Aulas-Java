/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teoria05ex01;

/**
 *
 * @author jota
 */
public class Aluno extends Pessoa {
    private String Curso;

    public Aluno() {
    }

    public Aluno(String Curso) {
        this.Curso = Curso;
    }

    public Aluno(String Curso, String nome, String sobrenome, int idade) {
        super(nome, sobrenome, idade);
        this.Curso = Curso;
    }

    public Aluno(String nome, String sobrenome, int idade) {
        super(nome, sobrenome, idade);
    }
    
    
    

    public String getCurso() {
        return Curso;
    }
    
    public void print(){
        System.out.println("Nome:" + getNome());
        System.out.println("Sobrenome:" + getSobrenome());
        System.out.println("Idade:" + getIdade());
        System.out.println("Curso:" + getCurso());
        System.out.println();
    }

    @Override
    public String toString() {
        return "Aluno{" + "Curso=" + Curso + '}';
    }
    
    
}
