package com.thoughtworks.aceleradora.oo.conversor;

public class Validador {

    public Boolean validarMoedaInicial(String moedaInicial){
        for (Moedas moeda : Moedas.values()){
            if (moedaInicial.equals(moeda)){
                return true;
            }
        }
        return false;
    }

    public Boolean validarMoedaFinal(String moedaFinal){
        for (Moedas moeda : Moedas.values()){
            if (moedaFinal.equals(moeda)){
                return true;
            }
        }
        return false;
    }
}
