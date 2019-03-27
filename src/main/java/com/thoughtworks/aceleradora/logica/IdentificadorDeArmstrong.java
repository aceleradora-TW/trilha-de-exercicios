package com.thoughtworks.aceleradora.logica;

public class IdentificadorDeArmstrong {

    public String identificaNumero(int numero) {
        int valorFinal = numero;
        int tamanho;
        int soma = 0;


        if (valorFinal / 10 == 0) {
            soma = numero % 10;
            numero = 0;
        }

        while (numero > 0) {

            tamanho = numero % 10;
            numero = numero / 10;
            soma = soma + (tamanho * tamanho * tamanho);

        }

        if (valorFinal == soma) {
            return "Este eh um numero de Armstrong!";

        } else {
            return "Este nao eh um numero de Armstrong!";

        }
    }

}
