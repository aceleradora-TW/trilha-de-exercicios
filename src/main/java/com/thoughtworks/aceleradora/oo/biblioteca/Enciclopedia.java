package com.thoughtworks.aceleradora.oo.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Enciclopedia {

    private List<Livro> livros = new ArrayList<>();

    public Enciclopedia() {
        Livro livroUm = new Livro();
        Autor autorUm = new Autor("Chimamanda", "Adichie");
        livroUm.adicionarAutor(autorUm);
        livroUm.setTitulo("Sejamos todos feministas");
        livroUm.setAnoDeLancamento(2014);
        livroUm.adicionarFormato(Formato.EBOOK);
        livros.add(livroUm);

        Livro livroDois = new Livro();
        Autor autorDois = new Autor("Alejandro", "Olchik");
        livroDois.adicionarAutor(autorDois);
        livroDois.setTitulo("Management 3.0");
        livroDois.setAnoDeLancamento(2017);
        livroDois.adicionarFormato(Formato.PDF);
        livroDois.adicionarFormato(Formato.FISICO);
        livros.add(livroDois);

        Livro livroTres = new Livro();
        Autor autorTres = new Autor("George", "Orwell");
        livroTres.adicionarAutor(autorTres);
        livroTres.setTitulo("1984");
        livroTres.setAnoDeLancamento(1948);
        livroTres.adicionarFormato(Formato.PDF);
        livroTres.adicionarFormato(Formato.FISICO);
        livroTres.adicionarFormato(Formato.EBOOK);
        livros.add(livroTres);

        Livro livroQuatro = new Livro();
        Autor autorQuatro = new Autor("Julia", "Naomi");
        livroQuatro.adicionarAutor(autorQuatro);
        livroQuatro.setTitulo("Lean Game Development");
        livroQuatro.setAnoDeLancamento(2017);
        livroQuatro.adicionarFormato(Formato.PDF);
        livroQuatro.adicionarFormato(Formato.EBOOK);
        livros.add(livroQuatro);

        Livro livroCinco = new Livro();
        Autor autorCinco = new Autor("Eduardo", "Galeano");
        livroCinco.adicionarAutor(autorCinco);
        livroCinco.setTitulo("Las venas abiertas de Latinoamerica");
        livroCinco.setAnoDeLancamento(1971);
        livroCinco.adicionarFormato(Formato.FISICO);
        livroCinco.adicionarFormato(Formato.PDF);
        livroCinco.adicionarFormato(Formato.EBOOK);
        livros.add(livroCinco);

        Livro livroSeis = new Livro();
        Autor autorSeis = new Autor("Kathy", "Sierra");
        Autor autorSeisDois = new Autor("Elizabeth", "Freeman");
        livroSeis.adicionarAutor(autorSeis);
        livroSeis.adicionarAutor(autorSeisDois);
        livroSeis.setTitulo("Use a cabeça: Padrões de projeto");
        livroSeis.setAnoDeLancamento(2004);
        livroSeis.adicionarFormato(Formato.FISICO);
        livroSeis.adicionarFormato(Formato.PDF);
        livros.add(livroSeis);

        Livro livroSete = new Livro();
        Autor autorSete = new Autor("Chimamanda", "Adichie");
        livroSete.adicionarAutor(autorSete);
        livroSete.setTitulo("Americanah");
        livroSete.setAnoDeLancamento(2013);
        livroSete.adicionarFormato(Formato.EBOOK);
        livroSete.adicionarFormato(Formato.PDF);
        livroSete.adicionarFormato(Formato.FISICO);
        livros.add(livroSete);
    }

    public String tituloDoEnesimoLivro(int posicao) {
        return livros.get(posicao).getTitulo();
    }

    public List<Livro> livrosDisponiveisEmPdf() {
        List<Livro> umaLista = new ArrayList<>();
        for(int i = 0; i < livros.size();i++){
            if (livros.get(i).getFormatos().contains(Formato.PDF)) {
                umaLista.add(livros.get(i));
            }
        }
        return umaLista;
    }

    public List<Livro> buscaPorAutora(String nomeCompleto) {
        String[] nome = nomeCompleto.split(" ");
        Autor umAutor = new Autor(nome[0], nome[1]);
        List<Livro> umaLista = new ArrayList<>();

        for(int i = 0; i < livros.size();i++){
            if(livros.get(i).getAutores().contains(umAutor)){
                umaLista.add(livros.get(i));
            }
        }

        return umaLista;
    }

    public List<Livro> buscaPorAnoDeLancamento(int ano) {
        List<Livro> listaAnoLivro = new ArrayList<>();
        for(int i = 0; i < livros.size(); i++){
            if(livros.get(i).getAnoDeLancamento() == ano){
                listaAnoLivro.add(livros.get(i));
            }
        }
        return listaAnoLivro;
    }

    public List<Livro> buscaPorPeriodoDeLancamento(int inicio, int fim) {
        List<Livro> listaAnoLivro = new ArrayList<>();
        for(int i = 0; i < livros.size(); i++){
            if(livros.get(i).getAnoDeLancamento() >= inicio && livros.get(i).getAnoDeLancamento() <= fim){
                listaAnoLivro.add(livros.get(i));
            }
        }
        return listaAnoLivro;
    }

}
