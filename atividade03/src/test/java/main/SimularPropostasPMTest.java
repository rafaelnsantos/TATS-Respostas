package main;

import org.junit.Test;

import static org.junit.Assert.*;

public class SimularPropostasPMTest {

    @Test
    public void testeSoIdadeVazia() {
        SimularPropostasPM pm = new SimularPropostasPM();
        pm.setNome("asdasd");
        pm.setSalario(11110f);
        pm.setIdade(0);
        pm.setValorDoEmprestimo(1000f);
        assertNull(pm.pressionarBotaoElaborar());
        assertEquals("idade vazia\n", pm.getMsgDeErro());
    }

    @Test
    public void testeDadosCorretos() {
        SimularPropostasPM pm = new SimularPropostasPM();
        pm.setNome("Joao da Silva");
        pm.setSalario(800f);
        pm.setIdade(25);
        pm.setValorDoEmprestimo(1000f);
        MostrarPropostasPM mostrarPM = pm.pressionarBotaoElaborar();
        assert(pm.getMsgDeErro().isEmpty());

        assertEquals(2, mostrarPM.getPropostas().size());
    }

    @Test
    public void testeTodosCamposVazios() {
        SimularPropostasPM pm = new SimularPropostasPM();
        pm.setNome("");
        pm.setSalario(0f);
        pm.setIdade(0);
        pm.setValorDoEmprestimo(0f);
        assertNull(pm.pressionarBotaoElaborar());
        assertEquals("nome vazio\nsalario vazio\nidade vazia\nvalor vazio\n", pm.getMsgDeErro());
    }

    @Test
    public void testeSoIdadeInvalida() {
        SimularPropostasPM pm = new SimularPropostasPM();
        pm.setNome("asdasd");
        pm.setSalario(11110f);
        pm.setIdade(15);
        pm.setValorDoEmprestimo(1000f);
        assertNull(pm.pressionarBotaoElaborar());
        assertEquals("idade invalida\n", pm.getMsgDeErro());
    }
}