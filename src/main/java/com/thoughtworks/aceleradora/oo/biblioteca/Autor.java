package com.thoughtworks.aceleradora.oo.biblioteca;

import java.util.Objects;

public class Autor {

    private String nome;
    private String sobrenome;

    public Autor(){

    }
    public Autor(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;

    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String toString() {
        return nome + " " + sobrenome;
    }

    public boolean equals(Object externo) {
        Autor outro = (Autor) externo;

        if (outro == null) {
            return false;
        }

        return Objects.equals(nome, outro.nome) && Objects.equals(sobrenome, outro.sobrenome);
    }
}
