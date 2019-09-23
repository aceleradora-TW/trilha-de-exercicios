package com.thoughtworks.aceleradora.oo.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Enciclopedia {

    private List<Livro> livros = new ArrayList<>();

    public Enciclopedia() {

        Livro livro = new Livro();
        Autor autor = new Autor("Chimamanda", "Adichie");

        livro.adicionarAutor(autor);
        livro.setTitulo("Sejamos todos feministas");
        livro.setAnoDeLancamento(2014);
        livro.adicionarFormato(Formato.EBOOK);
        livros.add(livro);

        livro = new Livro();
        autor = new Autor("Alejandro", "Olchik");

        livro.adicionarAutor(autor);
        livro.setTitulo("Management 3.0");
        livro.setAnoDeLancamento(2017);
        livro.adicionarFormato(Formato.PDF);
        livro.adicionarFormato(Formato.FISICO);
        livros.add(livro);

        livro = new Livro();
        autor = new Autor("George", "Orwell");

        livro.adicionarAutor(autor);
        livro.setTitulo("1984");
        livro.setAnoDeLancamento(1948);
        livro.adicionarFormato(Formato.PDF);
        livro.adicionarFormato(Formato.FISICO);
        livro.adicionarFormato(Formato.EBOOK);
        livros.add(livro);

        livro = new Livro();
        autor = new Autor("Julia", "Naomi");

        livro.adicionarAutor(autor);
        livro.setTitulo("Lean Game Development");
        livro.setAnoDeLancamento(2017);
        livro.adicionarFormato(Formato.PDF);
        livro.adicionarFormato(Formato.EBOOK);
        livros.add(livro);

        livro = new Livro();
        autor = new Autor("Eduardo", "Galeano");

        livro.adicionarAutor(autor);
        livro.setTitulo("Las venas abiertas de Latinoamerica");
        livro.setAnoDeLancamento(1971);
        livro.adicionarFormato(Formato.FISICO);
        livro.adicionarFormato(Formato.PDF);
        livro.adicionarFormato(Formato.EBOOK);
        livros.add(livro);

        livro = new Livro();
        autor = new Autor("Kathy", "Sierra");

        livro.adicionarAutor(autor);
        autor = new Autor("Elizabeth","Freeman");

        livro.adicionarAutor(autor);

        livro.setTitulo("Use a cabeça: Padrões de projeto");
        livro.setAnoDeLancamento(2004);
        livro.adicionarFormato(Formato.FISICO);
        livro.adicionarFormato(Formato.PDF);
        livros.add(livro);

        livro = new Livro();
        autor = new Autor("Chimamanda", "Adichie");

        livro.adicionarAutor(autor);
        livro.setTitulo("Americanah");
        livro.setAnoDeLancamento(2013);
        livro.adicionarFormato(Formato.EBOOK);
        livro.adicionarFormato(Formato.PDF);
        livro.adicionarFormato(Formato.FISICO);
        livros.add(livro);

    }

    public String tituloDoEnesimoLivro(int posicao) {
        return livros.get(posicao).getTitulo();
    }

    public List<Livro> livrosDisponiveisEmPdf() {
        List<Livro> livrosEmPdf = new ArrayList<>();
        for (Livro livroAux: livros) {
            for (Formato formatoPdf: livroAux.getFormatos()) {
                if(formatoPdf.equals(Formato.PDF)){
                    livrosEmPdf.add(livroAux);
                }
            }
        }
        return livrosEmPdf;
    }

    public List<Livro> buscaPorAutora(String nomeCompleto) {
        List<Livro> listaChimamanda = new ArrayList<>();
        for (Livro livroAux: livros) {
            for (Autor autora: livroAux.getAutores()) {
                if(autora.toString().equals(nomeCompleto)){
                    listaChimamanda.add(livroAux);
                }
            }
        }
        return listaChimamanda;
    }

    public List<Livro> buscaPorAnoDeLancamento(int ano) {
        List<Livro> livrosPorAno = new ArrayList<>();
        for (Livro livroAux: livros) {
           if(livroAux.getAnoDeLancamento() == ano){
               livrosPorAno.add(livroAux);
           }
        }
        return livrosPorAno;
    }

    public List<Livro> buscaPorPeriodoDeLancamento(int inicio, int fim) {
        List<Livro> livrosPorPeriodo = new ArrayList<>();
        for (Livro livroAux: livros) {
            int anoLivro = livroAux.getAnoDeLancamento();
            if(anoLivro >= inicio && anoLivro <= fim){
                livrosPorPeriodo.add(livroAux);
            }
        }
        return livrosPorPeriodo;
    }
}
