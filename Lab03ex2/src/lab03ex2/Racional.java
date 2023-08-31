
package lab03ex2;


public class Racional {
    
    private int numerador;
    private int denominador;
    
    public Racional() {
        this(0, 1);
    }
    
    public Racional(int numerador, int denominador) {
        if (denominador == 0) {
            throw new IllegalArgumentException("Denominador não pode ser zero.");
        }
        
        int gcd = gcd(numerador, denominador);
        this.numerador = numerador / gcd;
        this.denominador = denominador / gcd;
    }
    
    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
    
    public Racional somar(Racional outro) {
        int novoNumerador = this.numerador * outro.denominador + outro.numerador * this.denominador;
        int novoDenominador = this.denominador * outro.denominador;
        return new Racional(novoNumerador, novoDenominador);
    }
    
    public Racional subtrair(Racional outro) {
        int novoNumerador = this.numerador * outro.denominador - outro.numerador * this.denominador;
        int novoDenominador = this.denominador * outro.denominador;
        return new Racional(novoNumerador, novoDenominador);
    }
    
    public Racional multiplicar(Racional outro) {
        int novoNumerador = this.numerador * outro.numerador;
        int novoDenominador = this.denominador * outro.denominador;
        return new Racional(novoNumerador, novoDenominador);
    }
    
    public Racional dividir(Racional outro) {
        int novoNumerador = this.numerador * outro.denominador;
        int novoDenominador = this.denominador * outro.numerador;
        return new Racional(novoNumerador, novoDenominador);
    }
    
    public String representacaoFracao() {
        return numerador + "/" + denominador;
    }
    
    public double representacaoDecimal() {
        return (double) numerador / denominador;
    }
    
}
