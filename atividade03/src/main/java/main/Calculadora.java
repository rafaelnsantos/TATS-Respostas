package main;

import java.util.List;

import static java.util.Arrays.asList;

public class Calculadora {

    public List<Proposta> calcular(float salario, float valorDoEmprestimo) {

        if (salario <= 1000) {
            return asList(
                    new Proposta(2 * valorDoEmprestimo, 2),
                    new Proposta(2 * valorDoEmprestimo, 3)
            );
        } else if (salario <= 5000) {
            return asList(
                    new Proposta(1.3f * valorDoEmprestimo, 2),
                    new Proposta(1.5f * valorDoEmprestimo, 4),
                    new Proposta(1.5f * valorDoEmprestimo, 10)
            );
        } else {
            return asList(
                    new Proposta(1.1f * valorDoEmprestimo, 2),
                    new Proposta(1.3f * valorDoEmprestimo, 4),
                    new Proposta(1.3f * valorDoEmprestimo, 10),
                    new Proposta(1.4f * valorDoEmprestimo, 20)
            );
        }

    }

}