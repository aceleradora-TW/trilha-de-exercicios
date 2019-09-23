package com.thoughtworks.aceleradora.oo.carros;

public class CriadorDeCarro {

    public Carro criaUmCarro() {
        Carro carrinho = new Carro();

        carrinho.setMarca("Ford");
        carrinho.setModelo("Mustang");
        carrinho.setAno(2017);

        return carrinho;
    }
}
