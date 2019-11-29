package com.thoughtworks.aceleradora.oo.conversor;

public class InterpretadorDeEntrada {
    public String moedaInicial;
    public String moedaFinal;
    public Double valor;

    public String extrairMoedaInicial(String entrada){
        this.moedaInicial = entrada.substring(0, 3);
        return moedaInicial;
    }

    public Double extrairValor(String entrada){
        this.valor = Double.parseDouble(entrada.replaceAll("[^0-9]*", ""));
        return valor;
    }

    public String extrairMoedaFinal(String entrada){
        this.moedaFinal = entrada.split(" ")[1];
        return moedaFinal;
    }

    public String detectarMoedasParaConversao(String moedaInicial, String moedaFinal){
        return moedaInicial + " " + moedaFinal;
    }
}
