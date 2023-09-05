package lab03ex02;

import java.text.DecimalFormat;


/**
 *
 * @author jota
 */
public class Racional {
    private int numerador;
    private int denominador;

    public Racional(int numerador, int denominador) {
        if (denominador == 0) {
            throw new IllegalArgumentException("O denominador não pode ser zero");
        }

        int divisorComum = gcd(numerador, denominador);
        this.numerador = numerador / divisorComum;
        this.denominador = denominador / divisorComum;
    }

    public Racional somar(Racional outro) {
        return new Racional(
            this.numerador * outro.denominador + outro.numerador * this.denominador,
            this.denominador * outro.denominador
        );
    }

    public Racional subtrair(Racional outro) {
        return new Racional(
            this.numerador * outro.denominador - outro.numerador * this.denominador,
            this.denominador * outro.denominador
        );
    }

    public Racional multiplicar(Racional outro) {
        return new Racional(
            this.numerador * outro.numerador,
            this.denominador * outro.denominador
        );
    }

    public Racional dividir(Racional outro) {
        return new Racional(
            this.numerador * outro.denominador,
            this.denominador * outro.numerador
        );
    }

    public String representacaoFracao() {
        return numerador + "/" + denominador;
    }

    public String representacaoDecimal() {
        double valorDecimal = (double) numerador / denominador;
        return new DecimalFormat("#.###").format(valorDecimal);
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
