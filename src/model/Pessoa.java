package model;

import comportamento.Comportamento;

public class Pessoa {
    private Comportamento comportamento;

    public void setComportamento(Comportamento strategy) {
        this.comportamento = strategy;
    }

    public void andar() {
        comportamento.andar();
    }

    public void comer() {
        comportamento.comer();
    }

    public void falar() {
        comportamento.falar();
    }
}
