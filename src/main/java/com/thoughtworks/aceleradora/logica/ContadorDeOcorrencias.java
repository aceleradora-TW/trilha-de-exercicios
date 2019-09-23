package com.thoughtworks.aceleradora.logica;

public class ContadorDeOcorrencias {

    public int contaOcorrencias(String texto, String token) {

        String[] vetTexto = texto.split("");
        int cont = 0;

        for (int i = 0; i < vetTexto.length; i++){
            if (vetTexto[i].equals(token)) {
                cont++;
            }
        }
        return cont;
    }

}
