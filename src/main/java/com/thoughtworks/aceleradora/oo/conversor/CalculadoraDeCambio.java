package com.thoughtworks.aceleradora.oo.conversor;

public class CalculadoraDeCambio {

    public Double determinarTaxaDeCambio(String moedasParaConversao){
        for (TaxaDeCambio taxaDeCambio : TaxaDeCambio.values()){
            if (moedasParaConversao.equals(taxaDeCambio)){
                return taxaDeCambio.getTaxaDeCambio();
            }
        }
        return null;
    }

    public Double converterMoedas(Double taxaDeCambio, Double valor){
        return taxaDeCambio * valor;
    }
}
