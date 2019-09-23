package com.thoughtworks.aceleradora.logica;

public class ContadorDeOcorrencias {

    public int contaOcorrencias(String texto, String token) {

       String[] palavra = texto.split("");

       int contador = 0;

       for (String busca: palavra) {

            if (busca.equals(token)) {
                contador += 1;
            }
        }

        return contador;
    }

}
