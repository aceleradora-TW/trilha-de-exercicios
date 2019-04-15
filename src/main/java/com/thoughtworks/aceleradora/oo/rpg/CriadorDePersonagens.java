package com.thoughtworks.aceleradora.oo.rpg;

public class CriadorDePersonagens {

    public Personagem criarPersonagemDeDefesa() {
        Personagem personagemDefesa = new Personagem();
        personagemDefesa.setNome("Lauri, o místico");
        personagemDefesa.setForca(50);
        personagemDefesa.setAgilidade(30);
        personagemDefesa.setCarisma(2);
        personagemDefesa.setConcentracao(10);
        //personagemDefesa.setArma();
        return null;
    }

    public Personagem criarPersonagemDeAtaque() {
        return null;
    }

}
