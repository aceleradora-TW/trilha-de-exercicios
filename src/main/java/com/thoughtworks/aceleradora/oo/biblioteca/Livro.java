package com.thoughtworks.aceleradora.oo.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Livro {

    private String titulo;
    private int anoDeLancamento;
    private List<Autor> autores;
    private List<Formato> formatos;

    public Livro() {
        List<Autor> listaAutores = new ArrayList<>();
        List<Formato> listaFormatos = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public List<Formato> getFormatos() {
        return formatos;
    }

    public void adicionarFormato(Formato formato) {
        this.formatos.add(formato);
    }

    public void adicionarAutor(Autor autor) {
        this.autores.add(autor);
    }
}
