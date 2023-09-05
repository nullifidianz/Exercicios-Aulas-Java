/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teoria03ex05;

/**
 *
 * @author jota
 */
public class Teoria03ex05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ContaComum c1 = new ContaComum(25, 1111, "20/05/23", "20/05/33", 15.000);
        Pessoa p1 = new Pessoa("João", "Rua 01", 153.000, "25/08/23", c1);
        
        System.out.println(p1);
        System.out.println(c1);
        
    }
    
}
