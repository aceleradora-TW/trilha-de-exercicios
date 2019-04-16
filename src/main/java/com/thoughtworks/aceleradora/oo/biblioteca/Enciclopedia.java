package com.thoughtworks.aceleradora.oo.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Enciclopedia {

    private List<Livro> livros = new ArrayList<>();


    public Enciclopedia() {
        Livro livro0 = new Livro();
        Autor autor0 = new Autor("Chimamanda", "Adichie");
        Formato formato0 = Formato.EBOOK;

        livro0.adicionarAutor(autor0);
        livro0.setTitulo("Sejamos todos feministas");
        livro0.setAnoDeLancamento(2014);
        livro0.adicionarFormato(formato0);

        livros.add(livro0);

        Livro livro1 = new Livro();
        Autor autor1 = new Autor("Alejandro", "Olchik");


        livro1.adicionarAutor(autor1);
        livro1.setTitulo("Management 3.0");
        livro1.setAnoDeLancamento(2017);
        livro1.adicionarFormato(Formato.PDF);
        livro1.adicionarFormato(Formato.FISICO);

        livros.add(livro1);

        Livro livro2 = new Livro();
        Autor autor2 = new Autor("George", "Orwell");


        livro2.adicionarAutor(autor2);
        livro2.setTitulo("1984");
        livro2.setAnoDeLancamento(1948);
        livro2.adicionarFormato(Formato.PDF);
        livro2.adicionarFormato(Formato.FISICO);
        livro2.adicionarFormato(Formato.EBOOK);

        livros.add(livro2);

        Livro livro3 = new Livro();
        Autor autor3 = new Autor("Julia", "Naomi");

        livro3.adicionarAutor(autor3);
        livro3.setTitulo("Lean Game Development");
        livro3.setAnoDeLancamento(2017);
        livro3.adicionarFormato(Formato.PDF);
        livro3.adicionarFormato(Formato.EBOOK);

        livros.add(livro3);

        Livro livro4 = new Livro();
        Autor autor4 = new Autor("Eduardo", "Galeano");


        livro4.adicionarAutor(autor4);
        livro4.setTitulo("Las venas abiertas de Latinoamerica");
        livro4.setAnoDeLancamento(1971);
        livro4.adicionarFormato(Formato.FISICO);
        livro4.adicionarFormato(Formato.PDF);
        livro4.adicionarFormato(Formato.EBOOK);
        livros.add(livro4);

        Livro livro5 = new Livro();
        Autor autor5 = new Autor("Kathy", "Sierra");
        Autor autor51 = new Autor("Elizabeth", "Freeman");



        livro5.adicionarAutor(autor5);
        livro5.adicionarAutor(autor51);
        livro5.setTitulo("Use a cabeça: Padrões de projeto");
        livro5.setAnoDeLancamento(2004);
        livro5.adicionarFormato(Formato.FISICO);
        livro5.adicionarFormato(Formato.PDF);

        livros.add(livro5);

        Livro livro6 = new Livro();
        Autor autor6 = new Autor("Chimamanda", "Adichie");


        livro6.adicionarAutor(autor6);
        livro6.setTitulo("Americanah");
        livro6.setAnoDeLancamento(2013);
        livro6.adicionarFormato(Formato.EBOOK);
        livro6.adicionarFormato(Formato.PDF);
        livro6.adicionarFormato(Formato.FISICO);

        livros.add(livro6);

    }

    public String tituloDoEnesimoLivro(int posicao) {

        return livros.get(posicao).getTitulo();

    }

    public List<Livro> livrosDisponiveisEmPdf(Livro livro) {
        List<Livro> livros = new ArrayList<>();
       for (int i = 0; i < livros.size(); i++) {
            if (livro.getFormatos().equals("PDF")) {
                livros.add(livro);
            }

        }
        return livros;
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

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    @Override
    public String toString() {
        String livrosNaEnciclopedia = "";
        System.out.println("Enciclopedia{");
        for(Livro livro: livros) {
            livrosNaEnciclopedia += "Titulo: " + livro.getTitulo() +  "\n" +
                                    "Autor(es): " + livro.getAutores() +  "\n" +
                                    "Ano: " + livro.getAnoDeLancamento() +  "\t" +
                                    "Formato(s): " + livro.getFormatos() +  "\n";
            livrosNaEnciclopedia += "\n";
        }
        return livrosNaEnciclopedia + "}";
    }
}
