package com.thoughtworks.aceleradora.oo.conversor;

import java.util.Arrays;
import java.util.List;

public class Conversor {

    final List<TaxaCambio> TAXAS_DISPONIVEIS = Arrays.asList(
            new TaxaCambio(Moeda.REAL_BRASILEIRO, 175.65, Moeda.PESO_CHILENO),
            new TaxaCambio(Moeda.REAL_BRASILEIRO, 0.23, Moeda.EURO),

            new TaxaCambio(Moeda.EURO, 754.01, Moeda.PESO_CHILENO),
            new TaxaCambio(Moeda.EURO, 4.29, Moeda.REAL_BRASILEIRO),

            new TaxaCambio(Moeda.PESO_CHILENO, 0.0013, Moeda.EURO),
            new TaxaCambio(Moeda.PESO_CHILENO, 0.0057, Moeda.REAL_BRASILEIRO)
    );


    public static String validador(String moedaEntrada, String moedaSaida) {
        if (Moeda.moedaDisponivel(moedaEntrada) == false)
            return "Moeda nao suportada: " + moedaEntrada;

        if(Moeda.moedaDisponivel(moedaSaida) == false )
            return "Moeda nao suporotada: " + moedaSaida;

    return null;
    }

    public String converter(String entrada) {
        double valor = retornaValor(entrada);
        String moedaEntrada = moedaOriginal(entrada);
        String moedaSaida = moedaDestino(entrada);
        Double resultado = 0.0;

        String msg = validador(moedaEntrada, moedaSaida);

        if(msg != null) return msg;



        for (TaxaCambio taxa : TAXAS_DISPONIVEIS){

            if(moedaEntrada.equalsIgnoreCase(taxa.getMoedaDeOrigem().getCodigo())){


                if(moedaSaida.equalsIgnoreCase(taxa.getMoedaDeDestino().getCodigo())){
                    resultado = valor * taxa.getTaxa();

                }
            }
        }

        if (resultado %1 == 0)
        return moedaSaida + String.format("%.0f", resultado);
        else
            return moedaSaida + resultado;

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
