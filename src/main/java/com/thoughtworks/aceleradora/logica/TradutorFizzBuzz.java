package com.thoughtworks.aceleradora.logica;

public class TradutorFizzBuzz {

    String traduz(int numero) {



        if (numero %5 == 0 && numero%3 == 0) {
            System.out.println("o número eh divisivel por 3 e 5");
            return "FizzBuzz";
        }
        if (numero % 3 == 0){
            System.out.println("o número eh divisivel por 3");
            return "Fizz";
        }
        if (numero %5 == 0){
            System.out.println("o número eh divisivel por 5");
            return "Buzz";
        }
        else {
            String outroNumero = String.valueOf(numero);
            return outroNumero;
        }
    }
}
