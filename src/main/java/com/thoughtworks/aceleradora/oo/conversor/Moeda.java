package com.thoughtworks.aceleradora.oo.conversor;

public enum Moeda {
    BRL,
    CLP,
    EUR;

//    As taxas de câmbio entre estas moedas são as seguintes:
//
//            - `BRL > CLP: 175.65`
//            - `BRL > EUR: 0.23`
//            - `CLP > BRL: 0.0057`
//            - `CLP > EUR: 0.0013`
//            - `EUR > BRL: 4.29`
//            - `EUR > CLP: 754.01`

    public static double EURto (double valorEntrada, String moedaFinal){
        if(moedaFinal.equals("BRL")){
            return valorEntrada * 4.29;
        }
        if(moedaFinal.equals("CLP")){
            return valorEntrada * 754.01;
        }
        if(moedaFinal.equals("EUR")){
            return valorEntrada;
        }
        return 0;
    }
    public double BRLto(double valorEntrada, String moedaFinal){
        if(moedaFinal.equals("BRL")){
            return valorEntrada;
        }
        if(moedaFinal.equals("CLP")){
            return valorEntrada * 175.65;
        }
        if(moedaFinal.equals("EUR")){
            return valorEntrada * 0.23;
        }

        return 0;
    }
}
