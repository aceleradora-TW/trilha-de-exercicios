package com.thoughtworks.aceleradora.oo.biblioteca;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Enciclopedia {

    private List<Livro> livros = new ArrayList<>();

    public Enciclopedia() {

        List<Formato> formatosLivro0 = Arrays.asList(Formato.EBOOK);
        adicionaLivro("Chimamanda",
                "Adichie",
                "Sejamos todos feministas",
                2014,
                formatosLivro0
        );

        List<Formato> formatosLivro1 = Arrays.asList(Formato.PDF, Formato.FISICO);
        adicionaLivro("Alejandro",
                "Olchik",
                "Management 3.0",
                2017,
                formatosLivro1
        );

        List<Formato> formatosLivro2 = Arrays.asList(Formato.PDF, Formato.FISICO, Formato.EBOOK);
        adicionaLivro("George",
                "Orwell",
                "1984",
                1948,
                formatosLivro2
        );

        List<Formato> formatosLivro3 = Arrays.asList(Formato.PDF, Formato.EBOOK);
        adicionaLivro("Julia",
                "Naomi",
                "Lean Game Development",
                2017,
                formatosLivro3
        );

        List<Formato> formatosLivro4 = Arrays.asList(Formato.FISICO, Formato.PDF, Formato.EBOOK);
        adicionaLivro("Eduardo",
                "Galeano",
                "Las venas abiertas de Latinoamerica",
                1971,
                formatosLivro4
        );

        List<Formato> formatosLivro5 = Arrays.asList(Formato.FISICO, Formato.PDF);
        adicionaLivro("Kathy",
                "Sierra",
                "Use a cabeça: Padrões de projeto",
                2004,
                formatosLivro5
        );
        Autor autor = new Autor("Elizabeth", "Freeman");
        livros.get(5).adicionarAutor(autor);

        List<Formato> formatosLivro6 = Arrays.asList(Formato.EBOOK, Formato.PDF, Formato.FISICO);
        adicionaLivro("Chimamanda",
                "Adichie",
                "Americanah",
                2013,
                formatosLivro6
        );
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

    public void adicionaLivro (String nomeAutor, String sobrenomeAutor, String titulo, int ano, List<Formato> formatos) {
        Livro livro = new Livro();
        livro.setTitulo(titulo);
        livro.setAnoDeLancamento(ano);

        Autor objetoAutor = new Autor(nomeAutor, sobrenomeAutor);
        livro.adicionarAutor(objetoAutor);

        livro.setFormatos(formatos);

        livros.add(livro);
    }


    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }
}


