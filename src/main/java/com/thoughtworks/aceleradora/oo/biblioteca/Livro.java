package com.thoughtworks.aceleradora.oo.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Livro {

    private String titulo;
    private int anoDeLancamento;
    private List<Autor> autores;
    private List<Formato> formatos;

    public Livro() {
        // instancie as listas de formatos e autores aqui
        autores = new ArrayList<>();
        formatos = new ArrayList<>();

    }

    public List<Autor> getAutores() {
        return autores;
    }

    public List<Formato> getFormatos() {
        return formatos;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void adicionarFormato(Formato formato) {
        formatos.add(formato);
    }

    public void adicionarAutor(Autor autor) {
        autores.add(autor);
    }
}

