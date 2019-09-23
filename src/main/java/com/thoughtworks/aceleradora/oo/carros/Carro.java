package com.thoughtworks.aceleradora.oo.carros;

public class Carro {
    private String modelo;
    private String marca;
    private int ano;

    public String getModelo(){
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public int getAno(){
        return ano;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;

    }

    public void setMarca(String marca){
        this.marca = marca;

    }

    public void setAno(int ano ){
        this.ano = ano;
    }

}
