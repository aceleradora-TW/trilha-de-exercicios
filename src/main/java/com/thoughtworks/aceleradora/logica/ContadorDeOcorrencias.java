package com.thoughtworks.aceleradora.logica;

public class ContadorDeOcorrencias {

    public int contaOcorrencias(String texto, String token) {

        int cont=0;

        if(texto.length() == 0)
            return 0;

        for (int i=0; i < texto.length(); i++){
            if (texto.charAt(i) == token.charAt(0))
                cont++;

        }


        return cont;
    }

}
