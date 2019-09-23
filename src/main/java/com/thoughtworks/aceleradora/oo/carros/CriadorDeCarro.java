package com.thoughtworks.aceleradora.oo.carros;

public class CriadorDeCarro {

    public Carro criaUmCarro() {
        Carro umCarro = new Carro();
        umCarro.setModelo("Mustang");
        umCarro.setMarca("Ford");
        umCarro.setAno(2017);
        return umCarro;
    }
}
