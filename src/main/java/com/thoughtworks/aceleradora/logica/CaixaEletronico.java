package com.thoughtworks.aceleradora.logica;

import java.util.ArrayList;
import java.util.List;

public class CaixaEletronico {

    public static void main(String[] args) {

        new CaixaEletronico().sacar(140);

    }

    public List<Integer> sacar(Integer valor) {
        int resto50 = valor % 50;
        Integer soma = 0;
        Integer total = valor;

        List<Integer> valores = new ArrayList<>();


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

        for(int i=0; i < valores.size(); i++){
            soma += valores.get(i);
        }

        if(!soma.equals(total)) throw new IllegalArgumentException("Valor invalido");

        return valores;

    }
}
