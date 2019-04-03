package com.thoughtworks.aceleradora.logica;

import org.assertj.core.internal.bytebuddy.asm.Advice;

public class SomaDobrada {

    public int soma(int umValor, int outroValor) {

        if (umValor == outroValor){
            return 2*(umValor + outroValor);
        }

        if (umValor < 1 || outroValor < 1){
            return -1;
        }

        return umValor + outroValor;

    }
}
