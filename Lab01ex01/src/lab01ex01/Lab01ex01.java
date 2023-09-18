
package lab01ex01;

import java.util.Scanner;

/**
 *
 * @author jota
 */
public class Lab01ex01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite a Distância do robô:");
        
        double D = teclado.nextDouble();
        int pontos;
        
        if(D<=800){
            pontos = 1;
    } else if(D<=1400){
        pontos = 2;
    } else{
        pontos = 3;
    }
        System.out.println("Da distancia de:" + D + "a qtd de pontos eh:" + pontos);
        
    }
    
}
