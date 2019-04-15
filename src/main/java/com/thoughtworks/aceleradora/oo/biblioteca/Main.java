package com.thoughtworks.aceleradora.oo.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Livro teste = new Livro();
        teste.setTitulo("Teste");

        Autor autor = new Autor("Teste", "Teste");
        teste.adicionarAutor(autor);

        teste.adicionarFormato(Formato.FISICO);

        List<Livro> livros = new ArrayList<>();
        livros.add(teste);

        Enciclopedia enciclo = new Enciclopedia();
        enciclo.setLivros(livros);

        System.out.print(enciclo.getLivros().get(0).getTitulo());
        System.out.print(enciclo.getLivros().get(0).getAutores().get(0).getNome());
        System.out.print(enciclo.getLivros().get(0).getFormatos().get(0));


    }
}
