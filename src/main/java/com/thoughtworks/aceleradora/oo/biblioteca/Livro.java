package com.thoughtworks.aceleradora.oo.biblioteca;

import org.flywaydb.core.internal.util.AbbreviationUtils;

import javax.swing.undo.AbstractUndoableEdit;
import java.util.ArrayList;
import java.util.List;

public class Livro {
//   private final Object Autor;

//    ## Instancie as listas de formato e autoras da classe Livro
//
//    Um livro pode possuir diversos formatos e autores. Para representar estas informações, a classe possui uma lista que
//    armazena as autoras e outra que armazena os formatos do livro. Estas listas devem ser instanciadas no momento de criação
//    dos objetos do tipo livro. Podemos utilizar o construtor da classe para fazer isso no momento certo.

    private String titulo;
    private int anoDeLancamento;
    private List<Autor> autores;
    private List<Formato> formatos;

    public Livro() {
        // instancie as listas de formatos e autores aqui
        autores = new ArrayList<Autor>();
        formatos = new ArrayList<Formato>();
    }

    public void adicionarFormato(Formato formato) {
        formatos.add(formato);
    }

    public void adicionarAutor(Autor autor) {
        autores.add(autor);
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

    public void setAutores(List<Autor> autores) {
        this.autores = autores;
    }

    public List<Formato> getFormatos() {
        return formatos;
    }

    public void setFormatos(List<Formato> formatos) {
        this.formatos = formatos;
    }

    //public static void main(String[] args) {
    //    Livro book = new Livro("Uma vida sem mel",2019,"Francisco", Formato.EBOOK);
    //    System.out.println(book);
    //}
}
