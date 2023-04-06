package com.jhonssantiago.card;

public class Pessoa {
    private String nome;
    private int idade;
    private String sobre;

    public Pessoa(String nome, int idade, String sobre) {
        this.nome = nome;
        this.idade = idade;
        this.sobre = sobre;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSobre() {
        return sobre;
    }

    public void setSobre(String sobre) {
        this.sobre = sobre;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sobre='" + sobre + '\'' +
                '}';
    }
}
