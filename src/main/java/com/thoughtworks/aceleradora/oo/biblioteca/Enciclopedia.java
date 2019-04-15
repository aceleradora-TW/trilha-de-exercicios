package com.thoughtworks.aceleradora.oo.biblioteca;

import java.util.ArrayList;
import java.util.List;
/* O livro "0" foi escrito por "Chimamanda Adichie", seu título é "Sejamos todos feministas" e foi lançado em "2014". O livro está disponível nos formatos "EBOOK"
* O livro "1" foi escrito por "Alejandro Olchik", seu título é "Management 3.0" e foi lançado em "2017". O livro está disponível nos formatos "PDF, FISICO"
* O livro "2" foi escrito por "George Orwell", seu título é "1984" e foi lançado em "1948". O livro está disponível nos formatos "PDF, FISICO, EBOOK"
* O livro "3" foi escrito por "Julia Naomi", seu título é "Lean Game Development" e foi lançado em "2017". O livro está disponível nos formatos "PDF, EBOOK"
* O livro "4" foi escrito por "Eduardo Galeano", seu título é "Las venas abiertas de Latinoamerica" e foi lançado em "1971". O livro está disponível nos formatos "FISICO, PDF, EBOOK"
* O livro "5" foi escrito por "Kathy Sierra, Elizabeth Freeman", seu título é "Use a cabeça: Padrões de projeto" e foi lançado em "2004". O livro está disponível nos formatos "FISICO, PDF"
* O livro "6" foi escrito por "Chimamanda Adichie", seu título é "Americanah" e foi lançado em "2013". O livro está disponível nos formatos "EBOOK, PDF, FISICO"*/

public class Enciclopedia {

    private List<Livro> livros = new ArrayList<>();

    public Enciclopedia() {

        Livro livro0 = new Livro();
        livro0.setTitulo("Sejamos todos feministas");
        livro0.setAnoDeLancamento(2014);
        Autor autor0 = new Autor("Chimamanda", "Adichie");
        livro0.adicionarAutor(autor0);
        livro0.adicionarFormato(Formato.EBOOK);
        livros.add(livro0);

        Livro livro1 = new Livro();
        livro1.setTitulo("Management 3.0" );
        livro1.setAnoDeLancamento(2017);
        Autor autor1 = new Autor("Alejandro", "Olchik");
        livro1.adicionarAutor(autor1);
        livro1.adicionarFormato(Formato.PDF);
        livro1.adicionarFormato(Formato.FISICO);
        livros.add(livro1);

        Livro livro2 = new Livro();
        livro2.setTitulo("1984");
        livro2.setAnoDeLancamento(1948);
        Autor autor2 = new Autor("George", "Orwell");
        livro2.adicionarAutor(autor2);
        livro2.adicionarFormato(Formato.PDF);
        livro2.adicionarFormato(Formato.FISICO);
        livro2.adicionarFormato(Formato.EBOOK);
        livros.add(livro2);

        Livro livro3 = new Livro();
        livro3.setTitulo("Lean Game Development");
        livro3.setAnoDeLancamento(2017);
        Autor autor3 = new Autor("Julia", "Naomi");
        livro3.adicionarAutor(autor3);
        livro3.adicionarFormato(Formato.PDF);
        livro3.adicionarFormato(Formato.EBOOK);
        livros.add(livro3);

        Livro livro4 = new Livro();
        livro4.setTitulo("Las venas abiertas de Latinoamerica");
        livro4.setAnoDeLancamento(1971);
        Autor autor4 = new Autor("Eduardo", "Galeano");
        livro4.adicionarAutor(autor4);
        livro4.adicionarFormato(Formato.PDF);
        livro4.adicionarFormato(Formato.EBOOK);
        livro4.adicionarFormato(Formato.FISICO);
        livros.add(livro4);

        Livro livro5 = new Livro();
        livro5.setTitulo("Use a cabeça: Padrões de projeto");
        livro5.setAnoDeLancamento(2004);
        Autor autor5 = new Autor("Kathy", "Sierra");
        Autor autor6 = new Autor("Elizabeth", "Freeman");
        livro5.adicionarAutor(autor5);
        livro5.adicionarAutor((autor6));
        livro5.adicionarFormato(Formato.PDF);
        livro5.adicionarFormato(Formato.FISICO);
        livros.add(livro5);

        Livro livro6 = new Livro();
        livro6.setTitulo("Americanah");
        livro6.setAnoDeLancamento(2013);
        livro6.adicionarAutor(autor0);
        livro6.adicionarFormato(Formato.PDF);
        livro6.adicionarFormato(Formato.EBOOK);
        livro6.adicionarFormato(Formato.FISICO);
        livros.add(livro6);
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
