package com.thoughtworks.aceleradora.oo.conversor;

public class CalculadoraDeCambio {

    public Double determinarTaxaDeCambio(String moedasParaConversao){
        if (moedasParaConversao.equals(TaxaDeCambio.BRLCLP.getMoedas())){
            return TaxaDeCambio.BRLCLP.getTaxaDeCambio();
        }
        if (moedasParaConversao.equals(TaxaDeCambio.BRLEUR.getMoedas())){
            return TaxaDeCambio.BRLEUR.getTaxaDeCambio();
        }
        if (moedasParaConversao.equals(TaxaDeCambio.CLPBRL.getMoedas())){
            return TaxaDeCambio.CLPBRL.getTaxaDeCambio();
        }
        if (moedasParaConversao.equals(TaxaDeCambio.CLPEUR.getMoedas())){
            return TaxaDeCambio.CLPEUR.getTaxaDeCambio();
        }
        if (moedasParaConversao.equals(TaxaDeCambio.EURBRL.getMoedas())){
            return TaxaDeCambio.EURBRL.getTaxaDeCambio();
        }
        if (moedasParaConversao.equals(TaxaDeCambio.EURCLP.getMoedas())){
            return TaxaDeCambio.EURCLP.getTaxaDeCambio();
        }
        else {
            return null;
        }
    }

    public Double converterMoedas(Double taxaDeCambio, Double valor){
        return taxaDeCambio * valor;
    }
}
