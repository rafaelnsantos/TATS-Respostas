package br.edu.utfpr.calculadora;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculadoraTest {

    @Test
    public void salarioDesenvolvedor5000(){
        Caclculadora c = new Calculadora();
        Funcionario f = new Funcionario(Cargo.DESENVOLVEDOR, 5000f);

        assertEquals(4000f, c.calcularSalarioLiquido(f), 0.1f);
    }
}