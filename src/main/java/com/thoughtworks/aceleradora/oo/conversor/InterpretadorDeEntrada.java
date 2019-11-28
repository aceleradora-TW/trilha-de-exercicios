package com.thoughtworks.aceleradora.oo.conversor;

public class InterpretadorDeEntrada {
    public String entrada;
    public String moedaInicial;
    public String moedaFinal;
    public Double valor;

    public void verificarMoedaEntrada(String entrada){
        this.moedaInicial = entrada.substring(0, 3);
    }

    public void verificarValor(String entrada){
        this.valor = Double.parseDouble(entrada.replaceAll("[^0-9]*", ""));
    }

    public void verificarMoedaDesejada(String entrada){
        this.moedaFinal = entrada.split(" ")[1];
    }
}
