package com.thoughtworks.aceleradora.oo.biblioteca;

import java.util.ArrayList;
import java.util.List;

import static com.thoughtworks.aceleradora.oo.biblioteca.Formato.EBOOK;
import static com.thoughtworks.aceleradora.oo.biblioteca.Formato.PDF;
import static com.thoughtworks.aceleradora.oo.biblioteca.Formato.FISICO;

public class Enciclopedia {

    private List<Livro> livros = new ArrayList<>();

    public Enciclopedia() {
        Autor chimamanda = new Autor("Chimamanda", "Adichie");
        Livro livro = new Livro();
        livro.setTitulo("Sejamos todos feministas");
        livro.setAnoDeLancamento(2014);
        livro.adicionarAutor(chimamanda);
        livro.adicionarFormato(EBOOK);
        livros.add(livro);

        Autor alejandro = new Autor("Alejandro", "Olchik");
        Livro livro2 = new Livro();
        livro2.setTitulo("Management 3.0");
        livro2.setAnoDeLancamento(2017);
        livro2.adicionarAutor(alejandro);
        livro2.adicionarFormato(PDF);
        livro2.adicionarFormato(FISICO);
        livros.add(livro2);


        Autor george = new Autor("George", "Orwell");
        Livro livro3 = new Livro();
        livro3.setTitulo("1984");
        livro3.setAnoDeLancamento(1948);
        livro3.adicionarAutor(george);
        livro3.adicionarFormato(PDF);
        livro3.adicionarFormato(FISICO);
        livro3.adicionarFormato(EBOOK);
        livros.add(livro3);

        Autor julia = new Autor("Julia", "Naomi");
        Livro livro4 = new Livro();
        livro4.setTitulo("Lean Game Development");
        livro4.setAnoDeLancamento(2017);
        livro4.adicionarAutor(julia);
        livro4.adicionarFormato(PDF);
        livro4.adicionarFormato(EBOOK);
        livros.add(livro4);


        Autor eduardo = new Autor("Eduardo", "Galeano");
        Livro livro5 = new Livro();
        livro5.setTitulo("Las venas abiertas de Latinoamerica");
        livro5.setAnoDeLancamento(1971);
        livro5.adicionarAutor(eduardo);
        livro5.adicionarFormato(FISICO);
        livro5.adicionarFormato(PDF);
        livro5.adicionarFormato(EBOOK);
        livros.add(livro5);


        Autor kathy = new Autor("Kathy", "Sierra");
        Autor elizabeth = new Autor("Elizabeth", "Freeman");
        Livro livro6 = new Livro();
        livro6.setTitulo("Use a cabeça: Padrões de projeto");
        livro6.setAnoDeLancamento(2004);
        livro6.adicionarAutor(kathy);
        livro6.adicionarAutor(elizabeth);
        livro6.adicionarFormato(FISICO);
        livro6.adicionarFormato(PDF);
        livros.add(livro6);


        Autor chimamanda2 = new Autor("Chimamanda", "Adichie");
        Livro livro7 = new Livro();
        livro7.setTitulo("Americanah");
        livro7.setAnoDeLancamento(2013);
        livro7.adicionarAutor(chimamanda2);
        livro7.adicionarFormato(EBOOK);
        livro7.adicionarFormato(PDF);
        livro7.adicionarFormato(FISICO);
        livros.add(livro7);


    }

    public String tituloDoEnesimoLivro(int posicao) {
        return livros.get(posicao).getTitulo();
    }

    public List<Livro> livrosDisponiveisEmPdf() {
        List <Livro>  livrosEmPdf = new ArrayList<>();
        for (int i = 0; i < livros.size() ; i++) {
            if(livros.get(i).getFormatos().equals(PDF)){
                livrosEmPdf.add(livros.get(i));
            }
        }
        return livrosEmPdf;
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

