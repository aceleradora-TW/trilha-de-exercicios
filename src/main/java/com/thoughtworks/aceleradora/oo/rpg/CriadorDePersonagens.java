package com.thoughtworks.aceleradora.oo.rpg;

public class CriadorDePersonagens {


    public Personagem criarPersonagemDeDefesa() {
        Personagem personagemDefesa = new Personagem();

        personagemDefesa.setNome("Lauri, o místico");
        personagemDefesa.setForca(50);
        personagemDefesa.setAgilidade(30);
        personagemDefesa.setCarisma(2);
        personagemDefesa.setConcentracao(10);

        Arma armaDefesa = new Arma();
        armaDefesa.setNome("Faca de cozinha enferrujada");
        armaDefesa.setBonusDeAtaque(30);

        Armadura armaduraDefesa = new Armadura();
        armaduraDefesa.setNome("Armadura de Couro de Capivara");
        armaduraDefesa.setBonusDeDefesa(50);

        personagemDefesa.setArma(armaDefesa);
        personagemDefesa.setArmadura(armaduraDefesa);


        /*
         * Seu nome é "Lauri, o místico"

         * Possui "50" pontos de forca
         * Possui "30" pontos de agilidade
         * Possui "2" pontos de carisma
         * Possui "10" pontos de concentracao

         * Sua arma se chama "Faca de cozinha enferrujada" e entrega um bônus de "30" pontos de ataque

         * Sua armadura se chama "Armadura de Couro de Capivara" e entrega um bônus de "50" pontos de defesa
         */

        return personagemDefesa;
    }

    public Personagem criarPersonagemDeAtaque() {
        Personagem personagemAtaque = new Personagem();

        personagemAtaque.setNome("Romilda, a destruidora");
        personagemAtaque.setForca(150);
        personagemAtaque.setAgilidade(10);
        personagemAtaque.setCarisma(200);
        personagemAtaque.setConcentracao(10);

        Arma armaAtaque = new Arma();
        armaAtaque.setNome("Facão três listras lendário");
        armaAtaque.setBonusDeAtaque(530);

        Armadura armaduraAtaque = new Armadura();
        armaduraAtaque.setNome("Armadura de folha de bananeira reforçada");
        armaduraAtaque.setBonusDeDefesa(100);

        personagemAtaque.setArmadura(armaduraAtaque);
        personagemAtaque.setArma(armaAtaque);


        /*
         * Seu nome é "Romilda, a destruidora"

         * Possui "150" pontos de forca
         * Possui "10" pontos de agilidade
         * Possui "200" pontos de carisma
         * Possui "10" pontos de concentracao

         * Sua arma se chama "Facão três listras lendário" e entrega um bônus de "530" pontos de ataque

         * Sua armadura se chama "Armadura de folha de bananeira reforçada" e entrega um bônus de "100" pontos de defesa
         */

        return personagemAtaque;
    }

}
