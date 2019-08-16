package com.thoughtworks.aceleradora.oo.conversor;

public class TaxaCambio {
    private Moeda entrada;
    private double taxa;
    private Moeda saida;

    public TaxaCambio(Moeda entrada, double taxa, Moeda saida) {
        this.entrada = entrada;
        this.taxa = taxa;
        this.saida = saida;
    }

    public Moeda getEntrada() {
        return entrada;
    }

    public void setEntrada(Moeda entrada) {
        this.entrada = entrada;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    public Moeda getSaida() {
        return saida;
    }

    public void setSaida(Moeda saida) {
        this.saida = saida;
    }
}