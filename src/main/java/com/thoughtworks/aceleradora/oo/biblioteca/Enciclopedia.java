package com.thoughtworks.aceleradora.oo.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Enciclopedia {

    private List<Livro> livros = new ArrayList<>();

    /*## Preencha a enciclopedia

    A classe `Enciclopedia` possui uma lista de livros. No construtor da classe, preencha a lista com os seguintes títulos:

    * +++O livro "0" foi escrito por "Chimamanda Adichie", seu título é "Sejamos todos feministas" e foi lançado em "2014". O livro está disponível nos formatos "EBOOK"
    * +++O livro "1" foi escrito por "Alejandro Olchik", seu título é "Management 3.0" e foi lançado em "2017". O livro está disponível nos formatos "PDF, FISICO"
    * O livro "2" foi escrito por "George Orwell", seu título é "1984" e foi lançado em "1948". O livro está disponível nos formatos "PDF, FISICO, EBOOK"
    * O livro "3" foi escrito por "Julia Naomi", seu título é "Lean Game Development" e foi lançado em "2017". O livro está disponível nos formatos "PDF, EBOOK"
    * O livro "4" foi escrito por "Eduardo Galeano", seu título é "Las venas abiertas de Latinoamerica" e foi lançado em "1971". O livro está disponível nos formatos "FISICO, PDF, EBOOK"
    * O livro "5" foi escrito por "Kathy Sierra, Elizabeth Freeman", seu título é "Use a cabeça: Padrões de projeto" e foi lançado em "2004". O livro está disponível nos formatos "FISICO, PDF"
    * O livro "6" foi escrito por "Chimamanda Adichie", seu título é "Americanah" e foi lançado em "2013". O livro está disponível nos formatos "EBOOK, PDF, FISICO"
 */
    public Enciclopedia() {
        // Adicione os livros aqui

        //0
        Livro livro0 = new Livro();
        Autor autor0 = new Autor("Chimamanda","Adichie");
        livro0.setTitulo("Sejamos todos feministas");
        livro0.setAnoDeLancamento(2014);
        Formato formato0 = Formato.EBOOK;
        livro0.adicionarAutor(autor0);
        livro0.adicionarFormato(formato0);

        //1
        Livro livro1 = new Livro();
        Autor autor1 = new Autor("Alejandro", "Olchik");
        livro1.setTitulo("Management 3.0");
        livro1.setAnoDeLancamento(2017);
        Formato formato1 = Formato.PDF;
        Formato formato11 = Formato.FISICO;
        livro1.adicionarAutor(autor1);
        livro1.adicionarFormato(formato1);
        livro1.adicionarFormato(formato11);

        //2
        Livro livro2 = new Livro();
        Autor autor2 = new Autor("George", "Orwell");
        livro2.setTitulo("1984");
        livro2.setAnoDeLancamento(1948);
        Formato formato2 = Formato.PDF;
        Formato formato22 = Formato.FISICO;
        Formato formato222 = Formato.EBOOK;
        livro2.adicionarAutor(autor2);
        livro2.adicionarFormato(formato2);
        livro2.adicionarFormato(formato22);
        livro2.adicionarFormato(formato222);

        //3
        Livro livro3 = new Livro();
        Autor autor3 = new Autor("Julia", "Naomi");
        livro3.setTitulo("Lean Game Development");
        livro3.setAnoDeLancamento(2017);
        Formato formato3 = Formato.PDF;
        Formato formato33 = Formato.EBOOK;
        livro3.adicionarAutor(autor3);
        livro3.adicionarFormato(formato3);
        livro3.adicionarFormato(formato33);

        //4
        Livro livro4 = new Livro();
        Autor autor4 = new Autor("Eduardo", "Galeano");
        livro4.setTitulo("Las venas abiertas de Latinoamerica");
        livro4.setAnoDeLancamento(1971);
        Formato formato4 = Formato.PDF;
        Formato formato44 = Formato.EBOOK;
        Formato formato444 = Formato.EBOOK;
        livro4.adicionarAutor(autor4);
        livro4.adicionarFormato(formato4);
        livro4.adicionarFormato(formato44);
        livro4.adicionarFormato(formato444);

        //5
        Livro livro5 = new Livro();
        Autor autor5 = new Autor("Kathy", "Sierra");
        livro5.setTitulo("Use a cabeça: Padrões de projeto");
        livro5.setAnoDeLancamento(2004);
        Formato formato5 = Formato.FISICO;
        Formato formato55 = Formato.PDF;
        livro5.adicionarAutor(autor5);
        livro5.adicionarFormato(formato5);
        livro5.adicionarFormato(formato55);

        //6
        Livro livro6 = new Livro();
        Autor autor6 = new Autor("Chimamanda", "Adichie");
        livro6.setTitulo("Americanah");
        livro6.setAnoDeLancamento(2013);
        Formato formato6 = Formato.EBOOK;
        Formato formato66 = Formato.PDF;
        Formato formato666 = Formato.FISICO;
        livro6.adicionarAutor(autor6);
        livro6.adicionarFormato(formato6);
        livro6.adicionarFormato(formato66);
        livro6.adicionarFormato(formato666);
    }

    public String tituloDoEnesimoLivro(int posicao) {
/*
** Buscar título do enésimo livro

*Implemente o método `tituloDoEnesimoLivro` da classe `Enciclopedia` de modo que ele retorne o título do livro armazenado
*no índice recebido por parâmetro. Para verificar que a lógica está correta:

* O método tituloDoEnesimoLivro retorna o título "Sejamos todos feministas" quando o índice pesquisado for "0"
* O método tituloDoEnesimoLivro retorna o título "Use a cabeça: Padrões de projeto" quando o índice pesquisado for "5"
*/
        for(int linha = 0; linha < livros.size(); linha++){
            for (int coluna = 0; coluna < livros.size(); coluna++){


            }
        }

        return null;
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