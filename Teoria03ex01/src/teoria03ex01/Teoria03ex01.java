/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teoria03ex01;

/**
 *
 * @author jota
 */
public class Teoria03ex01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        Funcionario f2 = new Funcionario("Joao", "Dias", "H", 5000.00, 20,233232);
        Funcionario f3 = new Funcionario("Gustavo", "Dias", "H", 5000.00, 20, 111111);
        
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
    }
    
}
