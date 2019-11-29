package com.thoughtworks.aceleradora.oo.conversor;

public class Conversor {

    InterpretadorDeEntrada interpretadorDeEntrada;
    Validador validador;
    TaxaDeCambio taxaDeCambio;
    CalculadoraDeCambio calculadoraDeCambio;

    String moedaInicial;
    String moedaFinal;
    Double valor;
    Double taxaDeCambioAtual;
    Double resultado;
    String moedaParaConversao;
    Boolean validacaoMoedaInicial;
    Boolean validacaoMoedaFinal;

    public Conversor(InterpretadorDeEntrada interpretadorDeEntrada, Validador validador, TaxaDeCambio taxaDeCambio){
        this.interpretadorDeEntrada = interpretadorDeEntrada;
        this.validador = validador;
        this.taxaDeCambio = taxaDeCambio;
    }

    public void extraiParametrosEValor(String entrada){
        moedaInicial = interpretadorDeEntrada.extrairMoedaInicial(entrada);
        moedaFinal = interpretadorDeEntrada.extrairMoedaFinal(entrada);
        valor = interpretadorDeEntrada.extrairValor(entrada);
        moedaParaConversao = interpretadorDeEntrada.detectarMoedasParaConversao(moedaInicial, moedaFinal);
    }

    public String converter(String entrada) {
        validacaoMoedaInicial = validador.validarMoedaInicial(moedaInicial);
        validacaoMoedaFinal = validador.validarMoedaFinal(moedaFinal);

        if (validacaoMoedaInicial == false){
            return "Moeda nao suportada: " + moedaInicial;
        }
        if (validacaoMoedaFinal == false){
            return "Moeda nao suportada: " + moedaFinal;
        }
        else{
            taxaDeCambioAtual = calculadoraDeCambio.determinarTaxaDeCambio(moedaParaConversao);
            resultado = calculadoraDeCambio.converterMoedas(taxaDeCambioAtual, valor);
            return moedaFinal + resultado;
        }
    }
}

