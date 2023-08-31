/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab03ex2;

/**
 *
 * @author jota
 */
public class Lab03ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Racional racional1 = new Racional(2, 4);
        Racional racional2 = new Racional(3, 5);
        
        Racional soma = racional1.somar(racional2);
        Racional subtracao = racional1.subtrair(racional2);
        Racional multiplicacao = racional1.multiplicar(racional2);
        Racional divisao = racional1.dividir(racional2);
        
        System.out.println("Racional 1: " + racional1.representacaoFracao() + " | Decimal: " + racional1.representacaoDecimal());
        System.out.println("Racional 2: " + racional2.representacaoFracao() + " | Decimal: " + racional2.representacaoDecimal());
        System.out.println("Soma: " + soma.representacaoFracao() + " | Decimal: " + soma.representacaoDecimal());
        System.out.println("Subtracao: " + subtracao.representacaoFracao() + " | Decimal: " + subtracao.representacaoDecimal());
        System.out.println("Multiplicacao: " + multiplicacao.representacaoFracao() + " | Decimal: " + multiplicacao.representacaoDecimal());
        System.out.println("Divisao: " + divisao.representacaoFracao() + " | Decimal: " + divisao.representacaoDecimal());

    }
    
}
