package com.thoughtworks.aceleradora.oo.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Livro {

    private String titulo;
    private int anoDeLancamento;
    private List<Autor> autores;
    private List<Formato> formatos;

    public Livro() {

         formatos = new ArrayList<>();
         autores = new ArrayList<>();
    }

    public void adicionarFormato(Formato formato) {
        formatos.add(formato);
    }

    public void adicionarAutor(Autor autor) {
        autores.add(autor);
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public int getAnoDeLancamento(){
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento){
        this.anoDeLancamento = anoDeLancamento;
    }

    public List<Autor> getAutores(){
        return autores;
    }

    public void setAutores(List<Autor> autores){
        this.autores = autores;
    }

    public List<Formato> getFormatos(){
        return formatos;
    }

    public void setFormatos(List<Formato> formatos){
        this.formatos = formatos;
    }



}

