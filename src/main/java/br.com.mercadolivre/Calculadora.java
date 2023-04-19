package br.com.mercadolivre;

public class Calculadora {

    public double soma(double a, double b) {
        return a + b;
    }


    public double subtracao(double a, double b) {
        return a - b;
    }

    public double divisao(double a, double b) {
        if (b == 0){
        throw new RuntimeException();
        }
        return a/b;
    }

    public double multiplicacao(double a, double b) {
        return a * b;
    }

    public double restoDaDivisao(double a, double b) {
        return a % b;
    }

    public double stringParaCalculo(String expressao) {
        double a = 2;
        double b = 3;
        expressao.substring(0, 1);
        return a + b;
    }
}
