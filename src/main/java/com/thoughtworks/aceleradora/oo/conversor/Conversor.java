package com.thoughtworks.aceleradora.oo.conversor;

public class Conversor {

    public String converter(String entrada) {

        String primeiraMoeda = entrada.substring(0, 3);
        String valor = entrada.substring(3, entrada.length()-4);
        String ultimaMoeda = entrada.substring(entrada.length()-3, entrada.length());
        double resultado = 0;


        switch (primeiraMoeda){

            case "BRL":
               if(ultimaMoeda.equals("CLP")) {
                   resultado = Integer.parseInt(valor)*175.65;
               } else if (ultimaMoeda.equals("EUR")){
                   resultado = Integer.parseInt(valor)*0.23;
            } break;

            case "CLP":
                if(ultimaMoeda.equals("BRL")){
                    resultado = Integer.parseInt(valor)*0.0057;
                } else if (ultimaMoeda.equals("EUR")){
                    resultado = Integer.parseInt(valor)*0.0013;
            } break;

            case "EUR":
                    if (ultimaMoeda.equals("BRL")) {
                        resultado = Integer.parseInt(valor)*4.29;
                    } else if (ultimaMoeda.equals("CLP")){
                        resultado = Integer.parseInt(valor)*754.01;
                    } break;
            default:break;

        }

       return (ultimaMoeda + valor);
    }
}
