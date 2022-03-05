package br.com.vuaa.pessoa;

public abstract class Pessoa {
    private String nome;
    private int idade;
    private String cpf;

    public Pessoa(String name, int idade, String cpf) {
        this.nome = name;
        this.idade = idade;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}
