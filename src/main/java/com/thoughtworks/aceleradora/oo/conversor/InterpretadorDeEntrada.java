package com.thoughtworks.aceleradora.oo.conversor;

public class InterpretadorDeEntrada {

    public String moedaInicial(String entrada){
        return entrada.substring(0,3);
    }
    public String moedaFinal(String entrada){
        return entrada.substring(entrada.length()-3);
    }
    public double valor(String entrada){
        return Double.parseDouble(entrada.substring(3, entrada.length()-4));
    }
}
