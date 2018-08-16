package main;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.List;

public class CalculadoraTest {

    Calculadora c;

    public CalculadoraTest() {
        c = new Calculadora();
    }

    @Test
    public void testeLimite1000() {
        List<Proposta> propostas = c.calcular(500f, 800.00f);
        assertEquals(2, propostas.size());

        Proposta p1 = propostas.get(0);
        assertEquals(1600f, p1.getTotal(), 0.01f);
        assertEquals(2, p1.getNumeroParcelas());
        assertEquals(800f, p1.getValorParcela(), 0.01f);

        Proposta p2 = propostas.get(1);
        assertEquals(1600f, p2.getTotal(), 0.01f);
        assertEquals(3, p2.getNumeroParcelas());
        assertEquals(533.33f, p2.getValorParcela(), 0.01f);
    }

    @Test
    public void testeLimite5000() {
        List<Proposta> propostas = c.calcular(2000f, 1800.00f);
        assertEquals(3, propostas.size());

        Proposta p1 = propostas.get(0);
        assertEquals(2340f, p1.getTotal(), 0.01f);
        assertEquals(2, p1.getNumeroParcelas());
        assertEquals(1170f, p1.getValorParcela(), 0.01f);

        Proposta p2 = propostas.get(1);
        assertEquals(2700f, p2.getTotal(), 0.01f);
        assertEquals(4, p2.getNumeroParcelas());
        assertEquals(675f, p2.getValorParcela(), 0.01f);

        Proposta p3 = propostas.get(2);
        assertEquals(2700f, p3.getTotal(), 0.01f);
        assertEquals(10, p3.getNumeroParcelas());
        assertEquals(270, p3.getValorParcela(), 0.01f);
    }

    @Test
    public void testeAcima5000() {
        List<Proposta> propostas = c.calcular(10000f, 5500.00f);
        assertEquals(4, propostas.size());

        Proposta p1 = propostas.get(0);
        assertEquals(6050, p1.getTotal(), 0.01f);
        assertEquals(2, p1.getNumeroParcelas());
        assertEquals(3025f, p1.getValorParcela(), 0.01f);

        Proposta p2 = propostas.get(1);
        assertEquals(7150f, p2.getTotal(), 0.01f);
        assertEquals(4, p2.getNumeroParcelas());
        assertEquals(1787.5f, p2.getValorParcela(), 0.01f);

        Proposta p3 = propostas.get(2);
        assertEquals(7150, p3.getTotal(), 0.01f);
        assertEquals(10, p3.getNumeroParcelas());
        assertEquals(715f, p3.getValorParcela(), 0.01f);

        Proposta p4 = propostas.get(3);
        assertEquals(7700f, p4.getTotal(), 0.01f);
        assertEquals(20, p4.getNumeroParcelas());
        assertEquals(385f, p4.getValorParcela(), 0.01f);
    }

}