package com.thoughtworks.aceleradora.oo.conversor;

public class Validador {

    public Boolean validarMoedaInicial(String moedaInicial){
        if (moedaInicial.equals(Moedas.BRL.getMoeda())){
            return true;
        }
        else if (moedaInicial.equals(Moedas.CLP.getMoeda())){
            return true;
        }
        else if (moedaInicial.equals(Moedas.EUR.getMoeda())){
            return true;
        }
        else{
            return false;
        }
    }

    public Boolean validarMoedaFinal(String moedaFinal){
        if (moedaFinal.equals(Moedas.BRL.getMoeda())){
            return true;
        }
        else if (moedaFinal.equals(Moedas.CLP.getMoeda())){
            return true;
        }
        else if (moedaFinal.equals(Moedas.EUR.getMoeda())){
            return true;
        }
        else{
            return false;
        }
    }
}
