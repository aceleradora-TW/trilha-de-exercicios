package com.thoughtworks.aceleradora.oo.conversor;

public class Conversor {
    public String pegarMoedaEntrada(String entrada) {
        return entrada.substring(0, 3);
    }

    public String pegarMoedaSaida(String entrada){
        return entrada.substring(entrada.length()-3);
    }

    public String pegarValor(String entrada){
        return entrada.substring(3, entrada.length()-4);
    }

    public boolean validarMoeda(String moeda){
        return moeda.equals("BRL") || moeda.equals("EUR") || moeda.equals("CLP");
    }

    public Double calculaValorFinal(String valor, double taxaCambio){
        return Double.parseDouble(String.valueOf(valor)) * taxaCambio;

    }
    public String formataValorSaida(Double resultado, String moedaSaida){
        String valorFinal = "" + resultado;
        if(valorFinal.substring(valorFinal.length() -2).equals(".0")){
            valorFinal = valorFinal.substring(0, valorFinal.length() -2);
        }
        return moedaSaida + valorFinal;

    }

    public String converter(String entrada) {
        String moedaEntrada = pegarMoedaEntrada(entrada);
        String moedaSaida = pegarMoedaSaida(entrada);
        String valor = pegarValor(entrada);

        final String MENSAGEM_ERRO = "Moeda nao suportada: ";
        final String BRL_CLP = "BRLCLP";
        final String BRL_EUR = "BRLEUR";
        final String CLP_EUR = "CLPEUR";
        final String CLP_BRL = "CLPBRL";
        final String EUR_BRL = "EURBRL";
        final String EUR_CLP = "EURCLP";

        double taxaCambio = 0.0;

        if (!validarMoeda(moedaEntrada)){
            return   MENSAGEM_ERRO + moedaEntrada;
        }

        if (!validarMoeda(moedaSaida)){
            return   MENSAGEM_ERRO + moedaSaida;
        }

        switch(moedaEntrada+moedaSaida){
            case BRL_CLP: taxaCambio = 175.65;
                break;
            case BRL_EUR: taxaCambio = 0.23;
                break;
            case CLP_BRL: taxaCambio = 0.0057;
                break;
            case CLP_EUR: taxaCambio = 0.0013;
                break;
            case EUR_BRL: taxaCambio = 4.29;
                break;
            case EUR_CLP: taxaCambio = 754.01;
                break;
            default: return   MENSAGEM_ERRO + moedaEntrada;

        }

        double resultado = calculaValorFinal(valor, taxaCambio);
        return formataValorSaida(resultado, moedaSaida);
    }

}