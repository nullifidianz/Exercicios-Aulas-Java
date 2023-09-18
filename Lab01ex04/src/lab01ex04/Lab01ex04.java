/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab01ex04;

import java.util.Scanner;

/**
 *
 * @author jota
 */
public class Lab01ex04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um valor inteiro maior que um: ");
        int numero = teclado.nextInt();
        teclado.close();
        
        if(numero<=1){
            System.out.println("Numero invalido");
        } else{
            int div =0;
            
            for(int i =2; i<=numero;i++){
                if(numero%i==0){
                    div++;
                    break;
                }
            }
            
            if(div==0){
                System.out.println(numero + "eh primo");
            }else{
                System.out.println(numero + "nao eh primo");
            }
        
    }}}
    

