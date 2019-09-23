package com.thoughtworks.aceleradora.logica;

import java.util.Objects;

public class TradutorFizzBuzz {

    String traduz(int numero) {

        if (numero % 3 == 0 && numero % 5 == 0) {
            return "FizzBuzz";
        }
        if (numero % 3 == 0){
            return "Fizz";
        }
        if (numero % 5 == 0){
            return "Buzz";
        }

         String outroNumero = Objects.toString(numero);
        return outroNumero;
    }

}
