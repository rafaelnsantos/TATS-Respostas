package br.edu.utfpr.calculadora;

public class Funcionario {
    private Cargo cargo;
    private float salario;

    public Funcionario(Cargo cargo, float salario) {
        this.cargo = cargo;
        this.salario = salario;

    }

    public Cargo getCargo() {
        return cargo;
    }

    public float getSalario() {
        return salario;
    }
}
