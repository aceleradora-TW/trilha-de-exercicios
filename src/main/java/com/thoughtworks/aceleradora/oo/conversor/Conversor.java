package com.thoughtworks.aceleradora.oo.conversor;

public class Conversor {

    public static String validador(String entrada) {
        String codigoMoedaOriginal = entrada.substring(0, 3);

        int indiceEspaco = entrada.indexOf(" ");
        String codigoMoedaDestino = entrada.substring(indiceEspaco + 1, indiceEspaco + 4);

        return entrada;
    }

    public double retornaValor(String entrada){

        int indiceEspaco = entrada.indexOf(" ");

        String valor = entrada.substring(3, indiceEspaco);

        double valorFinal = Double.parseDouble(valor);

        return valorFinal;
    }

    public String moedaOriginal(String entrada){

        String codigoMoedaOriginal = entrada.substring(0, 3);

        return codigoMoedaOriginal;
    }
    public String moedaDestino(String entrada){

        int indiceEspaco = entrada.indexOf(" ");

        String codigoMoedaDestino = entrada.substring(indiceEspaco + 1, indiceEspaco + 4);

        return codigoMoedaDestino;

    }
}
