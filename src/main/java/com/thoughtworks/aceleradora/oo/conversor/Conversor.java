package com.thoughtworks.aceleradora.oo.conversor;

public class Conversor {

    public String converter(String entrada) {

        InterpretadorEntrada interpretadorEntrada = new InterpretadorEntrada();

        String moedaEntrada = interpretadorEntrada.moedaInicial(entrada);
        double valorEntrada = interpretadorEntrada.valor(entrada);
        String moedaSaida = interpretadorEntrada.moedaFinal(entrada);

        if (moedaEntrada.equals("EUR")) {
            return moedaSaida + String.format("%.2f",
                    Moeda.EURto(valorEntrada, moedaSaida)
            );
        }

        if (moedaEntrada.equals("CLP"))


        return null;
    }
}
