package com.thoughtworks.aceleradora.logica;


import com.thoughtworks.aceleradora.oo.rpg.CriadorDePersonagens;

public class IdentificadorDeArmstrong {
    /*public static void main(String[] args) {
        identificaNumero(153);

    }

     */

    public static String identificaNumero(int numero) {

        String numeros = "" + numero;
        int resposta = 0;

        char[] arrayValores = numeros.toCharArray();

        int tamanhoArray = arrayValores.length;

        for (int i = 0; i < tamanhoArray; i++) {

            resposta += Math.pow(Integer.parseInt(String.valueOf(arrayValores[i])), tamanhoArray);
        }

        if(resposta == numero) return "Este eh um numero de Armstrong!";

        return "Este nao eh um numero de Armstrong!";
    }
}
