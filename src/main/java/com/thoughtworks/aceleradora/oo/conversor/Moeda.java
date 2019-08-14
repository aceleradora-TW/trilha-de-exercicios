package com.thoughtworks.aceleradora.oo.conversor;

public enum Moeda {
    REAL_BRASILEIRO("BRL"),
    EURO("EUR"),
    DOLAR_AMERICANO("USD"),
    PESO_CHILENO("CLP");

    public String codigo;

    Moeda(String codigo) {
        this.codigo = codigo;
    }
}
