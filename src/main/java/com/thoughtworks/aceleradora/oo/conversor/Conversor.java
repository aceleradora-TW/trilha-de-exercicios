package com.thoughtworks.aceleradora.oo.conversor;

public class Conversor {



    public String converter(String  entrada) {
        String stringValorConvertido = "";
        String moedaEntrada = getMoedaEntrada(entrada);
        String moedaSaida = getMoedaSaida(entrada);
        Double valor = getValor(entrada);

        //switch (moedaEntrada.equals()) {

        

//        if (moedaEntrada.equals("BRL")) {
//            Real real = new Real();
//
//
//
//        }
//
//        if (moedaEntrada.equals("EUR")) {
//
//        }
//
//        if (moedaEntrada.equals("CLP")) {
//
//        }





        return stringValorConvertido;

    }

    public String getMoedaEntrada(String entrada){

        String moedaEntrada = entrada.substring(0,2);
        return moedaEntrada;

    }

    public String getMoedaSaida(String entrada) {

        String moedaSaida = entrada.substring(entrada.length() - 3);
        return moedaSaida;
    }

    public Double getValor(String entrada){

        String stringValor = entrada.substring(3, entrada.length()-4);
        return Double.parseDouble(stringValor);
    }

}
