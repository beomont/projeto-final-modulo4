package org.example.view;

import org.example.controller.GolsCampeonatoController;
import org.example.model.Gol;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class GolsCampeonatoView {

    public static void imprimeGolsAtleta() throws IOException {
        GolsCampeonatoController golsCampeonatoController = new GolsCampeonatoController();
        System.out.print("☑ ");
        System.out.printf("O atleta %s obteve a maior pontuação, com %d Gols!\n", golsCampeonatoController.filtraAtletaComMaiorGol().getKey(), golsCampeonatoController.filtraAtletaComMaiorGol().getValue());


        List<Gol> gols = golsCampeonatoController.populaListaGols();

        Map<String, Long> jogadorQueMaisFezGolsPenaltis = golsCampeonatoController.jogadorQueMaisFezGolsPenaltis(gols);
        System.out.print("☑ ");
        System.out.print("Jogador que mais fez gols de pênaltis: ");
        jogadorQueMaisFezGolsPenaltis.forEach((jogador, qtdGols) -> System.out.println(jogador + " (" + qtdGols + " gols)"));

        Map<String, Long> jogadorQueMaisFezGolsContra = golsCampeonatoController.jogadorQueMaisFezGolsContra(gols);
        System.out.print("☑ ");
        System.out.println("Jogadores que mais fizeram gols contra: ");
        jogadorQueMaisFezGolsContra.forEach((jogador, qtdGols) -> System.out.println("\t"+jogador + " | " + qtdGols + " gols"));


    }



}
