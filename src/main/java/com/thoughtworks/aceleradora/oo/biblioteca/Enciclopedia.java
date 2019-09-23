package com.thoughtworks.aceleradora.oo.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Enciclopedia {

    private List<Livro> livros = new ArrayList<>();

    public Enciclopedia() {

        Livro adichie = new Livro();
        Autor chimamanda = new Autor("Chimamanda", "Adichie");
        adichie.setTitulo("Sejamos todos feministas");
        adichie.setAnoDeLancamento(2014);
        adichie.adicionarAutor(chimamanda);
        adichie.adicionarFormato(Formato.EBOOK);

        Livro olchick = new Livro();
        Autor alejandro = new Autor("Alejandro", "Olchick");
        olchick.setTitulo("Management 3.0");
        olchick.setAnoDeLancamento(2017);
        olchick.adicionarAutor(alejandro);
        olchick.adicionarFormato(Formato.PDF);
        olchick.adicionarFormato(Formato.FISICO);

        Livro orwell = new Livro();
        Autor george = new Autor("George", "Orwell");
        orwell.setTitulo("1984");
        orwell.setAnoDeLancamento(1948);
        orwell.adicionarAutor(george);
        orwell.adicionarFormato(Formato.PDF);
        orwell.adicionarFormato(Formato.FISICO);
        orwell.adicionarFormato(Formato.EBOOK);

        Livro naomi = new Livro();
        Autor julia = new Autor("Julia", "Naomi");
        naomi.setTitulo("Lean Game Development");
        naomi.setAnoDeLancamento(2017);
        naomi.adicionarAutor(julia);
        naomi.adicionarFormato(Formato.PDF);
        naomi.adicionarFormato(Formato.EBOOK);

        Livro galeano = new Livro();
        Autor eduardo = new Autor("Eduardo", "Galeano");
        galeano.setTitulo("Las venas abiertas de Latinoamerica");
        galeano.setAnoDeLancamento(1971);
        galeano.adicionarAutor(eduardo);
        galeano.adicionarFormato(Formato.FISICO);
        galeano.adicionarFormato(Formato.PDF);
        galeano.adicionarFormato(Formato.EBOOK);

        Livro sierraEhFreeman = new Livro();
        Autor kathy = new Autor("Kathy", "Sierra");
        Autor elizabeth = new Autor("Elizabeth", "Freeman");
        sierraEhFreeman.setTitulo("Use a cabeça: Padrões de projeto");
        sierraEhFreeman.setAnoDeLancamento(2004);
        sierraEhFreeman.adicionarAutor(kathy);
        sierraEhFreeman.adicionarAutor(elizabeth);
        sierraEhFreeman.adicionarFormato(Formato.FISICO);
        sierraEhFreeman.adicionarFormato(Formato.PDF);

        Livro adichie02 = new Livro();
        adichie02.setTitulo("Americanah");
        adichie02.setAnoDeLancamento(2013);
        adichie02.adicionarAutor(chimamanda);
        adichie02.adicionarFormato(Formato.EBOOK);
        adichie02.adicionarFormato(Formato.PDF);
        adichie02.adicionarFormato(Formato.FISICO);

        livros.add(adichie);
        livros.add(olchick);
        livros.add(orwell);
        livros.add(naomi);
        livros.add(galeano);
        livros.add(sierraEhFreeman);
        livros.add(adichie02);
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
