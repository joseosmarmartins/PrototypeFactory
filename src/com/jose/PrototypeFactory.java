package com.jose;

public class PrototypeFactory {

    private Aula prototypeAula;

    public PrototypeFactory(Aula aula) {
        prototypeAula = aula;
    }

    public Aula criarClone() {
        try {
            return ((Aula) prototypeAula.clone());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return null;
    }
}
