/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab01ex05;

import java.util.Scanner;

/**
 *
 * @author jota
 */
public class Lab01ex05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o tamanho do lado desejado entre 1 a 20 "
                + "unidades");
        int tamanho = teclado.nextInt();
        teclado.close();
        
        if(tamanho < 1 || tamanho > 20){
            System.out.println("tamanho invalido!");
        } else{
            for(int i=1; i<=tamanho;i++){
                for(int j=1;j<=tamanho;j++){
                    if(i==1 || i==tamanho || j==1 || j==tamanho){
                        System.out.println("*");
                    }else{
                        System.out.println("");
                    }
                }
                System.out.println();
            }
            
        }
    }
    
}
