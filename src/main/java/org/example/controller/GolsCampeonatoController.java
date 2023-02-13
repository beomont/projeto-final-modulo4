package org.example.controller;

import org.example.model.Gol;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class GolsCampeonatoController {
    public static final String CSV_SEPARATOR = ",";


    public List<Gol> populaListaGols() throws IOException {
        Path path = Paths.get("campeonato-brasileiro-gols.csv");
        List<Gol> listaGols = new ArrayList<>();

        try (Stream<String> gols = Files.lines(path)) {
            List<String> linhas = gols.map(s -> s.replaceAll("\"", "")).collect(Collectors.toList());
            linhas.remove(0);

            for (String linha : linhas) {
                String[] dados = linha.split(CSV_SEPARATOR);
                if (dados.length == 6) {
                    Integer idPartida = Integer.parseInt(dados[0]);
                    Integer rodada = Integer.parseInt(dados[1]);
                    String clube = dados[2];
                    String atleta = dados[3];
                    String minutoPartida = dados[4];
                    String tipoGol = dados[5];

                    Gol gol = new Gol(idPartida, rodada, clube, atleta, minutoPartida, tipoGol);
                    listaGols.add(gol);
                } else {
                    Integer idPartida = Integer.parseInt(dados[0]);
                    Integer rodada = Integer.parseInt(dados[1]);
                    String clube = dados[2];
                    String atleta = dados[3];
                    String minutoPartida = dados[4];
                    Gol gol = new Gol(idPartida, rodada, clube, atleta, minutoPartida);
                    listaGols.add(gol);
                }
            }

        } catch (
                IOException e) {

            e.printStackTrace();
        }
        return listaGols;
    }

    public Map.Entry<String, Integer> filtraAtletaComMaiorGol() throws IOException {
        List<Gol> listaGols = populaListaGols();
        Map.Entry<String, Integer> atletaComMaxGol =  listaGols.stream()
                .collect(Collectors.groupingBy(Gol::getAtleta, Collectors.summingInt(i -> 1)))
                .entrySet().stream()
                .max(Comparator.comparing(Map.Entry::getValue)).get();
        return atletaComMaxGol;
    }

    public Map<String, Long> jogadorQueMaisFezGolsPenaltis(List<Gol> gols) {
        Map<String, Long> golsPenaltis = gols.stream()
                .filter(gol -> "Penalty".equals(gol.getTipoGol()))
                .collect(Collectors.groupingBy(Gol::getAtleta, Collectors.counting()));

        return golsPenaltis.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

    public Map<String, Long> jogadorQueMaisFezGolsContra(List<Gol> gols) {
        Map<String, Long> golsContra = gols.stream()
                .filter(gol -> "Gol Contra".equals(gol.getTipoGol()))
                .collect(Collectors.groupingBy(Gol::getAtleta, Collectors.counting()));

        return golsContra.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(6)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }





}
