package com.thoughtworks.aceleradora.logica;

import com.google.protobuf.StringValue;

public class ContadorDeOcorrencias {

    public int contaOcorrencias(String texto, String token) {
        char token2 = token.charAt(0);

        int tamanho = 0;

        char[] letras = String.valueOf(texto).toCharArray();

        for (int i =0; i< letras.length; i++){
            if (token2 == letras[i]){
                 tamanho++;
            }
        }
        return tamanho;
    }

}

//
//    int contToken=0;
//        for (int i =0; i< texto.length(); i++){
//        if (texto.contentEquals(StringValue.of(token))) {
//        int contToken =contToken++;
//        }
//        }
//        return contToken;
//        }







