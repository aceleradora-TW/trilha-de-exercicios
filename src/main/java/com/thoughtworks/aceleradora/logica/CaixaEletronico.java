package com.thoughtworks.aceleradora.logica;

import java.util.ArrayList;
import java.util.List;

public class CaixaEletronico {

    public List<Integer> sacar(Integer valor) {

        List<Integer> valores = new ArrayList<>();
        while (valor > 0){
            if (valor % 50 == 0){
                valores.add(50);
                valor -= 50;
            }
            if (valor % 20 == 0){
                valores.add(20);
                valor -= 20;
            }

        }
        return valores;
    }
}
