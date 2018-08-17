package br.edu.utfpr.calculadora;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculadoraTest {

    @Test
    public void salarioDesenvolvedorMaior3000(){
        Calculadora c = new Calculadora();
        Funcionario f = new Funcionario(Cargo.DESENVOLVEDOR, 5000f);

        assertEquals(4000f, c.calcularSalarioLiquido(f), 0.1f);
    }

    @Test
    public void salarioDesenvolvedorMenor3000(){
        Calculadora c = new Calculadora();
        Funcionario f = new Funcionario(Cargo.DESENVOLVEDOR, 1000f);

        assertEquals(900f, c.calcularSalarioLiquido(f), 0.1f);
    }
}