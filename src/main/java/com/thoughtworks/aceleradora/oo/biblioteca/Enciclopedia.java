package com.thoughtworks.aceleradora.oo.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Enciclopedia {

    private List<Livro> livros = new ArrayList<>();

    public Enciclopedia() {
        Livro livro0 = new Livro();
        Autor autor0 = new Autor();
        ArrayList<Formato> formatos= new ArrayList<Formato>();
        formatos.add(Formato.EBOOK);
        livro0.setTitulo("Sejamos todos feministas");
        autor0.setNome("Chimamanda");
        autor0.setSobrenome("Adichie");
        livro0.setAnoDeLancamento(2014);
        livro0.setFormatos(formatos);
        livros.add(livro0);

    }

    public Livro getEnesimoLivro(int posicao) {
        return null;
    }

}
