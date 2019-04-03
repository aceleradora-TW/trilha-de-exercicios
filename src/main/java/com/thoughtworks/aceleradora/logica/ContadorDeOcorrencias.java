package com.thoughtworks.aceleradora.logica;

public class ContadorDeOcorrencias {

    public int contaOcorrencias(String texto, String token) {
        int numeroToken = 0;

        for (int i = 0; i < texto.length(); i++) {
            String aux = "" + texto.charAt(i);
            if (aux.equals(token)) {
                numeroToken++;
            }
        }

        return numeroToken;
    }

}