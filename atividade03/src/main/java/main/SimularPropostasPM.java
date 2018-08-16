package main;

import java.util.List;

public class SimularPropostasPM {

    private String nome;
    private float salario;
    private int idade;
    private float valorDoEmprestimo;
    private String msgDeErro;
    private Calculadora calculadora;

    public SimularPropostasPM() {
        calculadora = new Calculadora();
    }

    public MostrarPropostasPM pressionarBotaoElaborar(){
        validar();

        if (!msgDeErro.isEmpty()) return null;

        List<Proposta> propostas = calculadora.calcular(salario, valorDoEmprestimo);

        return new MostrarPropostasPM(propostas);
    }

    private void validar() {
        msgDeErro = "";

        if (nome.isEmpty())
            msgDeErro += "nome vazio\n";

        if (salario <= 0)
            msgDeErro += "salario vazio\n";

        if (idade <= 0)
            msgDeErro += "idade vazia\n";
        else if (idade < 18 || idade > 70)
            msgDeErro += "idade invalida\n";

        if (valorDoEmprestimo <= 0)
            msgDeErro += "valor vazio\n";
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setValorDoEmprestimo(float valorDoEmprestimo) {
        this.valorDoEmprestimo = valorDoEmprestimo;
    }

    public String getMsgDeErro() {
        return msgDeErro;
    }

}
