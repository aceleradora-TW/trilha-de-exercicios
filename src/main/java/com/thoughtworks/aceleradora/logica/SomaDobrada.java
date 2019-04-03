package com.thoughtworks.aceleradora.logica;

public class SomaDobrada {

    public int soma(int umValor, int outroValor) {

       if(umValor == outroValor){
           int dobroSoma = (umValor + outroValor) * 2;
           return dobroSoma;
       }
       else if(umValor < 1 || outroValor < 1) {
            return -1;
        }
       else {
           return umValor + outroValor;

        }

    }
}
