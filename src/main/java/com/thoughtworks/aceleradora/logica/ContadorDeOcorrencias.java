package com.thoughtworks.aceleradora.logica;

public class ContadorDeOcorrencias {
    public int contaOcorrencias(String texto, String token) {
        int count=0;
        char text = token.charAt(0);
        for(int i=0;i<texto.length(); i++){
            if(texto.charAt(i)==text){
                count++;
            }
        }
        return count;
    }

}
