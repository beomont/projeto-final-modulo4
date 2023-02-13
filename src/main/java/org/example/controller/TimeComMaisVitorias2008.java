package org.example.controller;


import org.example.model.TimesQueMaisVenceu2008;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TimeComMaisVitorias2008 {
    public static final String CSV_SEPARATOR = ",";

    public static List<TimesQueMaisVenceu2008> PegaTimeVencedor() throws IOException {
        Path path = Paths.get("campeonato-brasileiro-full.csv");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/M/yyyy");
        List<TimesQueMaisVenceu2008> listaTime = new ArrayList<>();

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


                TimesQueMaisVenceu2008 timesQueMaisVenceu2008 = new TimesQueMaisVenceu2008(id, rodada, data, mandante, visitante, vencedor);
                listaTime.add(timesQueMaisVenceu2008);
            }
        } catch (
                IOException e) {
            e.printStackTrace();
        }

        return  listaTime;
    }

    public Map<String, Long> PegaTimeQueMaisVenceu(Integer ano) throws IOException {

        List<TimesQueMaisVenceu2008> listaTime = PegaTimeVencedor();

        Map<String, Long> timeVencedor = listaTime.stream()
                .filter(e -> ano.equals(e.getData().getYear()))
                .filter(e -> !(e.getVencedor().equals("-")) )
                .collect(Collectors.groupingBy(TimesQueMaisVenceu2008::getVencedor, Collectors.counting()));

        return timeVencedor.entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new
                ));

    }
}