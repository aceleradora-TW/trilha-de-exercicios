package com.thoughtworks.aceleradora.logica;

public class ContadorDeOcorrencias {

    public int contaOcorrencias(String texto, String token) {
        int cont = 0;
        for (int i = 0; i < texto.length(); i++) {
            if (token.charAt(0) == texto.charAt(i)) {
                cont++;
            }
        }
        return cont;
    }

}
