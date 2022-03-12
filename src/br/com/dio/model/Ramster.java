package br.com.dio.model;

import java.util.Objects;

public class Ramster {
    private String nome;
    private String cor;
    private Integer idade;

    public Ramster() {}

    public Ramster(String nome, String cor, Integer idade) {
        this.nome = nome;
        this.cor = cor;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getCor() {
        return cor;
    }

    public Integer getIdade() {
        return idade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ramster ramster = (Ramster) o;
        return Objects.equals(nome, ramster.nome) && Objects.equals(cor, ramster.cor) && Objects.equals(idade, ramster.idade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, cor, idade);
    }

    @Override
    public String toString() {
        return "Ramster{" +
                "nome='" + nome + '\'' +
                ", cor='" + cor + '\'' +
                ", idade=" + idade +
                '}';
    }
}
