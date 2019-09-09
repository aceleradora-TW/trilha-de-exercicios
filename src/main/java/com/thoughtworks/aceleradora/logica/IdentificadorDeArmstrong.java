package com.thoughtworks.aceleradora.logica;

import java.util.Objects;

public class IdentificadorDeArmstrong {

    public String identificaNumero(int numero) {
        String outroNumero = Objects.toString(numero);
        String[] vet = outroNumero.split("");
        int tamanho = vet.length;
        double soma = 0;

        for (int i = 0; i < tamanho; i++) {
            soma = soma + Math.pow(Integer.parseInt(vet[i]), tamanho);
        }

        if(soma == numero){
            return "Este eh um numero de Armstrong!";
        }

        return "Este nao eh um numero de Armstrong!";
    }
}
