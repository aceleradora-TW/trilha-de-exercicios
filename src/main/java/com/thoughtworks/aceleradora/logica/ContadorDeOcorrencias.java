package com.thoughtworks.aceleradora.logica;

public class ContadorDeOcorrencias {

    public int contaOcorrencias(String texto, String token) {
        int contador = 0;

        String vetor[] = texto.split("");

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i].equals(token)) {
                contador++;
            }
        }
        return contador;
    }

}
