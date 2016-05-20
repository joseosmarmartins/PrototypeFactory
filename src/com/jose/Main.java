package com.jose;

public class Main {

    public static void main(String[] args) {
	    PrototypeFactory fabricaAula = new PrototypeFactory(new AulaProva("prova de Abstract Factory"));

        Aula aula = fabricaAula.criarClone();
        System.out.println("Conteudo da aula: " + aula.getConteudoAula());

        System.out.println("\n");

        PrototypeFactory fabricaProva = new PrototypeFactory(new AulaProva("prova de Prototype Factory"));

        Aula prova = fabricaProva.criarClone();
        System.out.println("Conteudo da aula: " + prova.getConteudoAula());
    }
}
