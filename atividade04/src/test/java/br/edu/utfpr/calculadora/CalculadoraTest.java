package br.edu.utfpr.calculadora;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculadoraTest {

    Funcionario funcionario;

    Calculadora calculadora;

    public CalculadoraTest(){
        calculadora = new Calculadora();
    }

    @Before
    public void setUp(){
        funcionario = new Funcionario();
    }

    @Test
    public void calcularSalarioLiquidoDesenvolvedorBruto5000() {
        funcionario.setCargo(Cargo.DESENVOLVEDOR);
        funcionario.setSalarioBase(5000f);
        assertEquals(4000f, calculadora.calcularSalarioLiquido(funcionario), 0.1f);
    }

    @Test
    public void calcularSalarioLiquidoGerenteBruto2500() {
        funcionario.setCargo(Cargo.GERENTE);
        funcionario.setSalarioBase(2500f);
        assertEquals(2000f, calculadora.calcularSalarioLiquido(funcionario), 0.1f);
    }


    @Test
    public void calcularSalarioLiquidoTestadorBruto550() {
        funcionario.setCargo(Cargo.TESTADOR);
        funcionario.setSalarioBase(550f);
        assertEquals(467.5f, calculadora.calcularSalarioLiquido(funcionario), 0.1f);
    }
}