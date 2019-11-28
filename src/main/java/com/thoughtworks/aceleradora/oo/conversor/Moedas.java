package com.thoughtworks.aceleradora.oo.conversor;

public enum Moedas {
    BRL("BRL"),
    CLP("CLP"),
    EUR("EUR");

    private String moeda;

    Moedas(String moeda){
        this.moeda = moeda;
    }

    public String getMoeda(){
        return moeda;
    }
}
