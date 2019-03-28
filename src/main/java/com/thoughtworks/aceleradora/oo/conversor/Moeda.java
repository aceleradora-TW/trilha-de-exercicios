package com.thoughtworks.aceleradora.oo.conversor;


public enum Moeda {
    REAL_BRASILEIRO("BRL"),
    PESO_CHILENO("CLP"),
    EURO("EUR");

    private String codigo;

    Moeda(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }


    public static boolean moedaDisponivel(String codigoMoeda) {

        Moeda[] moedasDisponiveis = Moeda.values();

        for (int i = 0; i < moedasDisponiveis.length; i++) {
            if (moedasDisponiveis[i].getCodigo().equals(codigoMoeda)) {
                return true;
            }
        }

        return false;
    }
}