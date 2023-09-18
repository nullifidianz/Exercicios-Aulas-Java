/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab01ex03;

import java.util.Scanner;

/**
 *
 * @author jota
 */
public class Lab01ex03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x;
        int y;
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.println("Digite um valor incial (X): ");
            x = teclado.nextInt();
            System.out.println("Digite um valor final (Y): ");
            y = teclado.nextInt();
        }
        
        int soma = 0;
        
        for(int i =x; i<=y; i++){
            if(i%3==0){
                
                soma += i;
                
            }
        }
        System.out.println("A soma dos multiplos de 3 entre:" + x + "e " + y + "eh " + soma);
    }
    
    
    
}
