package com.thoughtworks.aceleradora.logica;

public class SomaDobrada {

    public int soma(int umValor, int outroValor) {

        int soma = umValor + outroValor;

        if(umValor == outroValor) return 2*soma;

        if(umValor < 1 || outroValor < 1) return -1;

        return soma;
    }
}
