package com.thoughtworks.aceleradora.logica;

public class TradutorFizzBuzz {

    String traduz(int numero) {
        if(numero % 5 == 0 && numero % 3 == 0){
            return "FizzBuzz";
        }
        if(numero % 5 == 0){
            return "Buzz";
        }
        if(numero % 3 == 0){
            return "Fizz";
        }
      String numeroConvertido = String.valueOf(numero);
        return numeroConvertido;
    }
}
