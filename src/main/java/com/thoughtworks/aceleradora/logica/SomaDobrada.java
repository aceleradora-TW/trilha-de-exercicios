package com.thoughtworks.aceleradora.logica;

public class SomaDobrada {

    public int soma(int umValor, int outroValor) {
        if(umValor==outroValor){
           return (umValor+outroValor)*2;
       }else if(umValor<1 || outroValor<1){
            return -1;
        }
        return (umValor+outroValor);
    }
}
