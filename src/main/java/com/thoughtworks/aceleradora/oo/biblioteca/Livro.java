package com.thoughtworks.aceleradora.oo.biblioteca;

import java.util.List;

import static java.util.Arrays.asList;

public class Livro {
    List<formatos> Formatos = new ArrayList<formatos>();
    List<autores> Autores = new ArrayList<autores>();

    private String formatos;
    private String autores;


    public Livro livro(,) {
            this.formatos = asList(Formatos);
            this.autores = asList(Autores);
        }

    public List<Formatos> getFormatos() {
        return formatos;
    }

    public void setFormatos(List<Formatos> formatos) {
        this.formatos = formatos;
    }

    public List<Autores> getAutores() {
        return autores;
    }

    public void setAutores(List<Autores> autores) {
        this.autores = autores;
    }
}
