package com.thoughtworks.aceleradora.logica;

import java.util.ArrayList;
import java.util.List;

public class CaixaEletronico {

    public List<Integer> sacar(Integer valor) {
        int c;
        List<Integer> valores = new ArrayList<>();

        //valores.add(5);

        //valores.get(0);

        try {
            if(valor >=50 && ((valor%50)%2) == 0) {
                c = (valor/50)/10;
                while(c>=0){
                    valores.add(50);
                    c--;
                }
            } else {
                c = (valor/20)/10;
                while(c>=0) {
                    valores.add(20);
                    c--;
                }
            }
        } catch(Exception IOException) {
            System.out.println("Valor inválido.");
        }
        return valores;
    }
}
