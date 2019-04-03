package com.thoughtworks.aceleradora.oo.conversor;

public class Conversor {

    public String converter(String  entrada) {
        String stringValorConvertido = "";
        Moeda moeda = new Moeda();

        String moedaEntrada = moeda.getMoedaEntrada(entrada);
        String moedaSaida = moeda.getMoedaSaida(entrada);
        Double valorEntrada = moeda.getValor(entrada);
        Double valorConvertido;

        if (moedaSaida.equals("BRL") || moedaSaida.equals("CLP") || moedaSaida.equals("EUR") ) {
            switch (moedaEntrada) {
                case "BRL": {
                    if (moedaSaida.equals("CLP")) {
                        moeda.setTaxaConversao(175.65);
                    }

                    if (moedaSaida.equals("EUR")) {
                        moeda.setTaxaConversao(0.23);
                    }

                    break;
                }

                case "CLP": {
                    if (moedaSaida.equals("BRL")) {
                        moeda.setTaxaConversao(0.0057);
                    }

                    if (moedaSaida.equals("EUR")) {
                        moeda.setTaxaConversao(0.0013);
                    }

                    break;
                }

                case "EUR": {
                    if (moedaSaida.equals("BRL")) {
                        moeda.setTaxaConversao(4.29);
                    }

                    if (moedaSaida.equals("CLP")) {
                        moeda.setTaxaConversao(754.01);
                    }

                    break;
                }

                default:
                    return "Moeda nao suportada: " + moedaEntrada;
            }

        } else {
            return "Moeda nao suportada: " + moedaSaida;
        }

        valorConvertido = valorEntrada * moeda.getTaxaConversao();
        stringValorConvertido = String.valueOf(valorConvertido);


        String stringValorFormatado = moedaSaida + stringValorConvertido;

        return stringValorFormatado;
    }
}
