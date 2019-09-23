package com.thoughtworks.aceleradora.oo.biblioteca;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.List;

public class Enciclopedia {

    private List<Livro> livros = new ArrayList<>();

    public Enciclopedia() {

        Livro livro0 = new Livro();
        Autor autor0 = new Autor("Chimamanda", "Adichie");
        livro0.adicionarAutor(autor0);
        livro0.setTitulo("Sejamos tooos feministas");
        livro0.setAnoDeLancamento(2014);
        livro0.adicionarFormato(Formato.EBOOK);

        Livro livro1 = new Livro();
        Autor autor1 = new Autor("Alejandro", "Olchik");
        livro1.adicionarAutor(autor1);
        livro1.setTitulo("Management 3.0");
        livro1.setAnoDeLancamento(2017);
        livro1.adicionarFormato(Formato.PDF);
        livro1.adicionarFormato(Formato.FISICO);

    }

    public String tituloDoEnesimoLivro(int posicao) {
        return null;
    }

    public List<Livro> livrosDisponiveisEmPdf() {
        return null;
    }

    public List<Livro> buscaPorAutora(String nomeCompleto) {
        return null;
    }

    public List<Livro> buscaPorAnoDeLancamento(int ano) {
        return null;
    }

    public List<Livro> buscaPorPeriodoDeLancamento(int inicio, int fim) {
        return null;
    }

}
