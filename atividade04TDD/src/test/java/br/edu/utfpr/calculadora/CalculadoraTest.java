package br.edu.utfpr.calculadora;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculadoraTest {

    Calculadora c;
    Funcionario f;

    public CalculadoraTest(){
        c = new Calculadora();
    }

    @Test
    public void salarioDesenvolvedorMaior3000(){
        f = new Funcionario(Cargo.DESENVOLVEDOR, 5000f);

        assertEquals(4000f, c.calcularSalarioLiquido(f), 0.1f);
    }

    @Test
    public void salarioDesenvolvedorMenor3000(){
        f = new Funcionario(Cargo.DESENVOLVEDOR, 1000f);

        assertEquals(900f, c.calcularSalarioLiquido(f), 0.1f);
    }

    @Test
    public void salarioDBAMaior2000(){
        f = new Funcionario(Cargo.DBA, 10000f);

        assertEquals(7500f, c.calcularSalarioLiquido(f), 0.1f);
    }

    @Test
    public void salarioDBAMenor2000(){
        f = new Funcionario(Cargo.DBA, 1000f);

        assertEquals(850f, c.calcularSalarioLiquido(f), 0.1f);
    }

    @Test
    public void salarioTestadorMaior2000(){
        f = new Funcionario(Cargo.TESTADOR, 10000f);

        assertEquals(7500f, c.calcularSalarioLiquido(f), 0.1f);
    }

    @Test
    public void salarioTestadorMenor2000(){
        f = new Funcionario(Cargo.TESTADOR, 1000f);

        assertEquals(850f, c.calcularSalarioLiquido(f), 0.1f);
    }
}