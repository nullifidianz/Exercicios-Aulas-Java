package teoria01ex2;

import java.util.Scanner;


public class Teoria01ex2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Swapper troca = new Swapper();
        
        System.out.println("Digite o valor de x: ");
        float valorX = teclado.nextFloat();
        troca.setX(valorX);
        
        System.out.println("Digite o valor de y: ");
        float valorY = teclado.nextFloat();
        troca.setY(valorY);
        
        troca.swap();
        
        System.out.println("Valor atual de X:" + troca.getX() + "\nValor atual de Y:" + troca.getY());
    }
    
}
