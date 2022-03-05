package br.com.vuaa.aeronave;

import br.com.vuaa.passageiro.Passageiro;
import br.com.vuaa.piloto.Piloto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Aeronave {
   private String modelo;
   private BigDecimal velocidadeMaximaEmKilometrosPorHora;
   private BigDecimal peso;
   private int maximoOcupantes;
   private Piloto piloto;
   private List<Passageiro> passageiros = new ArrayList<>();

   public Aeronave(String modelo, BigDecimal velocidadeMaximaEmKilometrosPorHora, BigDecimal peso, int maximoOcupantes,
                   Piloto piloto, List<Passageiro> passageiros) {
      this.modelo = modelo;
      this.velocidadeMaximaEmKilometrosPorHora = velocidadeMaximaEmKilometrosPorHora;
      this.peso = peso;
      this.maximoOcupantes = maximoOcupantes;
      this.piloto = piloto;
      this.passageiros = passageiros;
   }

   public String getPilotoNome() {
      return piloto.getNome();
   }

   public String getModelo() {
      return modelo;
   }

   public int getMaximoOcupantes() {
      return maximoOcupantes;
   }

   public Map<Integer, String> capacidadeDePassageirosPorModelo(List<Aeronave> aeronaves) {
      return aeronaves.stream().collect(Collectors.toMap(
              Aeronave::getMaximoOcupantes,
              Aeronave::getModelo
      ));
   }
}
