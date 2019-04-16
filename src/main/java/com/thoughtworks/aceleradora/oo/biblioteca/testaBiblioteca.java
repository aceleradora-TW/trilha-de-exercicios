package com.thoughtworks.aceleradora.oo.biblioteca;

public class testaBiblioteca {

    public static void main(String[] args) {

        Enciclopedia enciclopedia = new Enciclopedia();
        
        System.out.println(enciclopedia.tituloDoEnesimoLivro(5));
        System.out.println(enciclopedia.autorDoEnesimoLivro(2));
        System.out.println(enciclopedia.imprimeAutores());

        //Imprime todos os livros na Biblioteca
        System.out.println(enciclopedia.toString());

    }
}
