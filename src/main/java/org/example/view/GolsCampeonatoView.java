package org.example.view;

import org.example.controller.GolsCampeonatoController;
import org.example.model.Gol;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class GolsCampeonatoView {

    public static void imprimeGolsAtleta() throws IOException {
        GolsCampeonatoController golsCampeonatoController = new GolsCampeonatoController();
        System.out.printf("O atleta %s obteve a maior pontuação, com %d Gols!\n", golsCampeonatoController.filtraAtletaComMaiorGol().getKey(), golsCampeonatoController.filtraAtletaComMaiorGol().getValue());


        List<Gol> gols = golsCampeonatoController.populaListaGols();

        Map<String, Long> jogadorQueMaisFezGolsPenaltis = golsCampeonatoController.jogadorQueMaisFezGolsPenaltis(gols);
        System.out.println("Jogador que mais fez gols de pênaltis: " + jogadorQueMaisFezGolsPenaltis.keySet().iterator().next() + " (" + jogadorQueMaisFezGolsPenaltis.values().iterator().next() + " gols)");

        Map<String, Long> jogadorQueMaisFezGols = golsCampeonatoController.jogadorQueMaisFezGolsContra(gols);
        System.out.println("Jogador que mais fez gols contra: " + jogadorQueMaisFezGols.keySet().iterator().next() + " (" + jogadorQueMaisFezGols.values().iterator().next() + " gols)");

    }



}
