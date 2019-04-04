package com.thoughtworks.aceleradora.oo.conversor;

public class Conversor {

    public String converter(String entrada) {
        String moedaEntrada;
        String moedaSaida;
        String valor;
        double taxaCambio = 0.0;
        String valorFinal;
        Double valorFinalDouble = 0.0;

        moedaEntrada = entrada.substring(0, 3);
        moedaSaida = entrada.substring(entrada.length()-3);
        valor = entrada.substring(3, entrada.length()-4);

        if (moedaEntrada.equals("BRL")) {
            if (moedaSaida.equals("CLP")) {
                taxaCambio = 175.65;
            }

            if (moedaSaida.equals("EUR")) {
                taxaCambio = 0.23;

            }
            else {
                return "Moeda nao suportada: "+ moedaSaida;
            }

        }
        if (moedaEntrada.equals("CLP")) {
            if (moedaSaida.equals("BRL")) {
                taxaCambio = 0.0057;
            }

            if (moedaSaida.equals("EUR")) {
                taxaCambio = 0.0013;
            }
            else {
                return "Moeda nao suportada: "+ moedaSaida;
            }
        }

        if (moedaEntrada.equals("EUR")) {
            if (moedaSaida.equals("BRL")) {
                taxaCambio = 4.29;
            }

            if (moedaSaida.equals("CLP")) {
                taxaCambio = 754.01;
            }
            else {
                return "Moeda nao suportada: "+ moedaSaida;
            }
        }
        
        valorFinalDouble = Double.parseDouble(String.valueOf(valor)) * taxaCambio;


        return moedaSaida + valorFinalDouble;


    }





}