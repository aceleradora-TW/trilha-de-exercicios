package com.thoughtworks.aceleradora.logica;

public class SomaDobrada {

    public int soma(int umValor, int outroValor) {

//        int valorFinal;
//
//        if(umValor == outroValor) {
//
//            valorFinal = (umValor + outroValor) * 2;
//        }
//        else if(umValor < 1 || outroValor < 1){
//
//            valorFinal = -1;
//        }
//        else {
//            valorFinal = umValor + outroValor;
//        }
//        return valorFinal;

        return umValor == outroValor
                ?(umValor + outroValor) * 2
                :umValor < 1 || outroValor < 1
                ? -1
                :umValor + outroValor;
    }
}
