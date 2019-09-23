package com.thoughtworks.aceleradora.logica;

public class IdentificadorDeArmstrong {

    public String identificaNumero(int numero) {

        String vet[] = Integer.toString(numero).split("");
        int potencia = vet.length;
        int soma = 0;

        for (int i = 0; i < vet.length;i++) {
            double convPot = Math.pow(Integer.parseInt(vet[i]),potencia);
            soma += convPot;
        }

        if (soma == numero) {
            return "Este eh um numero de Armstrong!";
        }

        return "Este nao eh um numero de Armstrong!";
    }
}
