package com.thoughtworks.aceleradora.oo.conversor;

import static com.thoughtworks.aceleradora.oo.conversor.Moeda.*;
import static java.lang.Double.parseDouble;

public class InterpretadorEntrada {

    public String moedaInicial(String entrada) {
        return entrada.substring(0, 3);
    }

    public String moedaFinal(String entrada) {
        return entrada.substring(entrada.length()-3);
    }

    public double valor(String valor) {
        double toValor = parseDouble(valor.substring(3, (valor.length() - 4)));
        return toValor;
    }

    public static void main(String[] args) {
        InterpretadorEntrada interpretadorEntrada = new InterpretadorEntrada();

        System.out.println(Moeda.EUR.toEUR(1000.00,"BRL"));

//        System.out.println(interpretadorEntrada.valor("USD100 BRL"));
//        System.out.println(interpretadorEntrada.moedaFinal("USD1384 BRL"));
//        System.out.println(interpretadorEntrada.moedaInicial("USD109877 BRL"));
    }
}
