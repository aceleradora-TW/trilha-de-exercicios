package com.thoughtworks.aceleradora.oo.conversor;

public class ConversorControladora {


    public String pegaMoedaEntrada(String entrada) {

        String[] textoSeparado = separarEntrada(entrada);
        String entradaMaisValor = textoSeparado[0];
        return entradaMaisValor.substring(0, 3);
    }

    public double pegaValor(String entrada) {
        String[] textoSeparado = separarEntrada(entrada);
        String entradaMaisValor = textoSeparado[0];
        String separaEntradaValor = textoSeparado[0].substring(3, entradaMaisValor.length());
        double valor = Double.parseDouble(separaEntradaValor);
        return valor;
    }

    public String pegaMoedaSaida(String entrada) {
        String[] textoSeparado = separarEntrada(entrada);
        String moedaSaida = textoSeparado[1];
        return moedaSaida;
    }

    public String[] separarEntrada(String entrada) {
        String[] textoSeparado = entrada.split(" ");
        return textoSeparado;
    }

}
