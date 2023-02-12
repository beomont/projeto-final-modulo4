package org.example.controller;

import org.example.model.PartidaComMaisGols;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PartidaGols {
    private static final String CSV_SEPARATOR = ",";

    public List<PartidaComMaisGols> PegaGolsPlacar() throws IOException {
        Path path = Paths.get("campeonato-brasileiro-full.csv");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/M/yyyy");
        List<PartidaComMaisGols> partidaGols = new ArrayList<>();

        try (Stream<String> partidas = Files.lines(path)) {

            List<String> linhas = partidas.map(s -> s.replaceAll("\"", "")).collect(Collectors.toList());
            linhas.remove(0);

            for (String linha : linhas) {
                String[] dados = linha.split(CSV_SEPARATOR);

                Integer id = Integer.parseInt(dados[0]);
                Integer rodada = Integer.parseInt(dados[1]);
                LocalDate data = LocalDate.parse(dados[2], formatter);
                String mandante = dados[4];
                String visitante = dados[5];
                String vencedor = dados[10];
                String arena = dados[11];
                Integer mandantePlacar = Integer.parseInt(dados[12]);
                Integer visitantePlacar = Integer.parseInt(dados[13]);
                String mandanteEstado = dados[14];
                String visitanteEstado = dados[15];

                PartidaComMaisGols partidaComMaisGols = new PartidaComMaisGols(id, rodada, data, mandante, visitante, arena, mandantePlacar, visitantePlacar, mandanteEstado, visitanteEstado);
                partidaGols.add(partidaComMaisGols);
            }
        } catch (
                IOException e) {
            e.printStackTrace();
        }


        return partidaGols;
    }

    public List<String> PegaMaiorPlacar() throws IOException {
        List<PartidaComMaisGols> partidaGols = PegaGolsPlacar();

        return partidaGols.stream()
                .max(Comparator.comparing(partidaComMaisGols -> (partidaComMaisGols.getMandantePlacar() + partidaComMaisGols.getVisitantePlacar())))
                .map(partida -> (partida.getMandante() + " " + partida.getMandantePlacar() + " X "
                        + partida.getVisitante() + " " + partida.getVisitantePlacar()))
                .stream().toList();

    }
}

