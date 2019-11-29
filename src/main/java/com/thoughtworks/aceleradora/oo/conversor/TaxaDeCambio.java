package com.thoughtworks.aceleradora.oo.conversor;

public enum TaxaDeConversao {
    BRLCLP("BRL CLP", 175.65),
    BRLEUR("BRL EUR", 0.23),
    CLPBRL("CLP BRL", 0.0057),
    CLPEUR("CLP EUR", 0.0013),
    EURBRL("EUR BRL", 4.29),
    EURCLP("EUR CLP", 754.01);

    private String moedas;
    private double valor;

    TaxaDeConversao(String moedas, double valor){
        this.moedas = moedas;
        this.valor = valor;
    }

    public double getValor(){
        return valor;
    }
}
