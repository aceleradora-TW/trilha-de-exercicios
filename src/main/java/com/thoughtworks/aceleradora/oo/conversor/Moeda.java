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

    public double toEUR (double valorEntrada, String moedaFinal){
        //`EUR > BRL: 4.29`
        if(moedaFinal.equals("BRL")){
            return valorEntrada * 4.29;
        }

        return 0;
    }
}
