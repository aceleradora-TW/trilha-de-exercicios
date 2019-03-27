package com.thoughtworks.aceleradora.logica;

public class ContadorDeOcorrencias {
    public int contaOcorrencias(String texto, String busca) {
        int cont = 0;
        for (int i = 0; i < texto.length(); i++) {
            if (busca.contentEquals(String.valueOf(texto.charAt(i)))){
                cont = cont + 1;
            }
        }
        return cont;
    }

}

