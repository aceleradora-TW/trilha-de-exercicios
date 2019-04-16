package com.thoughtworks.aceleradora.oo.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Enciclopedia {

    private List<Livro> livros = new ArrayList<>();

    public Enciclopedia() {


        Livro livro0 = new Livro();
        Autor autor0 = new Autor();
        Formato formato0 = Formato.EBOOK;

        autor0.setNome("Chimamanda");
        autor0.setSobrenome("Adichie");
        livro0.setTitulo("Sejamos todos feministas");
        livro0.setAnoDeLancamento(2014);
        livro0.adicionarAutor(autor0);
        livro0.adicionarFormato(formato0);

        Livro livro1 = new Livro();
        Autor autor1 = new Autor();
        Formato formato1 = Formato.PDF;
        Formato formato01 = Formato.FISICO;

        autor1.setNome("Alejandro");
        autor1.setSobrenome("Olchik");
        livro1.setTitulo("Management 3.0");
        livro1.setAnoDeLancamento(2017);
        livro1.adicionarAutor(autor1);
        livro1.adicionarFormato(formato1);
        livro1.adicionarFormato(formato01);

        Livro livro2 = new Livro();
        Autor autor2 = new Autor();
        Formato formato2 = Formato.PDF;
        Formato formato02 = Formato.FISICO;
        Formato formato002 = Formato.EBOOK;

        autor2.setNome("George");
        autor2.setSobrenome("Orwell");
        livro2.setTitulo("1984");
        livro2.setAnoDeLancamento(1948);
        livro2.adicionarAutor(autor2);
        livro2.adicionarFormato(formato2);
        livro2.adicionarFormato(formato02);
        livro2.adicionarFormato(formato002);

        Livro livro3 = new Livro();
        Autor autor3 = new Autor();
        Formato formato3 = Formato.PDF;
        Formato formato03 = Formato.EBOOK;

        autor3.setNome("Julia");
        autor3.setSobrenome("Naomi");
        livro3.setTitulo("Lean Game Development");
        livro3.setAnoDeLancamento(2017);
        livro3.adicionarAutor(autor3);
        livro3.adicionarFormato(formato3);
        livro3.adicionarFormato(formato03);


        Livro livro4 = new Livro();
        Autor autor4 = new Autor();
        Formato formato4 = Formato.FISICO;
        Formato formato04 = Formato.PDF;
        Formato formato004= Formato.EBOOK;

        autor4.setNome("Eduardo");
        autor4.setSobrenome("Galeano");
        livro4.setTitulo("Las venas abiertas de Latinoamerica");
        livro4.setAnoDeLancamento(1971);
        livro4.adicionarAutor(autor4);
        livro4.adicionarFormato(formato4);
        livro4.adicionarFormato(formato04);
        livro4.adicionarFormato(formato004);


        Livro livro5 = new Livro();
        Autor autor5 = new Autor();
        Autor autor05 = new Autor();
        Formato formato5 = Formato.FISICO;
        Formato formato05 = Formato.PDF;

        autor5.setNome("Kathy ");
        autor5.setSobrenome("Sierra");
        autor05.setNome("Elizabeth");
        autor05.setSobrenome("Freeman");
        livro5.setTitulo("Use a cabeça: Padrões de projeto");
        livro5.setAnoDeLancamento(2004);
        livro5.adicionarAutor(autor5);
        livro5.adicionarAutor(autor05);
        livro5.adicionarFormato(formato5);
        livro5.adicionarFormato(formato05);


        Livro livro6 = new Livro();
        Autor autor6 = new Autor();
        Formato formato6 = Formato.FISICO;
        Formato formato06 = Formato.PDF;
        Formato formato006= Formato.EBOOK;

        autor6.setNome("Chimamanda");
        autor6.setSobrenome("Adichie");
        livro6.setTitulo("Americanah");
        livro6.setAnoDeLancamento(2013);
        livro6.adicionarAutor(autor6);
        livro6.adicionarFormato(formato6);
        livro6.adicionarFormato(formato06);
        livro6.adicionarFormato(formato006);


    }

    public String tituloDoEnesimoLivro(int posicao) {

        return livros.get(posicao).getTitulo();
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
