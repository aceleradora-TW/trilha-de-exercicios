package com.thoughtworks.aceleradora.oo.conversor;

public class Real {
    private Double taxaEUR = 0.23;
    private Double taxaCLP = 175.65;

    public Double converteParaEUR(Double valor) {
        return valor * taxaEUR;
    }

    public Double converteParaCLP(Double valor) {
        return valor * taxaCLP;
    }
}
