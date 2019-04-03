package com.thoughtworks.aceleradora.logica;

public class SomaDobrada {

    public int soma(int umValor, int outroValor) {
        if (umValor == outroValor){
            int resultado = (umValor+outroValor)*2;
            return  (resultado);
        }
        else if (umValor<1 || outroValor<1){
            return (-1);
        }
        else{
            return (umValor+outroValor);
        }
    }
}
