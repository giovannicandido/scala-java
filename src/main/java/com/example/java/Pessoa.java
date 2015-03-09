package com.example.java;

/**
 * @author Giovanni Silva
 *         09/03/15.
 */
/**
 * @author Giovanni Silva
 *         09/03/15.
 */
public class Pessoa {
    private String nome;
    private String sobrenome;
    private int idade;

    public Pessoa(String nome, String sobrenome, int idade){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pessoa pessoa = (Pessoa) o;

        if (idade != pessoa.idade) return false;
        if (nome != null ? !nome.equals(pessoa.nome) : pessoa.nome != null) return false;
        if (sobrenome != null ? !sobrenome.equals(pessoa.sobrenome) : pessoa.sobrenome != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = nome != null ? nome.hashCode() : 0;
        result = 31 * result + (sobrenome != null ? sobrenome.hashCode() : 0);
        result = 31 * result + idade;
        return result;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", idade=" + idade +
                '}';
    }
}