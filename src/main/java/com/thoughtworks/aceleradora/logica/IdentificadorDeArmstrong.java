package com.thoughtworks.aceleradora.logica;

import java.util.ArrayList;

public class IdentificadorDeArmstrong {

    public String identificaNumero(int numero) {
        String numerosString = Integer.toString(numero);
        String [] numeros = numerosString.split("");
        int tamanho = numeros.length;
        int soma = 0;
        for(int i = 0; i < tamanho; i++) {
            int num = Integer.parseInt(numeros[i]);
            soma = soma + (int)Math.pow(num, tamanho);
        }
        if(soma == numero){
            return "Este eh um numero de Armstrong!";
        }

        return "Este nao eh um numero de Armstrong!";
    }
}
