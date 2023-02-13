package org.example.controller;

import org.example.model.Partida;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EstadoJogos {
    private static final String ARQUIVO_PARTIDAS = "campeonato-brasileiro-full.csv";
    private static final String ASPAS_DUPLAS = "\"";
    private static final String VAZIO = "";
    private static final String SEPARADOR_COLUNAS = ",";

    public static void  mapaEstadoPartida ()  {
            Map<String, Integer> mapaEstados = new HashMap<>();//estrutura de dados;
            Map<String, Integer> mapaEstadosComMenJogos = new HashMap<>();//estrutura de dados;

        try {
            List<Partida> jogos = Files.lines(Paths.get(ARQUIVO_PARTIDAS))
                    .map(linha -> linha.replaceAll(ASPAS_DUPLAS, VAZIO))
                    .map(linha -> linha.split(SEPARADOR_COLUNAS))
                    .map(linha -> new Partida(linha))
                    .collect(Collectors.toList());
                        jogos.forEach(jogo -> {

                Integer valor = mapaEstados.get(jogo.getMandante_Estado()) == null
                        ? 1
                        : mapaEstados.get(jogo.getMandante_Estado()) + 1;

                mapaEstados.put(jogo.getMandante_Estado(), valor);
            });

            Integer minimo = mapaEstados.entrySet()
                    .stream()
                    .sorted(Map.Entry.comparingByValue())
                    .collect(Collectors.toList())
                    .get(1).getValue();

            for(Map.Entry<String, Integer> partida : mapaEstados.entrySet()) {
                if (partida.getValue() == minimo) {
                    mapaEstadosComMenJogos.put(partida.getKey(), partida.getValue());
                }
            }
            System.out.print("☑ ");
            System.out.println("Estado com menos jogos: ");
            for (Map.Entry<String, Integer> entry : mapaEstadosComMenJogos.entrySet()) {
                String chave = entry.getKey();
                Integer valor = entry.getValue();
                System.out.println("\t"+chave + " - " + valor);
            }
        }
        catch (IOException ioException) {
            System.err.println("Ocorreu um erro ao abrir o arquivo!");
            System.err.println(ioException.getMessage());
        }

    }
}
