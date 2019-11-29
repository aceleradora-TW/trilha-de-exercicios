package com.thoughtworks.aceleradora.oo.conversor;

public class Validador {
    InterpretadorDeEntrada interpretadorDeEntrada;
    String moedaInicial;
    String moedaFinal;

    public String validarMoedaInicial(String entrada){
        this.moedaInicial =  interpretadorDeEntrada.extrairMoedaEntrada(entrada);
        for (Moedas moeda : Moedas.values()){
            if (moedaInicial.equals(moeda)){
                return moedaInicial;
            }
        }
        return "Moeda nao suportada: " + moedaInicial;
    }

    public String validarMoedaFinal(String entrada){
        this.moedaFinal =  interpretadorDeEntrada.extrairMoedaDesejada(entrada);
        for (Moedas moeda : Moedas.values()){
            if (moedaFinal.equals(moeda)){
                return moedaFinal;
            }
        }
        return "Moeda nao suportada: " + moedaFinal;
    }
}
