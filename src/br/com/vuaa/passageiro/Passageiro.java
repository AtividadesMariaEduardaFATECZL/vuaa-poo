package br.com.vuaa.passageiro;

import br.com.vuaa.pessoa.Pessoa;

public class Passageiro extends Pessoa {
    private String numeroPassaporte;

    public Passageiro(String name, int idade, String cpf,String numeroPassaporte) {
        super(name,idade,cpf);
        this.numeroPassaporte = numeroPassaporte;
    }

    public boolean podeEmbarcarSemAcompanhante() {
        return this.getIdade() >= 18;
    }
}
