package com.thoughtworks.aceleradora.oo.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class TesteBiblio {
    public static void main(String[] args) {
        int i;

        Livro testaLivro2 = new Livro();
        Livro testaLivro = new Livro();
        testaLivro.setTitulo("xxx yy tt");
        testaLivro.setAnoDeLancamento(2015);

        Autor autor = new Autor("Fulano", "da Silva");
        testaLivro.adicionarAutor(autor);

        testaLivro.adicionarFormato(Formato.PDF);

        List<Livro> livros = new ArrayList<>();
        livros.add(testaLivro);
        livros.add(testaLivro2);

        Enciclopedia testaEnciclo = new Enciclopedia();
        testaEnciclo.setLivros(livros);

        System.out.println(testaEnciclo.toString());
        System.out.println("- Qtd. de livros na lista: " + livros.size());

        for (i = 0; i < livros.size(); i++) {

            System.out.println(livros.get(i).getTitulo());
        }
    }
}
