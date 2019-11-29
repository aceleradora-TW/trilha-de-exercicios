package com.thoughtworks.aceleradora.oo.conversor;

import java.util.Scanner;

public class Testes {

    public static void main(String[] args) {
        Scanner leitora = new Scanner(System.in);
        InterpretadorDeEntrada interpretadorDeEntrada = new InterpretadorDeEntrada();
        Validador validador = new Validador();

        System.out.print("> ");
        String entrada = leitora.nextLine();

        System.out.println("Teste extrair moeda de entrada: ");
        String moedaInicial= interpretadorDeEntrada.extrairMoedaInicial(entrada);
        System.out.println(moedaInicial);

        System.out.println("Teste extrair valor:");
        Double valor = interpretadorDeEntrada.extrairValor(entrada);
        System.out.println(valor);

        System.out.println("Teste extrair moeda de saida: ");
        String moedaFinal = interpretadorDeEntrada.extrairMoedaFinal(entrada);
        System.out.println(moedaFinal);

        System.out.println("Teste detectar moeda para conversão: ");
        String moedaParaConversao = interpretadorDeEntrada.detectarMoedasParaConversao(moedaInicial, moedaFinal);
        System.out.println(moedaParaConversao);
    }
}
