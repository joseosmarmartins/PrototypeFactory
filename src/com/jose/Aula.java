package com.jose;

public abstract class Aula implements Cloneable {

    private String conteudoAula;

    public String getConteudoAula() {
        return conteudoAula;
    }

    public void setConteudoAula(String conteudoAula) {
        this.conteudoAula = conteudoAula;
    }

    public void montarAula() {
        System.out.println("Aula de " + conteudoAula + " montada!");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object objeto = null;

        try {
            objeto = super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Aula não pôde ser clonada");
        }

        return objeto;
    }
}
