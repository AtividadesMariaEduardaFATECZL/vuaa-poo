package br.com.vuaa;

import br.com.vuaa.aeronave.Aeronave;
import br.com.vuaa.aeroporto.Aeroporto;
import br.com.vuaa.passageiro.Passageiro;
import br.com.vuaa.piloto.Piloto;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Teste {
    public static void main(String[] args) {
        Piloto piloto = new Piloto("José da silva", 30, "768.986.90-89", "23982-1239", LocalDate.now());

        System.out.println(piloto.braveteEValido());

        Passageiro passageiro1 = new Passageiro("Madu do java", 22, "123.1237-90", "12390-123");
        Passageiro passageiro2 = new Passageiro("Bea", 21, "123.1237-90", "12390-123");

        System.out.println(passageiro1.podeEmbarcarSemAcompanhante());

        List<Passageiro> passageiros = new ArrayList<Passageiro>();
        passageiros.add(passageiro1);
        passageiros.add(passageiro2);

        Aeronave aeronave1 = new Aeronave("American Airlines", new BigDecimal("100"),
                new BigDecimal("100"), 100, piloto, passageiros);

        Aeronave aeronave2 = new Aeronave("Outra aeronave boladona", new BigDecimal("123"),
                new BigDecimal("190.89"), 190, piloto, passageiros);

        List<Aeronave> aeronaves = new ArrayList<>();
        aeronaves.add(aeronave1);
        aeronaves.add(aeronave2);

        Map<Integer, String> quantidadeDePassageiroPorAeronave = aeronave1.capacidadeDePassageirosPorModelo(aeronaves);

        System.out.println(quantidadeDePassageiroPorAeronave);

        Aeroporto aeroporto = new Aeroporto("São Paulo", "Rua genial", 12,
                3219L, aeronaves);


        List<String> nomeDosPilotos = aeroporto.achaTodosOsPilotos();

        System.out.println(nomeDosPilotos);
    }
}