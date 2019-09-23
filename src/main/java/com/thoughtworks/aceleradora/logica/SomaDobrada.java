package com.thoughtworks.aceleradora.logica;

public class SomaDobrada {

    public int soma(int umValor, int outroValor) {

//        Caso os dois números recebidos sejam iguais, o método retorna o dobro da soma;
//        Caso nenhuma das condições anteriores seja verdadeira, o método retorna a soma dos dois números.
        int somaDosValores = umValor + outroValor;

        if(umValor < 1 || outroValor < 1) {
              return -1;
          }

          if(umValor == outroValor) {
              return somaDosValores*2;
          }

        return somaDosValores;
    }
}
