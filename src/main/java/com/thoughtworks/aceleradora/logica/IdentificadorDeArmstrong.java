package com.thoughtworks.aceleradora.logica;

public class IdentificadorDeArmstrong {

    public String identificaNumero(int numero) {
        int length = String.valueOf(numero).length();
        int soma = 0;
        String stringNumero = String.valueOf(numero);

        for(int i = 0; i < stringNumero.length(); i++) {
            char numeroAtual = stringNumero.charAt(i);
            int digito = Character.getNumericValue(numeroAtual);

            soma += Math.pow(digito, length);
        }

        if(soma == numero) {
           return "Este eh um numero de Armstrong!";
        }
            return "Este nao eh um numero de Armstrong!";
    }
}



