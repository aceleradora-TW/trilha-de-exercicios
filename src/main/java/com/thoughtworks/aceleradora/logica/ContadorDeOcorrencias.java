package com.thoughtworks.aceleradora.logica;

public class ContadorDeOcorrencias {

    public int contaOcorrencias(String texto, String token) {
        String[] textoCortado = texto.split("");
        int cont = 0;
        for(int i = 0; i < textoCortado.length;i++){
            if(textoCortado[i].equals(token)){
                cont++;
            }
        }
        return cont;
    }
}
