package com.thoughtworks.aceleradora.logica;

import java.util.ArrayList;
import java.util.List;

public class CaixaEletronico {


    public List<Integer> sacar(Integer valor) {
        int resto50 = valor % 50;

        List<Integer> valores = new ArrayList<>();

     //   try{

            if(valor < 20) throw new IllegalArgumentException("Valor invalido");

            if (resto50 == 0) {
                while(valor >= 50) {
                    valores.add(50);
                    valor -= 50;
                }

            } else if (resto50 == 10){
                for (int i = 1; i < (valor / 50); i++) {
                    valores.add(50);
                    valor -= 50;
                }

                while(valor >=20) {
                    valores.add(20);
                    valor -= 20;
                }
            }

            else if (resto50 % 20 != 0) {
                while(valor >=20) {
                    valores.add(20);
                    valor -= 20;
                }

             }

            else if(resto50 % 20 == 0){
                while(valor >= 50) {
                    valores.add(50);
                    valor -= 50;
                }

                while(valor >=20) {
                    valores.add(20);
                    valor -= 20;
                }
            }

        return valores;

    }
}
