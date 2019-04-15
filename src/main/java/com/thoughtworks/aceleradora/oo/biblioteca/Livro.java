package com.thoughtworks.aceleradora.oo.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Livro {

    private String titulo;
    private int anoDeLancamento;
    private List<Autor> autores;
    private List<Formato> formatos;

    public Livro() {

        autores = new ArrayList<>();
        formatos = new ArrayList<>();
        // instancie as listas de formatos e autores aqui
    }

    public String getTitulo(){
        return titulo;
    }

    public int getAnoDeLancamento(){
        return anoDeLancamento;
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public List<Formato> getFormatos(){
        return formatos;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setAnoDeLancamento(int anoDeLancamento){
        this.anoDeLancamento = anoDeLancamento;
    }

    public void adicionarFormato(Formato formato) {
        formatos.add(0, formato);
    }

    public void adicionarAutor(Autor autor) {
        autores.add(0, autor);
    }




}
