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
        }
        return salario;
    }
}
