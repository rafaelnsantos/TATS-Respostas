package br.edu.utfpr.calculadora;

public class Calculadora {
    public float calcularSalarioLiquido(Funcionario funcionario) {
        float salario = funcionario.getSalario();
        switch (funcionario.getCargo()) {
            case DESENVOLVEDOR:
                if (funcionario.getSalario() >= 3000)
                    salario *= 1 - 0.2f;
                else
                    salario *= 1 - 0.1f;
            break;

            case DBA:
            case TESTADOR:
                if (funcionario.getSalario() >= 2000)
                    salario *= 1 - 0.25f;
                else
                    salario *= 1 - 0.15f;
            break;

            case GERENTE:
                if (funcionario.getSalario() >= 5000)
                    salario *= 1 - 0.3f;
                else
                    salario *= 1 - 0.2f;
            break;
        }
        return salario;
    }
}
