package main.java;

public class Cachorro extends Animal {
    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Au Au (Latido)");
    }

    public void roerOsso(){
        System.out.println(getNome() + " está roendo o seu osso!");
    }
}