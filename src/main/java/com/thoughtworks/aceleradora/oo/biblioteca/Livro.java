package com.thoughtworks.aceleradora.oo.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Livro {

    private String titulo;
    private int anoDeLancamento;
    private List<Autor> autores;
    private List<Formato> formatos;

    public Livro() {
        autores=new ArrayList<>();
        formatos=new ArrayList<>();

    }
    public String getTitulo(){
        return titulo;
    }
    public int getAnoDeLancamento(){
        return anoDeLancamento;
    }
    public List<Autor> getAutores(){
        return autores;
    }
    public List<Formato> getFormatos(){
        return formatos;
    }

    public void adicionarFormato(Formato formato) {
    }

    public void adicionarAutor(Autor autor) {
    }
}
