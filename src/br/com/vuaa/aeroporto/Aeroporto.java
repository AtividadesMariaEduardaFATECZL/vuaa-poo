package br.com.vuaa.aeroporto;

import br.com.vuaa.aeronave.Aeronave;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Aeroporto {
    private String cidade;
    private String rua;
    private int numeroDoEdificio;
    private Long capacidadeDePassageiros;
    private List<Aeronave> aeronaves = new ArrayList<>();

    public Aeroporto(String cidade, String rua, int numeroDoEdificio, Long capacidadeDePassageiros, List<Aeronave> aeronaves) {
        this.cidade = cidade;
        this.rua = rua;
        this.numeroDoEdificio = numeroDoEdificio;
        this.capacidadeDePassageiros = capacidadeDePassageiros;
        this.aeronaves = aeronaves;
    }

    public List<String> achaTodosOsPilotos() {
        return this.aeronaves.stream().map(Aeronave::getPilotoNome).distinct().collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return "Aeroporto{" +
                "cidade='" + cidade + '\'' +
                ", rua='" + rua + '\'' +
                ", numeroDoEdificio=" + numeroDoEdificio +
                ", capacidadeDePassageiros=" + capacidadeDePassageiros +
                ", aeronaves=" + aeronaves +
                '}';
    }
}
