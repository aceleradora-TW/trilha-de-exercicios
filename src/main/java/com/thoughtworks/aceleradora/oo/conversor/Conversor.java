package com.thoughtworks.aceleradora.oo.conversor;

public class Conversor {

    public String converter(String entrada) {
        int i=0;


        String resposta = null;

        String moedaAtual = entrada.substring(0,3);
        String moedaFinal = entrada.substring(entrada.length()-3);
        float valor = Integer.parseInt(entrada.substring(3,entrada.length()-4));

        String cambio = moedaAtual +""+ moedaFinal;

        if(!(moedaAtual.equals("BRL")) && !(moedaAtual.equals("EUR")) && !(moedaAtual.equals("CLP")))
            return "Moeda nao suportada: "+moedaAtual;

        if(!(moedaFinal.equals("BRL")) && !(moedaFinal.equals("EUR")) && !(moedaFinal.equals("CLP")))
            return "Moeda nao suportada: "+moedaFinal;


        switch (cambio){

            case "BRLCLP":
                resposta =  moedaFinal + (valor * 175.65);
                break;

            case "BRLEUR":
                resposta =  moedaFinal + (valor * 0.23);
                break;

            case "CLPBRL":
                resposta =  moedaFinal + (valor * 0.0057);
                break;

            case "CLPEUR":
                resposta =  moedaFinal + (valor * 0.0013);
                break;

            case "EURBRL":
                resposta =  moedaFinal + (valor * 4.29);
                break;

            case "EURCLP":
                resposta =  moedaFinal + (valor * 754.01);
                break;

            default:
                //resposta = "Moeda nao suportada: ";
                break;
        }

        if (resposta.substring(resposta.length()-2,resposta.length()).equals(".0")) {
            return resposta.substring(0,resposta.length()-2);
        }


        return resposta;
    }
}
