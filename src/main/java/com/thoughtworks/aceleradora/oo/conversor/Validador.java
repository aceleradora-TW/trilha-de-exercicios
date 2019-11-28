package com.thoughtworks.aceleradora.oo.conversor;

public class Validador {
    InterpretadorDeEntrada interpretadorDeEntrada;
    String moedaInicial;

    public String verificarMoedaValida(String entrada){
        this.moedaInicial =  interpretadorDeEntrada.moedaInicial;
        for (Moedas moeda : Moedas.values()){
            if (moedaInicial.equals(moeda)){
                return moedaInicial;
            }
        }
        return "Moeda nao suportada: " + moedaInicial;
    }
}
