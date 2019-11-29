package com.thoughtworks.aceleradora.oo.conversor;

public class Conversor {

    InterpretadorDeEntrada interpretadorDeEntrada = new InterpretadorDeEntrada();
    Validador validador = new Validador();
    CalculadoraDeCambio calculadoraDeCambio = new CalculadoraDeCambio();

    String moedaInicial;
    String moedaFinal;
    Double valor;
    Double taxaDeCambioAtual;
    Double resultado;
    String moedaParaConversao;
    Boolean validacaoMoedaInicial;
    Boolean validacaoMoedaFinal;

    public Conversor(){
    }

    public void extraiParametrosEValor(String entrada){
        moedaInicial = interpretadorDeEntrada.extrairMoedaInicial(entrada);
        moedaFinal = interpretadorDeEntrada.extrairMoedaFinal(entrada);
        valor = interpretadorDeEntrada.extrairValor(entrada);
        moedaParaConversao = interpretadorDeEntrada.detectarMoedasParaConversao(moedaInicial, moedaFinal);
    }

    public String converter(String entrada) {
        extraiParametrosEValor(entrada);

        validacaoMoedaInicial = validador.validarMoedaInicial(moedaInicial);
        validacaoMoedaFinal = validador.validarMoedaFinal(moedaFinal);

        if (!validacaoMoedaInicial){
            return "Moeda nao suportada: " + moedaInicial;
        }
        if (!validacaoMoedaFinal){
            return "Moeda nao suportada: " + moedaFinal;
        }
        else{
            calculadoraDeCambio.determinarTaxaDeCambio(moedaParaConversao);
            taxaDeCambioAtual = calculadoraDeCambio.determinarTaxaDeCambio(moedaParaConversao);
            resultado = calculadoraDeCambio.converterMoedas(taxaDeCambioAtual, valor);
            return moedaFinal + resultado;
        }
    }
}

