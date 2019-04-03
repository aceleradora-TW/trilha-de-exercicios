package com.thoughtworks.aceleradora.oo.conversor;

public class Moeda {
    private String moedaEntrada;
    private String moedaSaida;
    private Double taxaConversao;

    public Double getTaxaConversao() {
        return taxaConversao;
    }

    public void setTaxaConversao(Double taxaConversao) {
        this.taxaConversao = taxaConversao;
    }

    public String getMoedaEntrada(String entrada){
        String moedaEntrada = entrada.substring(0, 3);
        return moedaEntrada;

    }

    public String getMoedaSaida(String entrada) {
        String moedaSaida = entrada.substring(entrada.length()-3);
        return moedaSaida;
    }


    public Double getValor(String entrada){
        String stringValor = entrada.substring(3, entrada.length()-4);
        Double valor = Double.parseDouble(stringValor);
        return valor;
    }

}
