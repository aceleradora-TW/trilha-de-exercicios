package com.thoughtworks.aceleradora.logica;

public class IdentificadorDeArmstrong {

    public String identificaNumero(int numero) {
        String term = Integer.toString(numero);
        int count = 0;
        double sum;
        int num = 0;
        for(int i = 0; i<term.length(); i++) {
            count++;
        }
        for(int i = 0; i<=count; i++) {
            num = numero/10;
            numero = numero % 10;
            sum =+ (Math.pow(numero, count));
        }
     return "";
    }
}
