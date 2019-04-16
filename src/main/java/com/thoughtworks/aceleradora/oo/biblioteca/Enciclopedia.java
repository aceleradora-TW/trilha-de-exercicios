package com.thoughtworks.aceleradora.oo.biblioteca;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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


    public void adicionaLivro(String nomeAutor, String sobrenomeAutor, String titulo, int ano, List<Formato> formatos) {
        Livro livro = new Livro();
        livro.setTitulo(titulo);
        livro.setAnoDeLancamento(ano);

        Autor autor = new Autor(nomeAutor, sobrenomeAutor);
        livro.adicionarAutor(autor);
        livro.adicionaListaFormatos(formatos);

        livros.add(livro);
    }

    public List<Livro> getLivros() {
        return livros;
    }


}

//* O livro "0" foi escrito por "Chimamanda Adichie", seu título é "Sejamos todos feministas" e foi lançado em "2014". O livro está disponível nos formatos "EBOOK"
//        * O livro "1" foi escrito por "Alejandro Olchik", seu título é "Management 3.0" e foi lançado em "2017". O livro está disponível nos formatos "PDF, FISICO"
//        * O livro "2" foi escrito por "George Orwell", seu título é "1984" e foi lançado em "1948". O livro está disponível nos formatos "PDF, FISICO, EBOOK"
//        * O livro "3" foi escrito por "Julia Naomi", seu título é "Lean Game Development" e foi lançado em "2017". O livro está disponível nos formatos "PDF, EBOOK"
//        * O livro "4" foi escrito por "Eduardo Galeano", seu título é "Las venas abiertas de Latinoamerica" e foi lançado em "1971". O livro está disponível nos formatos "FISICO, PDF, EBOOK"
//        * O livro "5" foi escrito por "Kathy Sierra, Elizabeth Freeman", seu título é "Use a cabeça: Padrões de projeto" e foi lançado em "2004". O livro está disponível nos formatos "FISICO, PDF"
//        * O livro "6" foi escrito por "Chimamanda Adichie", seu título é "Americanah" e foi lançado em "2013". O livro está disponível nos formatos "EBOOK, PDF, FISICO"
