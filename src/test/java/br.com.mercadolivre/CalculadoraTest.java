package br.com.mercadolivre;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {
    @Test
    public void testeAdicao() {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.soma(2, 3);
        assertEquals(5, resultado);
    }
}
