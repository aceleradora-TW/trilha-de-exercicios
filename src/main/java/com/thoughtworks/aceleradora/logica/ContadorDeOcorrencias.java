package com.thoughtworks.aceleradora.logica;

public class ContadorDeOcorrencias {

    public int contaOcorrencias(String texto, String token) {
        char token2 = token.charAt(0);
        int contToken=0;

        char[] letras = texto.toCharArray();

        for(int i=0; i < letras.length; i++ ){
            if(letras[i] == token2){
                contToken++;
            }
        }
        return contToken;
    }
}