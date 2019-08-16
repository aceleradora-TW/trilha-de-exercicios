package com.thoughtworks.aceleradora.oo.conversor;

public class Conversor {

    public String converter(String entrada) {
        String moedaEntrada;
        double valor;
        String moedaSaida;

        String[] textoSeparado = entrada.split(" ");
        moedaSaida = textoSeparado[1];

        moedaEntrada = textoSeparado[0].substring(0, 3);

        String entradaValor = textoSeparado[0];
        String separaEntradaValor = textoSeparado[0].substring(3, entradaValor.length());
        valor = Double.parseDouble(separaEntradaValor);



        return null;
    }
}
