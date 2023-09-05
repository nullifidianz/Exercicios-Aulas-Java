/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teoria03ex02;

/**
 *
 * @author jota
 */
public class TestaCarro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Carro carroTeste = new Carro();
        Carro civicPreto = new Carro("civic", "preto", 2003);
        Carro audiA3 = new Carro("Audi A3", "prata", 2001, 153000, 15.000);
        
        System.out.println("carro teste:" + carroTeste);
        System.out.println("carro teste:" + civicPreto);
        System.out.println("carro teste:" + audiA3);
        
        
    }
    
}
