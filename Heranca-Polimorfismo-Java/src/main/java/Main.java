package main.java;

import main.java.atividade02.AudioLivro;
import main.java.atividade02.Biblioteca;
import main.java.atividade02.Ebook;
import main.java.atividade02.LivroFisico;
import main.java.atividade02.ItemBiblioteca;
import main.java.atividade03.Caminhao;
import main.java.atividade03.Carro;
import main.java.atividade03.Frota;
import main.java.atividade03.Moto;

public class Main {
    public static void main(String[] args){

//        Biblioteca  biblioteca = new Biblioteca();
//
//        biblioteca.adicionarItensBiblioteca(new LivroFisico("Bem-vindos a livriaria Hyunam dong", "Bo Reum", 2018,true,198 ));
//        biblioteca.adicionarItensBiblioteca(new LivroFisico("Kim Jinyoung nascida em 1988", "Cho Nam-Joo", 2012, false, 200));
//        biblioteca.adicionarItensBiblioteca(new AudioLivro("Assistente do Vilão", "Hannah Nicole", 2022, true, 660));
//        biblioteca.adicionarItensBiblioteca(new AudioLivro("O gato que amava livros", "Sosuke Natsukawa", 2022, true, 450));
//        biblioteca.adicionarItensBiblioteca(new Ebook("Se os gatos desaparecessem do mundo", "Genki Kawamura", 2012, false, (3.0 * 1024.0 * 1024)/ (1024.0 * 1024.0)));
//        biblioteca.adicionarItensBiblioteca(new Ebook("Meus dias na livraria Morisaki", "Satoshi Yagisawa", 2014,true, (1.0 * 1024.0 * 1024.0) / (1024.0 * 1024.0)));
//
//        biblioteca.listarItensDisponiveis();
//        biblioteca.devolverItem("Assistente do vilão");
//        System.out.println(biblioteca.multaAtraso("Meus dias na livraria Morisaki", 2));
//
       Frota veiculos = new Frota();
        veiculos.adicionarVeiculos(new Carro("SKZ-2503", "Strada", 2018, 14.0, 4));
        veiculos.adicionarVeiculos(new Carro("BTS-1306", "Polo", 2013, 7.0, 4));
        veiculos.adicionarVeiculos(new Caminhao("BND-1234", "Volvo VM 220 4X2 (E5)", 2013, 40.0, 3.0));
        veiculos.adicionarVeiculos(new Caminhao("ITZY-2468", "Volvo FH-540 6x4 (E5)", 2016, 150.0, 10.0));
        veiculos.adicionarVeiculos(new Moto("ABC-2586", "CG 160 Start", 2020, 2.5, 162));
        veiculos.adicionarVeiculos(new Moto("DEF-8888", "Honda ADV", 2019, 4.0, 124));

        veiculos.removerVeiculos("SKZ-2503");
        System.out.println(veiculos.custoViagemTotal());
        veiculos.listaDeVeiculos();
    }
}

