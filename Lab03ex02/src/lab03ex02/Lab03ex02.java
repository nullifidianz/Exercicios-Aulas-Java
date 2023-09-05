package lab03ex02;

public class Lab03ex02 {
    
    
    public static void main(String[] args) {
        Racional racional1 = new Racional(2, 3);
        Racional racional2 = new Racional(3, 4);

        Racional resultadoSoma = racional1.somar(racional2);
        Racional resultadoSubtracao = racional1.subtrair(racional2);
        Racional resultadoMultiplicacao = racional1.multiplicar(racional2);
        Racional resultadoDivisao = racional1.dividir(racional2);

        System.out.println("Soma: " + resultadoSoma.representacaoFracao());
        System.out.println("Subtração: " + resultadoSubtracao.representacaoFracao());
        System.out.println("Multiplicação: " + resultadoMultiplicacao.representacaoFracao());
        System.out.println("Divisão: " + resultadoDivisao.representacaoFracao());

        System.out.println("Decimal de racional1: " + racional1.representacaoDecimal());
        System.out.println("Decimal de racional2: " + racional2.representacaoDecimal());
    }
    }
   
