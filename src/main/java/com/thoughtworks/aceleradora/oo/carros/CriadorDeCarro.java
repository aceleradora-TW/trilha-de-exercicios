package com.thoughtworks.aceleradora.oo.carros;



public class CriadorDeCarro {

    public Carro criaUmCarro() {


        Carro carro = new Carro(); //"Ford","Mustang", 2017

        carro.setModelo("Mustang");
        carro.setMarca("Ford");
        carro.setAno(2017);

        return carro;
    }
}
