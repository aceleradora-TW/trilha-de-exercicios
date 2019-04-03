package com.thoughtworks.aceleradora.logica;

import java.util.ArrayList;
import java.util.List;

public class CaixaEletronico {

    public List<Integer> sacar(Integer valor) throws Exception {
        int valorInicial = valor;
        int resto50 = valor % 50;


        List<Integer> valores = new ArrayList<>();

        if (resto50 == 0) {
            while (valor >= 50) {
                valores.add(50);
                valor -= 50;
            }

        } else if (resto50 == 10) {
            for (int i = 1; i < (valor / 50); i++) {
                valores.add(50);
                valor -= 50;
            }

            while (valor >= 20) {
                valores.add(20);
                valor -= 20;
            }
        } else if (resto50 % 20 != 0) {
            while (valor >= 20) {
                valores.add(20);
                valor -= 20;
            }

        } else if (resto50 % 20 == 0) {
            while (valor >= 50) {
                valores.add(50);
                valor -= 50;
            }

            while (valor >= 20) {
                valores.add(20);
                valor -= 20;
            }
        }

        int totalLista = 0;
        for(int i = 0; i < valores.size(); i++){
            totalLista += valores.get(i);
        }

        if(valorInicial != totalLista){
            throw new Exception("Valor invalido");
        }
         return valores;
    }

}


