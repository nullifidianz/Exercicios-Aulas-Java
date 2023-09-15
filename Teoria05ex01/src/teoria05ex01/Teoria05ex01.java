/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teoria05ex01;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author jota
 */
public class Teoria05ex01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Aluno> alunos = new ArrayList<>();
        
        alunos.add(new Aluno());
        
        System.out.println("Digite o nome:");
        String nome = teclado.nextLine();
        
        System.out.println("Digite o sobrenome:");
        String sobrenome = teclado.nextLine();
        
        System.out.println("Digite a idade:");
        int idade = teclado.nextInt();
        
        System.out.println("Digite o curso:");
        String curso = teclado.nextLine();   
        
        alunos.add(new Aluno(curso, nome, sobrenome, idade));
        
        for(Aluno aluno: alunos){
            aluno.print();
        }
        teclado.close();
    }
    
}
