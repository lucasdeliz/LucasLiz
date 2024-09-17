package main.java;

public class Animal {
    //TODO Atributos, construtor e métodos básicos serão adicionados durante a aula
    private String nome;
    private int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void emitirSom(){
        System.out.println("Som do animal");
    }

    public void comer(){
        System.out.println(getNome() + " está comendo.");
    }

    public String getNome(){
        return nome;
    }
}
