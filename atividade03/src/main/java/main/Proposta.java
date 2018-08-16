package main;

public class Proposta {

    float total;
    int numeroParcelas;

    public Proposta(float total, int numeroParcelas) {
        this.total = total;
        this.numeroParcelas = numeroParcelas;
    }

    public float getTotal() {
        return total;
    }

    public float getValorParcela() {
        return total / numeroParcelas;
    }

    public int getNumeroParcelas() {
        return numeroParcelas;
    }

}