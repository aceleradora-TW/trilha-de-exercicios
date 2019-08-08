package com.thoughtworks.aceleradora.logica;

public class IdentificadorDeArmstrong {

    public String identificaNumero(int numero) {

        String numeroString = String.valueOf(numero);
        int tamanhoString = numeroString.length();

        int resultado = 0;
        int aux = 0;
        for (int i = 0; i < tamanhoString; i++) {
            resultado += Math.pow(Integer.parseInt(String.valueOf(numeroString.charAt(i))), tamanhoString);
        }

        if (resultado == numero) {
            return "Este eh um numero de Armstrong!";

        } else {
            return "Este nao eh um numero de Armstrong!";

        }
    }
}
