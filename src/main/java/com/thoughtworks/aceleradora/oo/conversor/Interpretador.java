package com.thoughtworks.aceleradora.oo.conversor;

public class Interpretador {
    private String moedaEntrada;
    private double valorEntrada;
    private String moedaSaida;

    public Interpretador(String entrada) {
        String[] vetMoeda = entrada.split(" ");
        moedaSaida = vetMoeda[1];
        String[] vetValor = entrada.split("\\D");
        valorEntrada = Double.parseDouble((vetValor[vetValor.length-1]));
        String[] vetEntrada = entrada.split("\\d");
        moedaEntrada = vetEntrada[0];
    }


    public String getMoedaEntrada() {
        return moedaEntrada;
    }

    public double getValorEntrada() {
        return valorEntrada;
    }

    public String getMoedaSaida() {
        return moedaSaida;
    }
}
