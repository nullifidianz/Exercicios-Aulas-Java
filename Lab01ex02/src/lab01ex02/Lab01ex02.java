/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab01ex02;

import java.util.Scanner;

/**
 *
 * @author jota
 */
public class Lab01ex02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int N;
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.println("Digite o valor de N inteiro e positivo:");
            N = teclado.nextInt();
        }
        
        float E;
        
        if(N>0){
            for(int i=1; i<=N; i++){
                E = 1/N;
                
                System.out.println("E = " + E);
            }
        }else{
            System.out.println("O valor de N eh invalido!");
        }
        
        
        
    }
    
}
