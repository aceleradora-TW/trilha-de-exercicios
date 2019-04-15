package com.thoughtworks.aceleradora.oo.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class TesteBiblio {
    public static void main(String[] args) {

        List<Livro> livros = new ArrayList<Livro>();

        for (int i = 0; i <= livros.size(); i++) {

            System.out.println(livros.get(i).getAutores());
        }
    }
}
