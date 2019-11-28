package com.thoughtworks.aceleradora.oo.conversor;

public class InterpretadorDeEntrada {
    public String entrada;
    public String moedaInicial;
    public String moedaFinal;
    public Double valor;

    public String verificarMoedaEntrada(String entrada){
        this.moedaInicial = entrada.substring(0, 3);
        return moedaInicial;
    }

    public Double verificarValor(String entrada){
        this.valor = Double.parseDouble(entrada.replaceAll("[^0-9]*", ""));
        return valor;
    }

    public String verificarMoedaDesejada(String entrada){
        this.moedaFinal = entrada.split(" ")[1];
        return moedaFinal;
    }
}
