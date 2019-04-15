package com.thoughtworks.aceleradora.oo.biblioteca;

public enum Formato {

    FISICO ("F"),
    PDF ("P"),
    EBOOK ("E");

    public final String codigoFormato;

    Formato(String codigoFormato) {
        this.codigoFormato = codigoFormato;
    }

    public String getCodigoFormato() {
        return codigoFormato;
    }
}
