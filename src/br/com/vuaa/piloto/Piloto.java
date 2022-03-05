package br.com.vuaa.piloto;

import br.com.vuaa.pessoa.Pessoa;

import java.time.LocalDate;
import java.time.OffsetDateTime;

public class Piloto extends Pessoa {
    private String numeroDoBrevete;
    private LocalDate dataDeExpiracaoBrevete;

    public Piloto(String name, int idade, String cpf, String numeroDoBrevete, LocalDate dataDeExpiracaoBrevete) {
        super(name, idade, cpf);
        this.numeroDoBrevete = numeroDoBrevete;
        this.dataDeExpiracaoBrevete = dataDeExpiracaoBrevete;
    }

    public String braveteEValido() {
        if (this.dataDeExpiracaoBrevete.isBefore(LocalDate.now())) {
            return "Esse piloto não pode atuar pois está com o bravete vencido.";
        }
        return "Piloto pode atuar com seu bravete";
    }
}
