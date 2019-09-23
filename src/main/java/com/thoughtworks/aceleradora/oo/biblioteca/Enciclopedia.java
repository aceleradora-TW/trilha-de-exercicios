package com.thoughtworks.aceleradora.oo.biblioteca;

import java.text.Format;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static com.thoughtworks.aceleradora.oo.biblioteca.Formato.PDF;

public class Enciclopedia {

    private List<Livro> livros = new ArrayList<>();

    public Enciclopedia() {
        Autor autor0= new Autor("Chimamanda", "Adichie");
        Livro livro0= new Livro();
        livro0.setTitulo("Sejamos todos feministas");
        livro0.setAnoDeLancamento(2014);
        livro0.adicionarFormato(Formato.EBOOK);
        livro0.adicionarAutor(autor0);
        livros.add(livro0);

        Autor autor1= new Autor("Alejandro", "Olchik");
        Livro livro1=new Livro();
        livro1.setTitulo("Management 3.0");
        livro1.setAnoDeLancamento(2017);
        livro1.adicionarFormato(PDF );
        livro1.adicionarFormato(Formato.FISICO );
        livro1.adicionarAutor(autor1);
        livros.add(livro1);

        Autor autor2= new Autor("George", "Orwell");
        Livro livro2=new Livro();
        livro2.setTitulo("1984");
        livro2.setAnoDeLancamento(1948);
        livro2.adicionarFormato(PDF );
        livro2.adicionarFormato(Formato.FISICO );
        livro2.adicionarFormato(Formato.EBOOK );
        livro2.adicionarAutor(autor2);
        livros.add(livro2);

        Autor autor3= new Autor("Julia", "Naomi");
        Livro livro3=new Livro();
        livro3.setTitulo("Lean Game Development");
        livro3.setAnoDeLancamento(2017);
        livro3.adicionarFormato(PDF );
        livro3.adicionarFormato(Formato.EBOOK );
        livro3.adicionarAutor(autor3);
        livros.add(livro3);

        Autor autor4= new Autor("Eduardo", "Galeano");
        Livro livro4=new Livro();
        livro4.setTitulo("Las venas abiertas de Latinoamerica");
        livro4.setAnoDeLancamento(1971);
        livro4.adicionarFormato(Formato.FISICO );
        livro4.adicionarFormato(PDF );
        livro4.adicionarFormato(Formato.EBOOK );
        livro4.adicionarAutor(autor4);
        livros.add(livro4);

        Autor autor5= new Autor("Kathy", "Sierra");
        Autor autor51= new Autor("Elizabeth", "Freeman");
        Livro livro5=new Livro();
        livro5.setTitulo("Use a cabeça: Padrões de projeto");
        livro5.setAnoDeLancamento(2004);
        livro5.adicionarFormato(Formato.FISICO );
        livro5.adicionarFormato(PDF );
        livro5.adicionarAutor(autor5);
        livro5.adicionarAutor(autor51);
        livros.add(livro5);

        Autor autor6= new Autor("Chimamanda", "Adichie");
        Livro livro6=new Livro();
        livro6.setTitulo("Americanah");
        livro6.setAnoDeLancamento(2013);
        livro6.adicionarFormato(Formato.EBOOK );
        livro6.adicionarFormato(PDF );
        livro6.adicionarFormato(Formato.FISICO );
        livro6.adicionarAutor(autor6);
        livros.add(livro6);

    }


    public String tituloDoEnesimoLivro(int posicao) {
        return livros.get(posicao).getTitulo();
    }

    public List<Livro> livrosDisponiveisEmPdf() {
         List<Livro> livrosEmPDF = new ArrayList<>();
        for (int i = 0; i < livros.size(); i++) {
            if (livros.get(i).getFormatos().contains(PDF)){
                livrosEmPDF.add(livros.get(i));
            }
        }
        return livrosEmPDF;
    }

    public List<Livro> buscaPorAutora(String nomeCompleto) {
        String[] nomeQuebrado=nomeCompleto.split(" ");
        Autor autor= new Autor(nomeQuebrado[0], nomeQuebrado[1]);
        List<Livro> livrosDaChimamanda = new ArrayList<>();
        for (int i = 0; i < livros.size(); i++) {
            if (livros.get(i).getAutores().contains(autor)){
                livrosDaChimamanda.add(livros.get(i));
            }
        }

        return livrosDaChimamanda;
    }

    public List<Livro> buscaPorAnoDeLancamento(int ano) {
        List<Livro> livrosDe2017 = new ArrayList<>();
        for (int i = 0; i < livros.size(); i++) {
            if (livros.get(i).getAnoDeLancamento() == ano){
                livrosDe2017.add(livros.get(i));
            }

        }

        return livrosDe2017;
    }

    public List<Livro> buscaPorPeriodoDeLancamento(int inicio, int fim) {

        return null;
    }

}
