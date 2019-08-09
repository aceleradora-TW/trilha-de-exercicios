package com.thoughtworks.aceleradora.oo.carros;

public class CriadorDeCarro {

    public Carro criaUmCarro() {
        Carro fusca = new Carro();

        fusca.setMarca("Ford");
        fusca.setModelo("Mustang");
        fusca.setAno(2017);
        return fusca;
    }
}
