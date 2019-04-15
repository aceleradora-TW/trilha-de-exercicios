package com.thoughtworks.aceleradora.oo.biblioteca;

import java.text.Normalizer;
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
        /*
        Livro livro1 = new Livro();
        Autor autor1 = new Autor("Alejandro", "Olchik");
        Formato formato1 = Formato.FISICO;
        Formato formato11 = Formato.PDF;

        livro1.adicionarAutor(autor1);
        livro1.setTitulo("Management 3.0");
        livro1.setAnoDeLancamento(2017);
        livro1.adicionarFormato(formato1);
        livro1.adicionarFormato(formato11);

        Livro livro2 = new Livro();
        Autor autor2 = new Autor("George", "Orwell");
        Formato formato2 = Formato.EBOOK;
        Formato formato21 = Formato.PDF;
        Formato formato22 = Formato.FISICO;

        livro2.adicionarAutor(autor2);
        livro2.setTitulo("1984");
        livro2.setAnoDeLancamento(1948);
        livro2.adicionarFormato(formato2);
        livro2.adicionarFormato(formato21);
        livro2.adicionarFormato(formato22);

        Livro livro3 = new Livro();
        Autor autor3 = new Autor("Julia", "Naomi");
        Formato formato3 = Formato.EBOOK;
        Formato formato31 = Formato.PDF;

        livro3.adicionarAutor(autor3);
        livro3.setTitulo("Lean Game Development");
        livro3.setAnoDeLancamento(2017);
        livro3.adicionarFormato(formato3);
        livro3.adicionarFormato(formato31);

        Livro livro4 = new Livro();
        Autor autor4 = new Autor("Eduardo", "Galeano");
        Formato formato4 = Formato.EBOOK;
        Formato formato41 = Formato.PDF;
        Formato formato42 = Formato.FISICO;


        livro4.adicionarAutor(autor4);
        livro4.setTitulo("Las venas abiertas de Latinoamerica");
        livro4.setAnoDeLancamento(1971);
        livro4.adicionarFormato(formato4);
        livro4.adicionarFormato(formato41);
        livro4.adicionarFormato(formato42);

        Livro livro5 = new Livro();
        Autor autor5 = new Autor("Kathy", "Sierra");
        Autor autor51 = new Autor("Elizabeth", "Freeman");
        Formato formato5 = Formato.PDF;
        Formato formato51 = Formato.FISICO;


        livro5.adicionarAutor(autor5);
        livro5.adicionarAutor(autor51);
        livro5.setTitulo("Use a cabeça: Padrões de projeto");
        livro5.setAnoDeLancamento(2004);
        livro5.adicionarFormato(formato5);
        livro5.adicionarFormato(formato51);

        Livro livro6 = new Livro();
        Autor autor6 = new Autor("Chimamanda", "Adichie");
        Formato formato6 = Formato.EBOOK;

        livro6.adicionarAutor(autor6);
        livro6.setTitulo("Americanah");
        livro6.setAnoDeLancamento(2006);
        livro6.adicionarFormato(formato6);

         */


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
