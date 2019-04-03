package com.thoughtworks.aceleradora.logica;

import java.util.ArrayList;
import java.util.List;


public class CaixaEletronico {

    public List<Integer> sacar(Integer valor) throws Exception{
        List<Integer> valores = new ArrayList<>();
        int restoDivisao50 = valor % 50;
        int divisaoPor50 = valor / 50;
        int valorAtual = valor;
        int soma = 0;

        if(restoDivisao50 == 0) {
            while (valorAtual >= 50) {
                valores.add(50);
                valorAtual -= 50;
            }

        } else if (restoDivisao50 == 10) {
            for (int i = 1; i < divisaoPor50; i++) {
                valores.add(50);
                valorAtual -= 50;
            }

            while (valorAtual >= 20) {
                valores.add(20);
                valorAtual -= 20;
            }

        } else if (restoDivisao50 % 20 != 0) {
            while (valorAtual >= 20) {
                valores.add(20);
                valorAtual -= 20;
            }

        } else if (restoDivisao50 % 20 == 0) {
            while (valorAtual >= 50) {
                valores.add(50);
                valorAtual -= 50;
            }

            while (valorAtual >= 20) {
                valores.add(20);
                valorAtual -= 20;
            }

        }

        for(int i = 0; i < valores.size(); i++) {
            soma += valores.get(i);
        }

        if (soma != valor){
            throw new Exception("Valor invalido");
        }

        return valores;

    }
}
