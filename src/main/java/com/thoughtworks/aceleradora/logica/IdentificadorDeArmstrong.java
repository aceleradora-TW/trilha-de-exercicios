package com.thoughtworks.aceleradora.logica;

import java.util.ArrayList;

public class IdentificadorDeArmstrong {

    public String identificaNumero(int numero) {
       /* ArrayList<Integer> retorno = new ArrayList<>();
        int valorFinal;
        int soma=0;
        int length = String.valueOf(numero).length();

        char[] digitos = String.valueOf( numero ).toCharArray();

        for ( char d : digitos ) {
            soma += (int) Math.pow((int) d, length);

        }

        if(soma == numero){
            String resposta = "Este eh um numero de Armstrong!";
            return resposta;
        }else {

            String resposta2 = "Este nao eh um numero de Armstrong!";
            return resposta2;
        }
        */
       int valorFinal = numero;
       int soma = 0;
       int tamanho;

       if (valorFinal / 10 == 0){
           soma = numero % 10;
           numero = 0;
       }

       while ( numero > 0){
           tamanho = numero % 10;
           numero = numero / 10;
           soma = soma + (tamanho * tamanho * tamanho);
       }

       if (valorFinal == soma){
           return "Este eh um numero de Armstrong!";
       }else {
           return "Este nao eh um numero de Armstrong!";
       }


    }

}
