package br.edu.utfpr.calculadora;

public class Calculadora {

    public float calcularSalarioLiquido (Funcionario funcionario) {
        float salarioLiquido = 0;

        switch (funcionario.getCargo()) {
            case DESENVOLVEDOR:
                if (funcionario.getSalarioBase() >= 3000)
                    salarioLiquido = funcionario.getSalarioBase() * (1 - 0.2f);
                else
                    salarioLiquido = funcionario.getSalarioBase() * (1 - 0.1f);
            break;

            case DBA:
            case TESTADOR:
                if (funcionario.getSalarioBase() >= 2000)
                    salarioLiquido = funcionario.getSalarioBase() * (1 - 0.25f);
                else
                    salarioLiquido = funcionario.getSalarioBase() * (1 - 0.15f);
            break;

            case GERENTE:
                if (funcionario.getSalarioBase() >= 5000)
                    salarioLiquido = funcionario.getSalarioBase() * (1 - 0.3f);
                else
                    salarioLiquido = funcionario.getSalarioBase() * (1 - 0.2f);
                break;

        }
        return salarioLiquido;
    }

}
