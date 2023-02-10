package org.example.controller;

import org.example.model.Cartao;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CartoesCampeonato {

    private static final String ARQUIVO_CARTOES = "campeonato-brasileiro-cartoes.csv";
    private static final String ASPAS_DUPLAS = "\"";
    private static final String VAZIO = "";
    private static final String SEPARADOR_COLUNAS = ",";

    public static void mostrarJogadoresComMaisCartoes() {

        try {
            List<Cartao> cartoes = Files.lines(Paths.get(ARQUIVO_CARTOES))
                    .map(linha -> linha.replaceAll(ASPAS_DUPLAS, VAZIO))
                    .map(linha -> linha.split(SEPARADOR_COLUNAS))
                    .map(linha -> new Cartao(linha))
                    .collect(Collectors.toList());

            Map.Entry<String, Integer> entryMaxCartoesAmarelos = cartoes.stream()
                    .filter(cartao -> Cartao.TIPO_CARTAO_AMARELO.equals(cartao.getCartao()))
                    .collect(Collectors.groupingBy(Cartao::getAtleta, Collectors.summingInt(i -> 1)))
                    .entrySet().stream()
                    .max(Comparator.comparing(Map.Entry::getValue)).get();

            System.out.printf("O jogador com mais cartões amarelos foi: %s, com um total de %d cartões.\n",
                    entryMaxCartoesAmarelos.getKey(), entryMaxCartoesAmarelos.getValue());

            Map.Entry<String, Integer> entryMaxCartoesVermelhos = cartoes.stream()
                    .filter(cartao -> Cartao.TIPO_CARTAO_VERMELHO.equals(cartao.getCartao()))
                    .collect(Collectors.groupingBy(Cartao::getAtleta, Collectors.summingInt(i -> 1)))
                    .entrySet().stream()
                    .max(Comparator.comparing(Map.Entry::getValue)).get();

            System.out.printf("O jogador com mais cartões vermelhos foi: %s, com um total de %d cartões.\n",
                    entryMaxCartoesVermelhos.getKey(), entryMaxCartoesVermelhos.getValue());

        } catch (IOException ioException) {
            System.err.println("Ocorreu um erro ao abrir o arquivo!");
            System.err.println(ioException.getMessage());
        }
    }


}
