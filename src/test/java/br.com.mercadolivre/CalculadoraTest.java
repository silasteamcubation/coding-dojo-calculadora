package br.com.mercadolivre;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculadoraTest {

    @Test
    public void testeAdicao() {

        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.soma(2,3);
        assertEquals(5, resultado);
    }

    @Test
    public void testeSubtracao() {

        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.subtracao(2,3);
        assertEquals(-1, resultado);
    }

    @Test
    public void testeDivisao() {

        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.divisao(6,2);
        assertEquals(3, resultado);

    }

    @Test
    public void testeDivisaoPorZero() {

        Calculadora calculadora = new Calculadora();
        assertThrows(RuntimeException.class,() -> calculadora.divisao(6,0));


    }

    @Test
    public void testeMultiplicacao() {

        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.multiplicacao(6, 2);
        assertEquals(12, resultado);
    }

}
