package com.jose;

public class Main {

    public static void main(String[] args) {
	    PrototypeFactory fabricaProva = new PrototypeFactory(new AulaProva("prova de Prototype Factory"));

        Aula prova = fabricaProva.criarClone();
        System.out.println("Conteudo da aula: " + prova.getConteudoAula());
    }
}
