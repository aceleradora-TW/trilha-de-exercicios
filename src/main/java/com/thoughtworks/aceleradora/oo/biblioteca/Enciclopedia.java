package com.thoughtworks.aceleradora.oo.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Enciclopedia {

    private List<Livro> livros = new ArrayList<>();

    public Enciclopedia() {
        Livro livro0 = new Livro();
        Autor autor0 = new Autor("Chimamanda", "Adichie");
        livro0.setAutores(autor0);
        livro0.setTitulo("Sejamos todos feministas");
        livro0.setAnoDeLancamento(2014);
        livro0.setFormatos(Formato.EBOOK);
        livros.add(livro0);

        Livro livro1 = new Livro();
        Autor autor1 = new Autor("Alejandro", "Olchik");
        livro1.setAutores(autor1);
        livro1.setTitulo("Management 3.0");
        livro1.setAnoDeLancamento(2017);
        livro1.setFormatos(Formato.FISICO);
        livro1.setFormatos(Formato.PDF);
        livros.add(livro1);

        Livro livro2 = new Livro();
        Autor autor2 = new Autor("George", "Orwell");
        livro2.setAutores(autor2);
        livro2.setTitulo("1984");
        livro2.setAnoDeLancamento(1948);
        livro2.setFormatos(Formato.EBOOK);
        livro2.setFormatos(Formato.FISICO);
        livro2.setFormatos(Formato.PDF);
        livros.add(livro2);

        Livro livro3 = new Livro();
        Autor autor3 = new Autor("Julia" , "Naomi");
        livro3.setAutores(autor3);
        livro3.setTitulo("Lean Game Development");
        livro3.setAnoDeLancamento(2017);
        livro3.setFormatos(Formato.EBOOK);
        livro3.setFormatos(Formato.PDF);
        livros.add(livro3);

        Livro livro4 = new Livro();
        Autor autor4 = new Autor("Eduardo", "Galeano");
        livro4.setAutores(autor4);
        livro4.setTitulo("Las venas abiertas de Latinoamerica");
        livro4.setAnoDeLancamento(1971);
        livro4.setFormatos(Formato.EBOOK);
        livro4.setFormatos(Formato.PDF);
        livro4.setFormatos(Formato.FISICO);
        livros.add(livro4);

        Livro livro5 = new Livro();
        Autor autor5 = new Autor("Kathy" , "Sierra");
        Autor autor51 = new Autor("Elizabeth" , "Freeman");
        livro5.setAutores(autor51);
        livro5.setAutores(autor5);
        livro5.setTitulo("Use a cabeça: Padrões de projeto");
        livro5.setAnoDeLancamento(2004);
        livro5.setFormatos(Formato.PDF);
        livro5.setFormatos(Formato.FISICO);
        livros.add(livro5);

        Livro livro6 = new Livro();
        livro6.setAutores(autor0);
        livro6.setTitulo("Americanah");
        livro6.setAnoDeLancamento(2013);
        livro6.setFormatos(Formato.FISICO);
        livro6.setFormatos(Formato.PDF);
        livro6.setFormatos(Formato.EBOOK);
        livros.add(livro6);


    }

    /*
    * O livro "6" foi escrito por "Chimamanda Adichie", seu título é "Americanah" e foi lançado em "2013". O livro está disponível nos formatos "EBOOK, PDF, FISICO"
    */

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
