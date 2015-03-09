package com.example.java;

import java.util.*;

/**
 * @author Giovanni Silva
 *         09/03/15.
 */
public class PessoaOperations {

    private static final List<String> nomes = Arrays.asList("Mestre", "Dengoso", "Atchim", "Feliz", "Dunga", "Soneca", "Zangado");
    private static final List<String> sobrenomes = Arrays.asList("Schwarzenegger","Van Dame","Lee","Chan","Stallone","Lundgren","Li");

    private static Random random = new Random();

    private static Pessoa gerarPessoaRandon(int idadeMaxima){
        String nome = nomes.get(random.nextInt(nomes.size()));
        String sobrenome = sobrenomes.get(random.nextInt(sobrenomes.size()));
        int idade = random.nextInt(idadeMaxima);
        return new Pessoa(nome,sobrenome,idade);
    }

    public static List<Pessoa> gerarLista(int tamanho){
        List<Pessoa> pessoas = new ArrayList<>(tamanho);
        for(int i =0;i<tamanho;i++){
            pessoas.add(gerarPessoaRandon(50));
        }
        return Collections.unmodifiableList(pessoas);
    }

    public static <T> void imprimirLista(List<T> lista){
        for(int i=0;i<lista.size();i++){
            System.out.println(lista.get(i));
        }
    }
}
