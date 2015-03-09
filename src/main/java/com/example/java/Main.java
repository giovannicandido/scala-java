package com.example.java;

import java.util.List;

/**
 * @author Giovanni Silva
 *         09/03/15.
 */
public class Main {
    public static void main(String[] args) {
        List<Pessoa> pessoaList = PessoaOperations.gerarLista(5);
        PessoaOperations.imprimirLista(pessoaList);
    }
}
