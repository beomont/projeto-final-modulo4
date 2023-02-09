package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GolsCampeonato {
    public static final String CSV_SEPARATOR = ",";

    //RETIRAR STATIC QUANDO REMOVER A MAIN
    static Path path = Paths.get("campeonato-brasileiro-gols.csv");

    public static void main(String[] args) {

        try (Stream<String> gols = Files.lines(path)) {

            List<String> linhas = gols.collect(Collectors.toList());
            List<Gol> listaGols = new ArrayList<>();


            for (String linha : linhas) {

                String[] dados = linha.split(CSV_SEPARATOR);

                Integer idPartida = Integer.parseInt(dados[0]);
                Integer rodada = Integer.parseInt(dados[1]);
                String clube = dados[2];
                String atleta = dados[3];
                String minutoPartida = dados[4];
                String tipoGol = dados[5];

                if (tipoGol != null) {
                    Gol gol = new Gol(idPartida, rodada, clube, atleta, minutoPartida, tipoGol);
                    listaGols.add(gol);
                } else {
                    Gol gol = new Gol(idPartida, rodada, clube, atleta, minutoPartida);
                    listaGols.add(gol);
                }

            }

            //TESTE BRUNO LOPES
            System.out.println("Lista com de atletas que fizeram gol");
            List<String> nomesDeAtletas = listaGols.stream().map(Gol::getAtleta)
                    .collect(Collectors.toList());
            System.out.println(nomesDeAtletas);

//            System.out.println("Mapa de nomes por id");
//            Map<Integer, String> nomePorId =
//                    listaDeFuncionarios.stream()
//                            .collect(Collectors.toMap(e -> e.getId(), e -> e.getNome()));
//
//            System.out.println(nomePorId);
//            //System.out.println(nomePorId.get(27830));
//
//            System.out.println("Funcionarios sexo masculino vs sexo Feminino");
//            Map<Boolean, List<Funcionario>> mapaFuncionariosParticionado = listaDeFuncionarios.stream()
//                    .collect(Collectors
//                            .partitioningBy(e -> e.getSexo().equals("M")));
//
//            System.out.println(mapaFuncionariosParticionado);


        } catch (
                IOException e) {

            e.printStackTrace();
        }
    }

}
