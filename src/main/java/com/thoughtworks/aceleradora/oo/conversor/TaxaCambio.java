package com.thoughtworks.aceleradora.oo.conversor;

public class TaxaCambio {
    private String entrada;
    private double taxa;
    private String saida;

    public TaxaCambio(String entrada, double taxa, String saida) {
        this.entrada = entrada;
        this.taxa = taxa;
        this.saida = saida;
    }

    public String getEntrada() {
        return entrada;
    }

    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    public String getSaida() {
        return saida;
    }

    public void setSaida(String saida) {
        this.saida = saida;
    }

}
