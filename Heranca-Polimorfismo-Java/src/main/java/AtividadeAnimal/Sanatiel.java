package main.java.AtividadeAnimal;

public class Sanatiel extends Animal{
    public Sanatiel(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom(){
        System.out.println("Sanatiel: Ai..AI");
    }

    public void pitarUm(){
        System.out.println(getNome() + " está pitando um!");
    }
}
