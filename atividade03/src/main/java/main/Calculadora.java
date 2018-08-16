package main;

import java.util.ArrayList;
import java.util.List;

public class Calculadora {

    public List<Proposta> calcular(float salario, float valorDoEmprestimo) {
        List<Proposta> propostas = new ArrayList<>();

        if (salario <= 1000) {
            propostas.add(new Proposta(2 * valorDoEmprestimo, 2));
            propostas.add(new Proposta(2 * valorDoEmprestimo, 3));
        } else if (salario <= 5000) {
            propostas.add(new Proposta(1.3f * valorDoEmprestimo, 2));
            propostas.add(new Proposta(1.5f * valorDoEmprestimo, 4));
            propostas.add(new Proposta(1.5f * valorDoEmprestimo, 10));
        } else {
            propostas.add(new Proposta(1.1f * valorDoEmprestimo, 2));
            propostas.add(new Proposta(1.3f * valorDoEmprestimo, 4));
            propostas.add(new Proposta(1.3f * valorDoEmprestimo, 10));
            propostas.add(new Proposta(1.4f * valorDoEmprestimo, 20));
        }

        return propostas;
    }

}