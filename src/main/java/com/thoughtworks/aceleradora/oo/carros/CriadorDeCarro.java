package com.thoughtworks.aceleradora.oo.carros;

public class CriadorDeCarro {

    public Carro criaUmCarro() {
        Carro carro = new Carro();

        carro.setMarca("Ford");
        carro.setModelo("Mustang");
        carro.setAno(2017);

        return carro;
    }
}
