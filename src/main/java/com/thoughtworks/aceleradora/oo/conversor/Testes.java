package com.thoughtworks.aceleradora.oo.conversor;

import java.util.Scanner;

public class Testes {

    public static void main(String[] args) {
        Scanner leitora = new Scanner(System.in);
        InterpretadorDeEntrada interpretadorDeEntrada = new InterpretadorDeEntrada();
        Validador validador = new Validador();
        CalculadoraDeCambio calculadora = new CalculadoraDeCambio();

        System.out.print("> ");
        String entrada = leitora.nextLine();

        System.out.println("Teste extrair moeda de entrada: ");
        String moedaInicial = interpretadorDeEntrada.extrairMoedaInicial(entrada);
        System.out.println(moedaInicial);

        System.out.println("Teste extrair valor:");
        Double valor = interpretadorDeEntrada.extrairValor(entrada);
        System.out.println(valor);

        System.out.println("Teste extrair moeda de saida: ");
        String moedaFinal = interpretadorDeEntrada.extrairMoedaFinal(entrada);
        System.out.println(moedaFinal);

        Boolean validacao = validador.validarMoedaInicial(moedaInicial);
        Boolean validacaoFinal = validador.validarMoedaFinal(moedaFinal);

        if (!validacao){
            System.out.println("Moeda não suportada: " + moedaInicial);
        }
        else if(!validacaoFinal){
            System.out.println("Moeda não suportada: " + moedaFinal);
        }
        else {

            System.out.println("Teste detectar moeda para conversão: ");
            String moedaParaConversao = interpretadorDeEntrada.detectarMoedasParaConversao(moedaInicial, moedaFinal);
            System.out.println(moedaParaConversao);

            System.out.println("Teste detectar taxa de conversão: ");
            Double taxaDeConversão = calculadora.determinarTaxaDeCambio(moedaParaConversao);
            System.out.println(taxaDeConversão);

            System.out.println("Teste do cálculo de câmbio: ");
            Double resultado = calculadora.converterMoedas(taxaDeConversão, valor);
            System.out.println(resultado);

            System.out.println("Teste final: ");
            String finalzao = moedaFinal + resultado;
            System.out.println(finalzao);
        }
    }
}
