package com.thoughtworks.aceleradora.oo.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Livro {

    private String titulo;
    private int anoDeLancamento;
    private List<Autor> autores;
    private List<Formato> formatos;

    public Livro() {
        formatos = new ArrayList<>();
        autores = new ArrayList<>();
    }

    public void adicionarFormato(Formato formato) {
        formatos.add(formato);
    }

    public void adicionarAutor(Autor autor) {
        autores.add(autor);
    }

    public void adicionaListaFormatos(List<Formato> listaFormatos) {
        for (int i = 0; i < listaFormatos.size(); i++) {
            Formato formatoAtual = listaFormatos.get(i);
            formatos.add(formatoAtual);
        }
    }

//    public void adicionaListaAutores(List<Autor> autores) {
//       for (int i = 0; i < autores.size(); i++) {
//           Autor autorAtual = autores.get(i);
//           autores.add(autorAtual);
//       }
//    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public List<Formato> getFormatos() {
        return formatos;
    }


}
