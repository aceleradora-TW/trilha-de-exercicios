package com.thoughtworks.aceleradora.oo.biblioteca;

import java.util.ArrayList;
import java.util.List;

import static com.thoughtworks.aceleradora.oo.biblioteca.Formato.PDF;

public class Enciclopedia {

    private List<Livro> livros = new ArrayList<>();

    public Enciclopedia() {
        // Adicione os livros aqui

//
        Livro livro0 = new Livro();
        Autor autor0 = new Autor("Chimamanda", "Adichie");
        livro0.setAnoDeLancamento(2014);
        livro0.setTitulo("Sejamos todos feministas");
        livro0.adicionarFormato(Formato.EBOOK);
        livro0.adicionarAutor(autor0);
        livros.add(livro0);

        Livro livro1 = new Livro();
        Autor autor1 = new Autor("Alejandro", "Olchik");
        livro1.setAnoDeLancamento(2017);
        livro1.setTitulo("Management 3.0");
        livro1.adicionarFormato(PDF);
        livro1.adicionarFormato(Formato.FISICO);
        livro1.adicionarAutor(autor1);
        livros.add(livro1);

        Livro livro2 = new Livro();
        Autor autor2 = new Autor("George", "Orwell");
        livro2.setAnoDeLancamento(1948);
        livro2.setTitulo("1984");
        livro2.adicionarFormato(PDF);
        livro2.adicionarFormato(Formato.FISICO);
        livro2.adicionarFormato(Formato.EBOOK);
        livro2.adicionarAutor(autor2);
        livros.add(livro2);

        Livro livro3 = new Livro();
        Autor autor3 = new Autor("Julia", "Naomi");
        livro3.setAnoDeLancamento(2017);
        livro3.adicionarAutor(autor3);
        livro3.setTitulo("Lean Game Development");
        livro3.adicionarFormato(PDF);
        livro3.adicionarFormato(Formato.EBOOK);
        livros.add(livro3);

        Livro livro4 = new Livro();
        Autor autor4 = new Autor("Eduardo", "Galeano");
        livro4.setAnoDeLancamento(1971);
        livro4.setTitulo("Las venas abiertas de Latinoamerica");
        livro4.adicionarFormato(Formato.FISICO);
        livro4.adicionarFormato(PDF);
        livro4.adicionarFormato(Formato.EBOOK);
        livro4.adicionarAutor(autor4);
        livros.add(livro4);

        Livro livro5 = new Livro();
        Autor autor5 = new Autor("Kathy", "Sierra");
        Autor autor51 = new Autor("Elizabeth", "Freeman");
        livro5.setAnoDeLancamento(2004);
        livro5.setTitulo("Use a cabeça: Padrões de projeto");
        livro5.adicionarFormato(Formato.FISICO);
        livro5.adicionarFormato(PDF);
        livro5.adicionarAutor(autor5);
        livro5.adicionarAutor(autor51);
        livros.add(livro5);

        Livro livro6 = new Livro();
        livro6.setAnoDeLancamento(2013);
        livro6.setTitulo("Americanah");
        livro6.adicionarFormato(Formato.EBOOK);
        livro6.adicionarFormato(PDF);
        livro6.adicionarFormato(Formato.FISICO);
        livro6.adicionarAutor(autor0);
        livros.add(livro6);

    }


    public String tituloDoEnesimoLivro(int posicao) {
        return livros.get(posicao).getTitulo();
    }

    public List<Livro> livrosDisponiveisEmPdf() {
        List<Livro> livrosEmPdf = new ArrayList<>();
        for (int i = 0; i < livros.size(); i++) {
            for (int j = 0; j < livros.get(i).getFormatos().size(); j++) {
                if (livros.get(i).getFormatos().get(j).equals(PDF)) {
                    livrosEmPdf.add(livros.get(i));
                }
            }
        }
        return livrosEmPdf;
    }

    public List<Livro> buscaPorAutora(String nomeCompleto) {
        List<Livro> buscarAutora = new ArrayList<>();
        for (int i = 0; i < livros.size(); i++) {
            for (int j = 0; j < livros.get(i).getAutores().size(); j++) {
                if (livros.get(i).getAutores().get(j).toString().equals(nomeCompleto)) {
                    buscarAutora.add(livros.get(i));
                }
            }
        }
        return buscarAutora;
    }

    public List<Livro> buscaPorAnoDeLancamento(int ano) {
        List<Livro> porAno = new ArrayList<>();
        for (int i = 0; i < livros.size(); i++) {
            if (livros.get(i).getAnoDeLancamento() == ano) {
                porAno.add(livros.get(i));
            }
        }
        return porAno;
    }

    public List<Livro> buscaPorPeriodoDeLancamento(int inicio, int fim) {
        List<Livro> periodo = new ArrayList<>();
        for (int i = 0; i < livros.size(); i++) {
            if (livros.get(i).getAnoDeLancamento() >= inicio && livros.get(i).getAnoDeLancamento() <= fim) {
                periodo.add(livros.get(i));
            }
        }
        return periodo;
    }

}
