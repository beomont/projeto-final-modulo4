package org.example.view;

import org.example.controller.GolsCampeonatoController;

import java.io.IOException;
import java.util.Map;

public class GolsCampeonatoView {

    public static void imprimeAtletaComMaiorGol() throws IOException {
        GolsCampeonatoController golsCampeonatoController = new GolsCampeonatoController();
        System.out.printf("O atleta %s obteve a maior pontuação, com %d Gols!\n", golsCampeonatoController.filtraAtletaComMaiorGol().getKey(), golsCampeonatoController.filtraAtletaComMaiorGol().getValue());
    }

}
