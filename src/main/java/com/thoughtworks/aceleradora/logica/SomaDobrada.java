package com.thoughtworks.aceleradora.logica;

public class SomaDobrada {

    public int soma(int umValor, int outroValor) {

        if (umValor < 1 || outroValor < 1){
             return -1;
        }
        else if (umValor == outroValor){
            return (umValor + outroValor) * 2;
        }
        return umValor + outroValor;
    }
}
