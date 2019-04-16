package com.thoughtworks.aceleradora.oo.biblioteca;

public class testaBiblioteca {
    public static void main(String[] args) {
        Enciclopedia enciclopedia = new Enciclopedia();

        for (int i =0; i < enciclopedia.getLivros().size(); i++){
            Livro livro = enciclopedia.getLivros().get(i);
            System.out.println(livro.getTitulo());
        }
    }
}
