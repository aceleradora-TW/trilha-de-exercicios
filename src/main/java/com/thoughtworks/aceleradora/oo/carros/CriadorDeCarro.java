package com.thoughtworks.aceleradora.oo.carros;

public class CriadorDeCarro {
/*
  * A marca do carro deve ser "Ford"
  * O modelo do carro deve ser "Mustang"
  * O ano do carro deve ser "2017"*/
    public Carro criaUmCarro() {

        Carro ford = new Carro();
        ford.setAno(2017);
        ford.setMarca("Ford");
        ford.setModelo("Mustang");

        return ford;
    }
}
