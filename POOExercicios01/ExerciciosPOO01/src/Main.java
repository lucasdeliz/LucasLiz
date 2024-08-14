import Exercicio01.Pessoa;
import Exercicio02.ContaBancaria;
import Exercicio03.Produto;
import Exercicio04.Livro;
import Exercicio05.Carro;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        // Exercício 1:
        // 1. Criar uma instância da classe Pessoa.
        // 2. Exibir o nome e a idade da pessoa.
        // 3. Alterar a idade da pessoa e exibir novamente.
        Pessoa pessoa = new Pessoa("Tainá", 19);
        System.out.println("\nExercício 1:");
        System.out.println("Nome: " + pessoa.getNome() + "\nIdade: " + pessoa.getIdade());
        pessoa.setIdade(20);
        System.out.println("Idade: " + pessoa.getIdade());

        // Exercício 2:
        // 1. Criar uma instância da classe ContaBancaria com um saldo inicial.
        // 2. Depositar um valor na conta.
        // 3. Sacar um valor da conta.
        // 4. Exibir o saldo final.
        ContaBancaria saldo = new ContaBancaria(101010, 1100);
        saldo.depositar(100);
        saldo.sacar(10);
        System.out.println("\nExercício 2:");
        System.out.println("Saldo: " + saldo.getSaldo());

        // Exercício 3:
        // 1. Criar uma instância da classe Produto.
        // 2. Exibir o nome, preço e quantidade em estoque.
        // 3. Adicionar itens ao estoque e exibir a nova quantidade.
        // 4. Remover itens do estoque e exibir a nova quantidade.
        Produto produto = new Produto("Caixa", 79.90, 450);
        System.out.println("\nExercício 3:");
        System.out.println("Produto: " + produto.getNome() + "\nPreço: " + produto.getPreco() + "\nQuantidade em estoque: " + produto.getQuantidadeEmEstoque());
        produto.adicionarEstoque(40);
        System.out.println("-\nQuantidade em estoque: " + produto.getQuantidadeEmEstoque());
        produto.removerEstoque(4);
        System.out.println("Quantidade em estoque: " + produto.getQuantidadeEmEstoque());

        // Exercício 4:
        // 1. Criar uma instância da classe Livro.
        // 2. Exibir o título, autor e ano de publicação.
        // 3. Alterar o ano de publicação e exibir novamente.
        Livro livro = new Livro("Alice no País das Maravilhas", "Lewis Carroll", 1865);
        System.out.println("\nExercício 4:");
        System.out.println("Título: " + livro.getTitulo() + "\nAutor: " + livro.getAutor() + "\nAno de Publicação: " + livro.getAnoPublicacao());
        livro.setAnoPublicacao(2010);
        System.out.println("- \nAno de Publicação: " + livro.getAnoPublicacao());

        // Exercício 5:
        // 1. Criar uma instância da classe Carro.
        // 2. Exibir a marca, modelo, ano e quilometragem do carro.
        // 3. Adicionar quilometragem ao carro e exibir a nova quilometragem.
        Carro carro = new Carro("Honda Civic", "Si", 2005, 170.000);
        System.out.println("Marca: " + carro.getMarca() + "Modelo: " + carro.getModelo() + "Ano: " + carro.getAno() + "Quilometragem: " + carro.getQuilometragem());
        carro.adicionarQuilometragem(200.000);
        System.out.println("Quilometragem: " + carro.getQuilometragem());
    }
}