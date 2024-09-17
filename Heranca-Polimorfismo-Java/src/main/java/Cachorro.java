package main.java;

public class Cachorro extends Animal {
    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Auau");
    }

    public void dormir(){
        System.out.println(getNome() + " está dormindo.");
    }
}
